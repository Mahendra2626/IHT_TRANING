package com.learn.oop.abstraction;

public class NishanthTech implements ITCompanies {
	
	public void Working() {
		System.out.println("Nishant tech is working on a java project");
	}
	
	public static void main(String[] args) {
		NishanthTech SMS = new NishanthTech();
	    SMS.Working();	
	}
}
