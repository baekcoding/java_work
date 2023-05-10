package test.main;

import test.mypac.MyUtil;

public class MainClass07 {
	public static void main(String[] args) throws InterruptedException {
		
		//메소드 안에서 발생하는 예외를 직접 처리한 draw() 메소드 호출
		MyUtil.draw();
		
		MyUtil.send();
		
		System.out.println("main 메소드가 종료됩니다.");
	}
}
