package com.project.day5.inheritance;

public class OrangTua {
	
	public void aset1() {
		System.out.println("Motor");
	}

	protected void aset2() {
		System.out.println("Emas 24 karat");
	}
	
	private void aset3() {
		System.out.println("Mobil");
	}
	
	public static void main(String[] args) {
		OrangTua ot = new OrangTua();
		ot.aset3();
	}
	
}
