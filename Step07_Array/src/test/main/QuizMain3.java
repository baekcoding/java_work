package test.main;

import java.util.Random;

public class QuizMain3 {
   public static void main(String[] args) {
      /*   
       *   3. 우연히 3개가 모두 같게 나왔을 때는 "당첨됐습니다!" 를 출력하고
       *      하나라도 다르면 "꽝" 을 출력하도록 프로그래밍 하기
       */
      String[] items={"cherry", "apple", "banana", "melon", "7"};
      //랜덤한 숫자를 얻어내기 위한 객체 
      Random ran=new Random();
      
      int[] rv = {0, 0, 0};
      
      // 3회 반복하면서 
      for(int i=0; i<3; i++) {
         // 0~4 사이의 랜덤한 숫자를 하나 얻어내서 
         int ranNum=ran.nextInt(5);
         
         rv[i] = ranNum;
         // 배열의 인덱스로 활용해서 문자열 출력하기
         System.out.print(items[rv[i]]);
         if(i<2) {
            System.out.print(" | ");
         }
      }
      
      if ((rv[0]==rv[1]) && (rv[1]==rv[2])) {
    	  System.out.println("\n당첨됐습니다!");
      } else {System.out.println("\n꽝");}
   }
}

