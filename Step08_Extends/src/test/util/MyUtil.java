package test.util;

public class MyUtil extends BaseUtil{
	public static void light() {
		System.out.println("불을 밝혀요");
	}
	
	/*
	 * static 메소드도 상속받을 수 있다.
	 * so MyUtil.send(), MyUtil.clear() 사용가능
	 */
}
