package com.learn.oop;

public class Employee {
	Integer BaseSalary = 50000;
	void TotalSalary (Integer BS, Integer Bonus) {
		Integer total = BS + Bonus;
		System.out.println(total);
	}
	
	void TotalSalary (Integer BS, Integer Bonus, Intger  insentive) {
		Integer total = BS + Bonus + insentive;
		System.out.println(total);
	}
	
	void Working() {
		System.out.println("Employe is working");
	}

}
