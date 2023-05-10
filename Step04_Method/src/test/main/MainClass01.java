package test.main;

import test.mypac.Airplane;
import test.mypac.Test;

public class MainClass01 {
	public static void main(String[] args) {
		Test t = new Test();
		//return type이 void인 메소드 호출
		t.walk();
		//return type이 int인 메소드 호출하고 리턴되는 값을 a 라는 int type 지역변수에 담기		
		int a = t.getNumber();
		//return type이 String인 메소드 호출하고 리턴되는 값을 b 라는 String type 지역변수에 담기
		String b = t.getGreeting();
		//return type이 Airplane인 메소드 호출하고 리턴되는 값을 c 라는 Airplane type 지역변수에 담기
		Airplane c = t.getPlane();
		c.fly();
		
		//위에서 생성한 객체의 setNum() 메소드 호출
		t.setNum(10);
		t.setName("gura");
		t.setPlane(new Airplane());
		
		System.out.println("main 메소드가 종료됩니다.");
	}
}
