package com.dulgi.practice.java.collectionTest;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;

public class LinkedListTest {

	public LinkedListTest() {
	}

	public static void main(String[] args) {

		// LinkedList를 사용해보자.. 어떤 장점이 있을까
		// ArrayList와 비교했을 때
		// 참조시간은 인덱스를 사용하는 ArrayList가 당연히 빠를 것이고..
		// 제거 시간은 linkedList가 당연히 빠르겠지
		LinkedList linkedList = new LinkedList<>();
		ArrayList arrayList = new ArrayList<>();
		for (int i = 1; i <= 1000000; i++) {
			linkedList.add(i);
			arrayList.add(i);
		}

		// 참조실험
		long linkedListGetTime = System.currentTimeMillis();
		for (int i = 0; i < 100; i++) {
			linkedList.get(800000);
		}
		System.out.print("LinkedList의 참조 시간");
		System.out.println((System.currentTimeMillis() - linkedListGetTime) * 0.001 + "초");
		long arrayListGetTime = System.currentTimeMillis();
		for (int i = 0; i < 100; i++) {
			arrayList.get(800000);
		}
		System.out.print("ArrayList의 참조 시간");
		System.out.println((System.currentTimeMillis() - arrayListGetTime) * 0.001 + "초");

		// 제거실험
		long linkedListRemoveTime = System.currentTimeMillis();
		for (int i = 0; i < 100; i++) {
			linkedList.remove(3);
		}
		System.out.print("LinkedList의 제거 시간");
		System.out.println((System.currentTimeMillis() - linkedListRemoveTime) * 0.001 + "초");

		long arrayListRemoveTime = System.currentTimeMillis();
		for (int i = 0; i < 100; i++) {
			arrayList.remove(3);
		}
		System.out.print("ArrayList의 제거 시간");
		System.out.println((System.currentTimeMillis() - arrayListRemoveTime) * 0.001 + "초");
		
		
		
		//비고
		//뭐 당연한 결과가 나왔지만... LinkedList를 사용해봤다는 점과 System.currentTikmeMillis와 Calendar등 시간 데이터를 사용해 봤다는 점에 의의
	}
}
