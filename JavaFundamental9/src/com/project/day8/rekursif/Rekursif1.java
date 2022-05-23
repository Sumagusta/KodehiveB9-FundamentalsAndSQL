package com.project.day8.rekursif;

public class Rekursif1 {
	
	// rekursif method, memanggil dirinya sendiri terus menerus hingga pada kondisi tertentu 
	public static int menghitung(int n) {
		System.out.println(n);
		if (n == 1) {
			return 8;
		}
		return menghitung(n-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for (int i = 100000; i > 0; i--) {
//			System.out.println(i);
//		}
		
		System.out.println(menghitung(10));
	}

}
