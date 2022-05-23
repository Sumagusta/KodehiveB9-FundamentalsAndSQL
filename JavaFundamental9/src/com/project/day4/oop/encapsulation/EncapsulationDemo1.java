package com.project.day4.oop.encapsulation;

public class EncapsulationDemo1 {
	
	// attribute / properties / data member
	private int angka1;
	private String text;
	private Double angkaDes;
	
	public int getAngka1() {
		return angka1;
	}
	
	public void setAngka1(int angka1) {
		this.angka1 = angka1;
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public Double getAngkaDes() {
		return angkaDes;
	}
	
	public void setAngkaDes(Double angkaDes) {
		this.angkaDes = angkaDes;
	}

	public static void main(String[] args) {
		// TODO Auto-generated metho
		
		EncapsulationDemo1 e = new EncapsulationDemo1();
		e.setAngka1(90);
		System.out.println(e.getAngka1());
		
		
	}

}
