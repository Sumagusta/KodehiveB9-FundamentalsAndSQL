package com.project.day8.rekursif;

public class Rekursif2 {

	// rekursif bercabang
	private static int rekursifFibonachi(int ukuran, String ranting) {
		
		System.out.println("Ranting ke "+ranting);
		System.out.println("Fibonachi ke "+ukuran);
		System.out.println();
		
		if (ukuran == 0 || ukuran == 1) {
			return ukuran;
		} 
		
		return rekursifFibonachi(ukuran - 1, "kiri") + rekursifFibonachi(ukuran - 2, "kanan");
	}

	public static void main(String[] args) {
		 int data = rekursifFibonachi(8, "atas");
		 
		 System.out.println("nilai fibo ke "+data);
	}

}
