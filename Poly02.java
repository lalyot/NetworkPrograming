package com.poly01.poly;

import com.poly01.poly.mycar.Car;
import com.poly01.poly.mycar.Sedan;
import com.poly01.poly.mycar.Truck;

public class Poly02 {

	public static void main(String[] args) {
		
		//메소드 하나를 통해서 두개의 Sedan,Truck클래스의 메소드를 실행하시오
		Car c = new Truck();
		display(c);
				
	}

	
	private static void display(Car c) {
		c.run();
		if(c instanceof Sedan) ((Sedan)c).manOfCar();
		if(c instanceof Truck) ((Truck)c).manOfCar();
		 // 조건문 c instanceof Sedan
		// Sedan 타입으로 만들어진 c인지 ... 참과 거짓을 리턴
	}


		
		
}