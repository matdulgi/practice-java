package com.dulgi.practice.java.arrayTest;

public class arrayTest1 {
	public static void main(String[] args) {
		//length? size? 테스트
		int[] arr1 = {1, 2, 3};
		System.out.println(arr1.length);
		
		//값을 덜 채웠을 때의 length
		int[] arr2 = new int[10];
		arr2[0] = 1;
		arr2[1] = 2;
		arr2[2] = 3;
		System.out.println(arr2.length);
		//얄짤 없이 생성시 크기 그대로이다
	}
}
