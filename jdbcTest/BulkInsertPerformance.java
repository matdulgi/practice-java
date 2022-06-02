package jdbcTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BulkInsertPerformance {
    public static void main(String[] args) {
        int loop = 1000;
        Test test = new Test();
//        test.testPerformance0(loop);
        //
//        test.testPerformance1(loop);

//        insert everytime
        test.testPerformance2(loop);
//        mysql bulk insert
        test.testPerformance3(loop);
//        jdbc batch insert
        test.testPerformance4(loop);
    }

    static class Test{
        String url="jdbc:mariadb://epm-001:3306/oidev5";
        String driverClassName="org.mariadb.jdbc.Driver";
        String username="oidev";
        String password="hello.oidev";


        DataSource datasource;

        Test() {
            try {
                Class.forName(driverClassName);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }


        //

        public void testPerformance0(int loop){
            String sql = genInsertSQL();

            System.out.println("insert everytime - create connection everytime");
            long before = System.currentTimeMillis();
            for (int i = 0; i < loop ; i++) {
                try (Connection connection = DriverManager.getConnection(url, username, password);
                     Statement statement = connection.createStatement();) {
                    statement.execute(sql);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            long after = System.currentTimeMillis();
            System.out.println(after-before +" : millis");
        }

        public void testPerformance1(int loop){
            System.out.println("insert everytime - poll connection everytime");
            String sql = genInsertSQL();
            long before = System.currentTimeMillis();
            for (int i = 0; i < loop; i++) {
                try (Connection connection = datasource.getConnection();
                     Statement statement = connection.createStatement(); )
                {
                    statement.execute(sql);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            long after = System.currentTimeMillis();
            System.out.println(after-before +" : millis");
        }

        public void testPerformance2(int loop){
            System.out.println("insert everytime");
            String sql = genInsertSQL();
            try (Connection connection = datasource.getConnection();
                 Statement statement = connection.createStatement(); )
            {
                long before = System.currentTimeMillis();
                for (int i = 0; i < loop; i++) {
                    statement.execute(sql);
                }
                long after = System.currentTimeMillis();
                System.out.println(after-before +" : millis");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public void testPerformance3(int loop){
            System.out.println("mysql bulk insert");
            String sql = "";
            for (int i = 0; i < loop; i++) {
                sql = genBulkInsertSQL(sql);
            }
            try (Connection connection = datasource.getConnection();
                 Statement statement = connection.createStatement(); )
            {
                long before = System.currentTimeMillis();
                statement.execute(sql);
                long after = System.currentTimeMillis();
                System.out.println(after-before +" : millis");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


        public void testPerformance4(int loop){
            System.out.println("jdbc batch insert");
            String sql = genInsertSQL();

            try (Connection connection = datasource.getConnection();
                 Statement statement = connection.createStatement(); )
            {
                for (int i = 0; i < 100; i++) {
                    statement.addBatch(sql);
                }
                long before = System.currentTimeMillis();
                statement.executeBatch();
                long after = System.currentTimeMillis();
                System.out.println(after-before +" : millis");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public String genInsertSQL(){
            return "insert into performance_insert (column2, column3) values ('hello', 'world')";
        }

        public String genBulkInsertSQL(String sql){
            if (sql.equals("")){
                sql = "insert into performance_insert (column2, column3) values ('hello', 'world')";
            } else{
                sql = sql + ",('hello', 'world')";
            }
            return sql;
        }
    }

}
