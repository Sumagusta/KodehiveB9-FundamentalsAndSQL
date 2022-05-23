package com.project.day3.array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList1 {

	public static void main(String[] args) {
		
		// instance object
		ArrayList<Integer> deret = new ArrayList<Integer>();
		
		deret.add(200);
		deret.add(400);
		deret.add(500);
		
		for (int i = 0; i < deret.size(); i++) {
			System.out.println(deret.get(i));
		}
		
		deret.add(1, 800);
		System.out.println();
		for (int i = 0; i < deret.size(); i++) {
			System.out.println(deret.get(i));
		}
		System.out.println("\nLIST\n");
		// list
		
		List<Integer> deretList = new ArrayList<Integer>();
		
		deretList.add(305);
		deretList.add(405);
		deretList.add(605);
		
		for (int i = 0; i < deretList.size(); i++) {
			System.out.println(deretList.get(i));
		}
		
		System.out.println("\nCollection\n");
		// collection
		
		Collection<Integer> deretCol = new ArrayList<Integer>();
		
		deretCol.add(333);		
		System.out.println(deretCol.getClass());
	}

}
