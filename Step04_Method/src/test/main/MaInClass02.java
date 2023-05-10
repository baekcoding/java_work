package test.main;

import test.mypac.Test;
import test.mypac.Airplane;

public class MaInClass02 {
	public static void main(String[] args) {
		Test t = new Test();
		t.send();
		t.send(10);
		t.send("xxx");
		
		// 참조되는 값을 전달할 수도 있다.
		int a = 999;
		t.send(a);
		
		String b = "하이";
		t.send(b);
		
		Airplane c = new Airplane();
		t.send(c);
	}
}
