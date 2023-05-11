package test.main;

import test.mypac.MyUtil;

public class test {
	public static void main(String[] args) {
		MyUtil.draw();
		
		try {
			MyUtil.send();
		}catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		
		System.out.println("main 메소드가 종료됩니다.");
	}
}
