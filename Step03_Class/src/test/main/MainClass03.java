package test.main;

import test.mypac.Car;

public class MainClass03 {
	public static void main(String[] args) {
		// Car 객체를 생성해서 사용하지 않고 버림
		new Car();
		
		// Car 객체를 사용해서 1번 사용하고 버림(객체를 1회용으로 사용)
		new Car().drive();
		
		// Car 객체를 생성해서 나온 참조값을 c1이라는 'car type 지연변수에 담아 놓고
		Car car1 = new Car();
		//필요할 때마다 c1에 . 찍어서 여러번 사용 가능
		car1.drive();
		car1.drive();
			
	}
}
