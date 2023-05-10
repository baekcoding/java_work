package test.main;

import test.mypac.HandPhone;
import test.mypac.AndroidPhone;

public class MainClass06 {

	public static void main(String[] args) {
		// 자식에게 사준 일반 핸드폰(인터넷 안됨)
		HandPhone p1 = new HandPhone();
		
		// 엄마! 나도 AndroidPhone 갖고 싶어!
		AndroidPhone p2 = (AndroidPhone) p1; // ClassCastException 발생
		
		p2.doInternet();
	}

}
