package com.learn.oop.exception;

public class TestingFinalBlock {
	public static void main(String[] args) {
		try {
			System.out.println("Interface the try block");
			
			int num = 100 / 0;
			System.out.println(num);
	
		}catch (NullPointerException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("this bit is executed regardation of the exception occuring or not");
		}
		System.out.println("continue");
	}

}
