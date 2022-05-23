package com.project.day6.polymorphism.overriding;

public class HalamanB extends HalamanA {
	
	public void download() {
		System.out.println(".pdf");
		System.out.println(".doc");
		System.out.println(".xlsx");
	}
	
	public void callDownloadHalA() {		
		super.download();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HalamanB a = new HalamanB();
		a.callDownloadHalA();
		System.out.println();
		a.download();
		
	}

}
