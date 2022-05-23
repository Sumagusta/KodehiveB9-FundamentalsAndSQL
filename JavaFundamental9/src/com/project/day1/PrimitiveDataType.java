package com.project.day1;

public class PrimitiveDataType {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variable boolean
		boolean a = true;
		Boolean b = false;
		
		// byte		
		//primitive
		byte by = -128;
		
		//reference
		Byte By = 127;
		System.out.println("Max Byte = "+Byte.MAX_VALUE); // run with shortcut f11
		
		//short
		short short0 = 0;
		Short short1 = null;
		System.out.println("Max Short = "+Short.MAX_VALUE); // run with shortcut f11
		
		//int
		int numb = 2147483647;
		Integer numb2 = 1000;
		System.out.println("Max Int = "+Integer.MAX_VALUE); // run with shortcut f11

		// int
		long long1 = 2147483648l;
		Long long2 = 9223372036854775807l;
		System.out.println("Max Long = "+Long.MAX_VALUE); // run with shortcut f11
		
		//floating-point
		float float1 = 3.4028235E38f;
		Float float2 = 1.5f;
		System.out.println("Max Float = "+Float.MAX_VALUE);
		
		double double1 = 1.7976931348623157E308;
		Double double2 = 1.7976931348623157E308;
		System.out.println("Max Double = "+Double.MAX_VALUE);
		
		int g = 3;
		System.out.println(g++ * 8 - 4);
	}

}
