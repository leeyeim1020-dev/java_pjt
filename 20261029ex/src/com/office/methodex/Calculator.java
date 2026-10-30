package com.office.methodex;

public class Calculator {

	public int addOperator(int n1, int n2) {    //선언부~ , 호출부로 반환해주는곳 int 자리에 반환되는 데이터 타입으로 입력해줘야 한다.
		
		int result = n1 + n2;
		// System.out.println("result: " + result);
	
		return result;
	}											//~선언부
	/*
	public Car productCar() {
		
		Car car = new Car();
		return car;
	}
	*/
	public Object productCar() {
		
		
		
		Car car = new Car();
		return car;
	}
	
}
