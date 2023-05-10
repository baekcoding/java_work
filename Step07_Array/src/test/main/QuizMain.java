package test.main;

import java.util.Random;

public class QuizMain {
	public static void main(String[] args) {
		/*
		 * 1. run 했을때
		 *    cherry, apple, banana, melon, 7
		 *    5개의 문자열 중에서 1개가 랜덤하게 출력되게 해보시오.
		 */
		String[] names = new String[5];
		Random ran = new Random();
		
		names[0] = "cherry";
		names[1] = "apple";
		names[2] = "banana";
		names[3] = "melon";
		names[4] = "7";
		
		int result = ran.nextInt(5);
		System.out.println(names[result]);
		
	}
}
