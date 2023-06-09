package test.main;

import test.mypac.Remocon;
import test.mypac.MyRemocon;
import test.mypac.TestRemocon;

public class MainClass02 {

	public static void main(String[] args) {
		//다형성 확인
		MyRemocon r1 = new MyRemocon();
		Remocon r2 = r1;
		Object r3 = r1;
		
		//직접 클래스를 test.mypac 패키지에 파일로 만들어서
		//useRemocon() 메소드를 여기서 호출하기
		TestRemocon r4 = new TestRemocon();
		useRemocon(r4);
		r4.reserve();
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
