package test.main;

import test.mypac.Apple;
import test.mypac.FruitBox;
import test.mypac.Melon;
import test.mypac.Orange;

public class MainClass {
	public static void main(String[] args) {
		//FruitBox 객체를 생성해서 참조값을 box라는 이름의 지역 변수에 담기
		FruitBox<Apple> box = new FruitBox<Apple>();
		//box에 담긴 참조값을 이용해서 pack() 메소드를 호출
		box.pack(new Apple());		
		//box에 담긴 참조값을 이용해서 unPack() 메소드를 호출하고 리턴되는 값을 fruit 지역변수에 담기
		Apple fruit = box.unPack();
		
		FruitBox<Melon> box2 = new FruitBox<Melon>();
		box2.pack(new Melon());
		Melon fruit2 = box2.unPack();
		
		//Orange도 담아보기
		FruitBox<Orange> box3 = new FruitBox<>(); //객체 생성 시 Generic 클래스 생략 가능
		box3.pack(new Orange());
		Orange fruit3 = box3.unPack();
	}
}
