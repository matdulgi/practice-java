package com.dulgi.practice.java.collectionTest;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListTest {

	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();

		for (int i = 1; i < 15; i++) {
			arrayList.add(i);
			copyOnWriteArrayList.add(i);
		}

		Iterator itr1 = arrayList.iterator();
		Iterator itr2 = copyOnWriteArrayList.iterator();

		// 기본적으로 향상된 for문(for-each)는 내부적으로 iterator를 사용한다.
		// 즉, 다음 값을 참조하여 있으면 가져오는 것이다
		// 그리고 도중 요소가 추가되거나 제거되면 ConcurrentModificationException을 발생시킨다
		// 반복자라는게 결국 모든 값을 순회하는 것인데, 아마 현재 위치는 index로 관리되겠지.
		// 그래서 값이 하나 줄거나 늘어나면, 같은 값을 반복해서 가져오거나, 무한으로 가져오는 경우가 발생할 수 있는 것이다
		// 그렇기에 iterator는 커서를 사용하여 커서를 통해서만 삭제나 변경 등을 허용한다
		// 만약 커서를 이용하지 않고 컬렉션 객체를 직접 가져와서 추가 제거 등을 하면 바로 예외가 발생한다
		// 즉, 반복 인덱스가 존재하지 않고 다음 값을 가져오기 때문에 이러한 점들이 발생하는 것으로
		// index가 정해진 for문 등에는 발생하지 않는다
		
		System.out.println();
		
		
		//ArrayList의 경우
		try {
			int index = 0;
			while (itr1.hasNext()) {
				Object temp = itr1.next();
				//
				//
				System.out.println("index : " + index + " value : "+temp);

				if (index == 3) {
//					arrayList.remove(index);
				}

				index++;
			}
		} catch (ConcurrentModificationException e) {
			System.out.println("도중 인덱스가 변경되었습니다");
		}

		//인덱스가 정해져있는 일반 for문
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.print("index : " + i);
			System.out.println(" value : " + arrayList.get(i));
			if (i == 5) {
				System.out.println("!");
				arrayList.remove(i);
				System.out.println(i + "번 값을 삭제합니다");
			}
		}
		
		
		//copyOnWriteArrayList의 경우
		System.out.println();
		System.out.println("copyOnWriteArray Iterate Test");
		try {
			int index = 0;
			while (itr2.hasNext()) {
				Object temp = itr2.next();
				System.out.println("index : " + index + " value : "+temp);

				if (index == 3) {
					copyOnWriteArrayList.remove(3);
					System.out.println(index + "번 값을 삭제합니다");;
				}

				index++;
			}
		} catch (ConcurrentModificationException e) {
			System.out.println("도중 인덱스가 변경되었습니다");
		}

		//신기하게도 해당 컬렉션에서는 예외가 발생하지 않는다.
		//구동 원리를 알아보아야ㅐ겠다
	}

}
