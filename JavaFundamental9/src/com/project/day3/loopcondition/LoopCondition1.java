package com.project.day3.loopcondition;

public class LoopCondition1 {

	public static void main(String[] args) {

		for (int i = 0; i < 6; i++) {
			
			if (i % 2 == 0) {
				System.out.println("Nilai Genap " + i);
				if (i != 2) {
					System.out.println("selain angka 2");
					// habis dibagi 2 dan tidak sama dengan 0
					if (i != 0 && i%2==0) {
						System.out.println("Angka unik");
					}
				}
			} else {
				System.out.println("Nilai Ganjil " + i);
			}
			System.out.println();
		}

	}

}
