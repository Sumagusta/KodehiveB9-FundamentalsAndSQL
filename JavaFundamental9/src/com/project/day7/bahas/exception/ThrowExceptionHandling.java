package com.project.day7.bahas.exception;

public class ThrowExceptionHandling {

	public static void checkNum(int num){  
        if (num < 1) {  
            throw new ArithmeticException("\nNumber is negative, cannot calculate square");  
        }  
        else {  
            System.out.println("Square of " + num + " is " + (num*num));  
        }  
    }  
    //main method  
    public static void main(String[] args) {  
    	ThrowExceptionHandling obj = new ThrowExceptionHandling();  
    	try {
    		obj.checkNum(-3);  
		} catch (Exception e) {
			System.out.println(e);
		}
            
            System.out.println("Rest of the code..");  
    } 

}
