package com.poly01.poly;

import com.poly01.poly.mycar.*;

public class Poly01 {

	public static void main(String[] args) {
		
		Sedan s = new Sedan();
		
		diplay(s); // 실인수
		
		Truck t = new Truck();
		
		diplay(t);
	}
	
	
	// overloading
	private static void diplay(Sedan s) { //형식인수  Sedan s = s;
		//메소드를 실행하시오
		s.run();
		s.manOfCar();
	}
	
	private static void diplay(Truck t) { //형식인수 Truck t = t;
		//메소드를 실행하시오
		t.run();
		t.manOfCar();
		
	}

}
