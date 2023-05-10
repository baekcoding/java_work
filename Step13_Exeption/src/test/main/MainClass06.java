package test.main;

import java.util.Random;

public class MainClass06 {

	public static void main(String[] args) {
		Random ran = new Random();
		//0~4 사이의 랜덤한 정수 얻어내기
		int ranNum = ran.nextInt(5);
		//우연히 가장 큰 수가 나오면 WowException을 발생시키기
		if(ranNum == 4) {
			//throw 예약어와 함께 예외 객체를
		}
	}

}
