package com.poly01.poly;

import com.poly01.poly.mycar.Car;
import com.poly01.poly.mycar.Sedan;
import com.poly01.poly.mycar.Truck;

public class Poly02 {

	public static void main(String[] args) {
		
		//�޼ҵ� �ϳ��� ���ؼ� �ΰ��� Sedan,TruckŬ������ �޼ҵ带 �����Ͻÿ�
		Car c = new Truck();
		display(c);
				
	}

	
	private static void display(Car c) {
		c.run();
		if(c instanceof Sedan) ((Sedan)c).manOfCar();
		if(c instanceof Truck) ((Truck)c).manOfCar();
		 // ���ǹ� c instanceof Sedan
		// Sedan Ÿ������ ������� c���� ... ���� ������ ����
	}


		
		
}