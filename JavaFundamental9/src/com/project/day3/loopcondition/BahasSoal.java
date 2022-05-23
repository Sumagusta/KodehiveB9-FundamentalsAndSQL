package com.project.day3.loopcondition;

public class BahasSoal {

	public static void main(String[] args) {
		
		int nilai = 80;

		String convert = Integer.toBinaryString(nilai); // 110

		char[] ch = new char[convert.length()];
		int[] biner = new int[convert.length()];

		for (int i = 0; i < convert.length(); i++) {
			ch[i] = convert.charAt(i);
			biner[i] = Character.getNumericValue(ch[i]);

			if (biner[i] == 1) {
				biner[i] = biner[i] * 0;
			} else {
				biner[i] = biner[i] + 1;
			}
		}

		System.out.println("Input nilai \t\t\t: " + nilai);
		System.out.println("Hasil Konversi ke Biner \t: " + convert);

		System.out.print("Setelah Biner angkanya dibalik \t: ");
		for (int i = 0; i < biner.length; i++) {
			System.out.print(biner[i]);
		}

	}

}
