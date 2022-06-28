package com.dulgi.practice.java.collectionTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public LinkedHashSetTest() {
	}
	//hashSet과 LinkedHashSet 는 대체 무슨 차이일까?
	//Linked라는 키워드를 보면 자료들이 서로서로 연결되어 있다는 뜻이다.
	//즉, linkedHashSet은 set으로서 자료의 중복을 허용하지 않으면서 순서를 보장한다
	public static void main(String[] args) {
		HashSet hashSet = new HashSet();

		hashSet.add(13);
		hashSet.add(25);
		hashSet.add(31);
		hashSet.add(42);
		hashSet.add(55);
		System.out.println("hashset");
		hashSet.forEach(e->System.out.println(e));
		System.out.println();

		System.out.println("----------");
		
		
		LinkedHashSet linkedHashSet = new LinkedHashSet();
		linkedHashSet.add(13);
		linkedHashSet.add(25);
		linkedHashSet.add(31);
		linkedHashSet.add(42);
		linkedHashSet.add(55);
		System.out.println("linkedHashSet");
		linkedHashSet.forEach(e->System.out.println(e));
		System.out.println();
		
	}

}
