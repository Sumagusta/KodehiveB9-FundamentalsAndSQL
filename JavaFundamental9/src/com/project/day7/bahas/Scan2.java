package com.project.day7.bahas;

import java.util.Scanner;

public class Scan2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("inputan dengan spasi : ");
		String ab = sc.nextLine();
		System.out.println();
		
		System.out.print("inputan non spasi : ");
		String a = sc.next();
		

		System.out.println(a);
		System.out.println(ab);

		sc.close();

	}

}
