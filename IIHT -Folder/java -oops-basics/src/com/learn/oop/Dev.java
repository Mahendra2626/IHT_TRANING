package com.learn.oop;

class Employees {
	Integer BaseSalary = 5000;

}

 public class Dev extends Employees{
	 Integer Bonus = 25000;
	 Integer total = Bonus + BaseSalary;
	 public static void main(String[] args) {
		 Dev Nisha = new Dev();
		 System.out.println("Total salary of Nisha is " + Nisha.total);
	 }
 }
