package test.main;

import test.mypac.Car;
import java.util.ArrayList;
import java.util.List;

public class MainClass04 {

	public static void main(String[] args) {
		//1. Car type을 저장할 수 있는 ArrayList 객체를 생성해서
		//참조값을 List 인터페이스 type 지역변수 cars에 담기
		List<Car> cars = new ArrayList<>();
		//2. Car 객체(3개)를 생성해서 List 객체에 저장
		cars.add(new Car("일"));	
		cars.add(new Car("이"));
		cars.add(new Car("삼"));
		//3. 일반 for문을 이용해서 List 객체에 저장된 모든 Car 객체의
		//drive() 메소드를 순서대로 호출
		for(int i=0; i<cars.size(); i++) {
			cars.get(i).drive();
		}
		//4. 확장 for문을 이용해서 List 객체에 저장된 모든 Car 객체의
		//drive() 메소드를 순서대로 호출
		for(Car tmp:cars) {
			tmp.drive();
		}
		//5. Consumer 인터페이스를 활용해서 List 객체에 저장된 모든
		//Car 객체의 drive() 메소드를 순서대로 호출
		cars.forEach((tmp)->{
			tmp.drive();
		});
	}

}
