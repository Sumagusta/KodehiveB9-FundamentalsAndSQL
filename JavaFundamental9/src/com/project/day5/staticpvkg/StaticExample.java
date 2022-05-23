package com.project.day5.staticpvkg;

public class StaticExample {
	
	static int usia; // satu memory
	
	String nama;
		
	static class Main{
		public static void main(String[] args) {
			
			StaticExample st = new StaticExample();
			StaticExample st2 = new StaticExample();
			
			
			st.usia = 90;
			st2.usia = 95;
			
			StaticExample.usia = 900;
			usia = 80;
			
			System.out.println("age 1 : "+st.usia+" \n"+"age 2 : "+st2.usia);
		}
	}
}


