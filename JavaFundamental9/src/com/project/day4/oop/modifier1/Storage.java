package com.project.day4.oop.modifier1;

public class Storage {

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
		Storage st = new Storage();
		st.perabotan();
	}

}
