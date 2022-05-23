package com.project.day4;

public class BahasSoal5 {

	public static void main(String[] args) {

		// 2 4 4 4 6 6 6 6 6
		
		int size = 9;
		int ganjil = 1;
		int genap = 2;
		
		
		int[] bilGanjil = new int[size];
		int[] bilGenap = new int[size];
		int[] bilDeret = new int[size];
		
		int indexBil = 0;
		int deret = 0;
		
		for (int i = 0; i < bilDeret.length; i++) {
			bilGanjil[i] = ganjil;
			ganjil+=2;
			
			bilGenap[i] = genap;
			genap+=2;
			
			if (indexBil < size) { // set iterasi secara ganjil, namun value genap
				for (int j = 0; j < bilGanjil[i]; j++) {
					deret = bilGenap[i];
					bilDeret[indexBil] = deret;
					indexBil += 1;
				}
			}
		}
		
		for (int j = 0; j < bilDeret.length; j++) {
			System.out.print(bilDeret[j]+" ");
		}
	}
}
