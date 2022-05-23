package com.project.day5.methodfunction;

import java.util.ArrayList;
import java.util.List;

public class MethodFungsi {

	public static int penjumlahan() {

		int a = 10, b = 9;
		int result = a + b;
		return result;
	}

	public static void pengurangan() {
		int a = 2, b = 5;

		int result = b - a;
		System.out.println(result);
	}
	
	public static String[] toys() {
		
		String[] toys = new String[3];
		toys[0] = "Boneka";
		toys[1] = "Truk Mainan";
		toys[2] = "Pedang Ultraman";
		return toys;		
	}
	
	public static List<Integer> himpunan() {
		List<Integer> tampungan = new ArrayList<Integer>();
		tampungan.add(20);
		tampungan.add(23);
		tampungan.add(22);
		tampungan.add(24);
		
		return tampungan;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		//System.out.println(penjumlahan()*penjumlahan()%2+penjumlahan()/2);
		
		for (int i = 0; i < toys().length; i++) {
			System.out.println(toys()[i]);
		}

		for (int i = 0; i < himpunan().size(); i++) {
			System.out.println(himpunan().get(i)
					);
		}

	}

}
