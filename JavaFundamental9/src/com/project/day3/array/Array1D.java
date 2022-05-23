package com.project.day3.array;

public class Array1D {

	public static void main(String[] args) {
		
		//int arr1 =1;
		
		int[] arr = { 1, 2, 3, 4, 5 };
		
		String[] arr2 = {"21","20","15"};
		
		int[] arr3 = new int[arr2.length];
		
		for (int i = 0; i < arr2.length; i++) {
			arr3[i] = Integer.valueOf(arr2[i]);
			System.out.print(arr3[i]*2+" ");
		}
		
		//array size
		int[] arrSize = new int[4];
		
		arrSize[0] = 24;
		arrSize[1] = 25;
		arrSize[2] = 28;
		arrSize[3] = 29;
		
		System.out.println("\n");
		for (int i = 0; i < arrSize.length; i++) {
			System.out.print(arrSize[i]+" ");
		}
		
		System.out.println("\n");
		
		int[] arrSizeNew = new int[arrSize.length];
		arrSizeNew[0] = arrSize[0];
		arrSizeNew[1] = arrSize[1];
		arrSizeNew[2] = arrSize[3];
		
		for (int i = 0; i < arrSizeNew.length-1; i++) {
			System.out.printf(arrSizeNew[i]+" ");
		}
		

	}

}
