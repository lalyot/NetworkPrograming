package com.poly01.poly;

import com.poly01.poly.mycar.*;

public class Poly01 {

	public static void main(String[] args) {
		
		Sedan s = new Sedan();
		
		diplay(s); // ���μ�
		
		Truck t = new Truck();
		
		diplay(t);
	}
	
	
	// overloading
	private static void diplay(Sedan s) { //�����μ�  Sedan s = s;
		//�޼ҵ带 �����Ͻÿ�
		s.run();
		s.manOfCar();
	}
	
	private static void diplay(Truck t) { //�����μ� Truck t = t;
		//�޼ҵ带 �����Ͻÿ�
		t.run();
		t.manOfCar();
		
	}

}
