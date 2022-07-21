package com.dulgi.practice.java.collection;

import java.util.Stack;

public class StackTest {

	public StackTest() {
	}
	//stack에는 vector의 메소드 add, get, remove
	//stack의 메소드 push, peek, pop, search가 존재한다
	//서로 혼용도 가능하다
	//
	public static void main(String[] args) {
		Stack stack = new Stack<>();
		Stack stack2 = new Stack<>();
		stack.add("add");
		stack.push("push");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}
}
