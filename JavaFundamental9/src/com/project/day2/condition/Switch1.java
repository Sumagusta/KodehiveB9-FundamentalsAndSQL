package com.project.day2.condition;

public class Switch1 {
	
	public static void main(String[] args) {
		
		int bulan = 1;
		switch (bulan) {
		case 1:
			int hari = 1;
			for (int i = 0; i < 3; i++) {
				System.out.println("Hari "+hari);
				hari++;
			}
			break;
		case 2:
			System.out.println("Februari");
			break;
		default:
			System.out.println("Tidak ada bulan yang sesuai");
			break;
		}
	}
}
