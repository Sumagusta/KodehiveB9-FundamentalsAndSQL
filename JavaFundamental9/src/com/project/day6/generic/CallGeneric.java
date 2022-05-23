package com.project.day6.generic;

import java.util.ArrayList;
import java.util.List;

public class CallGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericClass<Double> a = new GenericClass<>(90.5); 
		GenericClass<String> b = new GenericClass<>("90.5"); 
		
		System.out.println(a.get()*2);
		System.out.println(Double.valueOf(b.get())*2);
		
		List<Integer> dataA = new ArrayList<Integer>();
		List<String> dataB = new ArrayList<String>();
		List<Object> dataC = new ArrayList<Object>();
		
		
	}

}
