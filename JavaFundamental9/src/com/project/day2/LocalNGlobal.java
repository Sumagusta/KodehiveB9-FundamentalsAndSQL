package com.project.day2;

public class LocalNGlobal {
	
	//global variable
	String var1 = "kipas";
	int price = 180000;
	
	private void storage1() {
		String a = "mask"; // local
		String b = "perabotan rumah tangga"; // local
		
		System.out.println(a);
		
		System.out.println(var1);
		System.out.println(price);
	}
	
	private void storage2() {
		String a = "sapu";
		System.out.println(a);
		
		System.out.println(var1);
		System.out.println(price);
	}

}
