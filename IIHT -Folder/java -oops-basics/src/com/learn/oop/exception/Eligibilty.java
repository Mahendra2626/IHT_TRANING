package com.learn.oop.exception;

public class Eligibilty {

public static void Eligible(Integer Exp) {
	if (Exp < 10) {
		throw new ArithmeticException("This person is not eligible to be Senior System lead");
	} else {
		System.out.println("This perosn is eligible");
	}
}
public static void main(String[] args) {
	Eligible(9);
}
}
