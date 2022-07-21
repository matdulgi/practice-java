package com.dulgi.practice.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class PolymorphismTest {
	public static void main(String[] args) {

		//Collection에 ArrayList 저장
		Collection<String> collection;
		collection = new ArrayList<String>();
		collection.add("hello");
		collection.add("world");
		collection.add("have");
		collection.add("a");
		collection.add("good");
		collection.add("day");
		for(String str:collection) {
			System.out.println(str);
		}
		
		//과연 저장된 후에 다른 값으로 변환이 될까?
		HashSet<String> hashSet = (HashSet<String>)collection;
		for(String str:hashSet) {
			System.out.println(str);
		}
		//안된다
	}
}
