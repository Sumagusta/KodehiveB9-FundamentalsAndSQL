package com.project.day4.oop.instance;

public class InstanceObject {

	public void makananRingan() {
		System.out.println("Snack");
		System.out.println("Roti");
	}
	
	protected void minuman() {
		System.out.println("AQui");
		System.out.println("Teh Pocong");
	}
	
	private void perabotan() {
		System.out.println("Almari");
		System.out.println("Kasur");
	}
	
	public static void main(String[] args) {

		InstanceObject io = new InstanceObject();
		
		io.makananRingan();
		io.minuman();
		io.perabotan();
	}

}
