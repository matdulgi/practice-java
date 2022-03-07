package exeptionHandling;


public class IteratorExceptionHandling {
    public static void main(String[] args) {
        IteratorExceptionHandling iteratorExceptionHandling = new IteratorExceptionHandling();
        try {
            iteratorExceptionHandling.iterate();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ;
    }

    private void iterate() throws InterruptedException {
        int i = 0;

        while(i < 10){
            print(i++);
            Thread.sleep(200);
        }

    }

    private void print(int i){


        try {
            throwException(i);
            System.out.println(i);
        } catch (RuntimeException e){
        }
    }

    private void throwException(int i){
        if (i == 5){
            throw new RuntimeException();
        }

    }


}
