package com.project.day8.bahasweek2.samepckg;

public class Main {
	
	private static void bio(String nama, String npm, int nilai_mtk, int nilai_bi, int nilai_pbo) {
		System.out.println("Nama:\t"+nama);
		System.out.println("NPM:\t"+npm);
		System.out.println("Mtk:\t"+nilai_mtk);
		System.out.println("Bi:\t"+nilai_bi);
		System.out.println("PBO:\t"+nilai_pbo);
		int rata = (nilai_mtk+nilai_bi+nilai_pbo) / 3;
		System.out.println("Rata-Rata:\t"+rata);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("CARA A");
		bio("Krisna", "14.0.0.01", 30, 90, 80);
		
		System.out.println("CARA B");
		Bio b = new Bio();
		b.bio("Krisna", "14.0.0.01", 30, 40, 80);

	}

}
