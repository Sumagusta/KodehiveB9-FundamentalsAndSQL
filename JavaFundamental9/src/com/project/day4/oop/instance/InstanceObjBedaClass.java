package com.project.day4.oop.instance;

import com.project.day4.oop.encapsulation.EncapsulationDemo1;

public class InstanceObjBedaClass {

	public static void main(String[] args) {

		EncapsulationDemo1 e1 = new EncapsulationDemo1();
		e1.setText("Hari Senin");
		String textLain = e1.getText();
		
		System.out.println(textLain);

	}

}
