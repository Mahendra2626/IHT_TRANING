package com.learn.oop;

public class Tv {
	String Brand;
	String ModelName;
	Integer scrrenSize;
	Integer price;
	String color;
	String DisplayType;
	
	void insertData(String B, String Mn, Integer ss, Integer p, String c, String dt) {
		Brand = B;
		ModelName = Mn;
		screenSize = ss;
		price = p;
		color = c;
		DisplayType = dt;
		
	}
	
	void displayTV() {
		System.out.println(Brand + "" + ModelName);
	}
	
	public static void main(String[] args) {
		
		TV lgOled = new Tv();
		TV SamsungFrame new Tv();
		
	    lgOled.Brand = "LG";
		lgOled.ModelName = "4k oled 75 tv";
		lgOled.screenSize = 75;
		lgOled.price = 75000;
		lgOled.color = "black";
		lgOled.DisplayType = "OLED";
		
		SamsungFrame.insertData("Samsung", "65 Frame TV", 65, 120000, "Beige", "LED");
		lgOled.displayTV
		
		System.out.println(lgOled.Brand + " " + lgOled.ModelName);
		
	}
}
