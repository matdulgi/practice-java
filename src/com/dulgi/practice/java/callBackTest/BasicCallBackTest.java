package com.dulgi.practice.java.callBackTest;

import java.util.Scanner;

//caller
public class BasicCallBackTest {
    public static void main(String[] args) {
        new Tester().caller();
    }
}

// caller는 callee의 메소드를 실행한다
// 실행하면서 매개변수를 즉석에서 만든다
// callback 메소드가 시작되고,

// callee에는 callback을 포함한 로직을, caller에는 callback의 로직을 구현한다.
// 로직은 callee 메소드의 내부가 아닌 caller에 구현한다
// ! callee의 로직을 하나도 바꾸지 않고 동작을 결정할 수 있다.
// caller에서 callee의 메소드를 실행하면
// callee의 로직이 실행되다가
// callee의 로직이 끝나면



class Tester{
    public void caller(){
        System.out.println("caller start");
        System.out.println("listen message");

        while(true){
        callee(
            new CallBack() { @Override
                public void action(String str) {
                    System.out.println(str);
                }
            }
        );
        System.out.println("caller end");
        }
    }

// callback 메소드를 받아 로직실행
    public void callee(CallBack callback){
        System.out.println("callee start");
        System.out.println("on input Message");

        Scanner scanner = new Scanner(System.in);
        System.out.print("input : ");
        String msg = scanner.nextLine();
        callback.action(msg);
        System.out.println("callee end");
    }
}


@FunctionalInterface
interface CallBack{
    void action(String str);
}
