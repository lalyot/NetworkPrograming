package com.poly01.poly;

import com.poly01.poly.mycar.Car;
import com.poly01.poly.mycar.Sedan;
import com.poly01.poly.mycar.Truck;

public class Poly03 {
	
	public static void main(String[] args) {
		Car [] c = new Car[2];
		//��ä�� �迭�� �ʱ�ȭ
		c[0]=new Sedan();
		c[1]=new Truck();
		
	
		display(c);
	
	
	}

	private static void display(Car [] c) {
		// �ݺ������� �迭 ����
		
		for(int i = 0;i < c.length ;i++) { // 0,1
			c[i].run();
			if(c[i] instanceof Sedan) ((Sedan)c[i]).manOfCar();
			if(c[i] instanceof Truck) ((Truck)c[i]).manOfCar();
			System.out.println(c[i]);
		} 
	}
	
	
}
