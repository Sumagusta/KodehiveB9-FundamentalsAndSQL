package com.project.day9.bahasLogical3;

import java.util.Random;
import java.util.Scanner;

public class GameTangga {
	
	static Random rand= new Random();
	
	public static boolean inputPermainan(int lompatan, int[] tangga) {
		
		return permainan(lompatan, tangga, rand.nextInt((1)+1));
	}
	
	public static boolean permainan(int lompatan, int[] tangga, int i) {
		
		if (i >= tangga.length) {
			return true;
		}else if (i < 0 || tangga[i] == 1) {
			return false;
		}
		
		tangga[i] = 1;
		
		return permainan(lompatan, tangga, i+lompatan) || 
				permainan(lompatan, tangga, i+1) || 
				permainan(lompatan, tangga, i-1);
		
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int q = scan.nextInt(); // jumlah permainan
		
		while (q-- > 0) {
			int jumlahAnakTangga = scan.nextInt();
			int lompatan = scan.nextInt();
			
			int[] tangga = new int[jumlahAnakTangga];
			for (int i = 0; i < tangga.length; i++) {
				tangga[i] = rand.nextInt(2);
			}
			
			System.out.println((inputPermainan(lompatan, tangga)) ? "MENANG":"KALAH");
			
		}
		
		scan.close();

	}

}
