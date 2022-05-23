package com.project.day6.abstractclass;

public class Pembeli extends Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pembeli p = new Pembeli();
		p.makanan();
		p.minuman();
		
	}

	@Override
	public void makanan() {
		System.out.println("Roti Bakar");
	}

	@Override
	public void minuman() {		
		System.out.println("Boba");		
	}

}
