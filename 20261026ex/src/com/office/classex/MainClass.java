package com.office.classex;

public class MainClass {
	public static void main(String[] args) {
	
		// int num = 10;
		
		Car car1 = new Car();
		System.out.println(car1.color);  // Black
		System.out.println(car1.size);  // 5.2
		System.out.println(car1.displacement);  // 2000
		
		car1.drive();
		car1.stop();
		car1.parking();

		car1.color = "Yellow";
		System.out.println("car1 color: " + car1.color);
		
		
		
		Car car2 = new Car();
		System.out.println("car2 color: " + car2.color);
		car2.color = "White";
		System.out.println("car2 color: " + car2.color);
		
		Car car3 = new Car();
		System.out.println("car3 color: " + car3.color);
		
		car3 = car2;    // car3가 car2를 가리킴
		 
		car3 = null;   // car3가 끊김
		
	}

}
