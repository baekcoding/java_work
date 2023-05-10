package test.main;
import test.mypac.Car;

public class Review {
	public static void main(String[] args) {
		Car car1 = new Car();
		
		Car car2 = car1;
		
		car2.name = "김구라";
		
		car1.price = 3;
		
	}
}
