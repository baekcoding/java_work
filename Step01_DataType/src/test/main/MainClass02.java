package test.main;
public class MainClass02 {
	public static void main(String[] args) {
		//1. 콘솔창에 "main 메소드가 시작되었습니다." 를 출력
		System.out.println("main 메소드가 시작되었습니다.");
		//2. 국어점수 95를 kor 이라는 변수에 담기
		int kor = 95;
		//3. 영어점수 100을 eng라는 변수에 담기
		int eng = 100;
		//4. 국어점수와 영어점수의 평균을 구해서(연산자 활용) avg라는 변수에 담기
		double avg = (kor + eng)/2f;
		//5. 콘솔창에 avg 변수 안에 담긴 내용 출력하기
		System.out.println(avg);
	}
}
