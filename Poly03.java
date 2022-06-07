package com.poly01.poly;

import com.poly01.poly.mycar.Car;
import com.poly01.poly.mycar.Sedan;
import com.poly01.poly.mycar.Truck;

public class Poly03 {
	
	public static void main(String[] args) {
		Car [] c = new Car[2];
		//객채를 배열로 초기화
		c[0]=new Sedan();
		c[1]=new Truck();
		
	
		display(c);
	
	
	}

	private static void display(Car [] c) {
		// 반복문으로 배열 접근
		
		for(int i = 0;i < c.length ;i++) { // 0,1
			c[i].run();
			if(c[i] instanceof Sedan) ((Sedan)c[i]).manOfCar();
			if(c[i] instanceof Truck) ((Truck)c[i]).manOfCar();
			System.out.println(c[i]);
		} 
	}
	
	
}
