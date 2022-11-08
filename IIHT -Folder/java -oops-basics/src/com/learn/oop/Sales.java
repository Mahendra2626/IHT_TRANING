package com.learn.oop;

public class Sales extends Employee {
	Integer Bonus = 10000;
	Integer insentive ;
	
	void Working() {
		System.out.println("Employe is a part of sales team tehy are working");
	}
	
	public static void main(String[] args) {
		Sales Ashish = new Sales();
		Ashish.insentive = 2000;
		Ashish.TotalSalary (Ashish.BaseSalary, Ashish.Bonus, Ashish.insentive);
		Ashish.Working();
		
	}

}
