package com.dulgi.practice.java.array;

public class BasicArrayEx {
	public static void main(String[] args) {
		//값을 덜 채웠을 때의 length
		int[] arr1 = new int[10];
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		System.out.println(arr1.length);
		// 얄짤 없이 생성시 크기 그대로이다


		// assign other array
		int[] arr2a = {1, 2, 3};
//		arr2 = {2, 3, 4};

//		{1, 3, 3} is initialize statement
		int[] arr2b = {3, 4, 5};
		arr2a = arr2b;
		int[] arr2c = {4, 5, 6, 7};
		arr2a = arr2c;
//		it's allowed to assign different size array



		// final array
		final int[] arr3 = {1, 2, 3};
		arr3[1] = 1;
		for (int i : arr3 ) {
			System.out.println(i);
		}
//		arr3 = arr2a; not allowed
		// like any other objects, final array cannot be assigned to reference other one
		// but, it's allowed to assign each element
	}
}
