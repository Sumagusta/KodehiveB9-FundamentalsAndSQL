package com.project.day3.loopcondition;

public class NestedLoop {

	public static void main(String[] args) {

		int num = 5;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println("i :"+i);
				System.out.println("j :"+j);
				// num = num + 5
				System.out.println(num+=5);
			}
		}

	}

}
