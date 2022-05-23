package com.project.day5.inheritance.implement;

public class Client1 implements Server {

	@Override
	public void ipAddress() {
		System.out.println("192.168.8.8");
	}

	@Override
	public void gateway() {
		// TODO Auto-generated method stub
		System.out.println("192.168.1.1");
	}

	@Override
	public void dns() {
		// TODO Auto-generated method stub
		System.out.println("127.0.0.1");
	}

	@Override
	public void nama() {
		// TODO Auto-generated method stub
		
	}
	

}
