package com.project.day2;

public class StringBufferModif {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Test1");
		sb.append(" dan Test2");
		
		String a = "Test1";
		String b = " dan Test2";
		
		System.out.println("String biasa / non-primitive : "+ a+b);
		
		System.out.println("String Buffer : "+sb);
	}

}
