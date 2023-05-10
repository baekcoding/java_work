package test.main;

import test.mypac.Quad;
/*
 * test.mypac 패키지에 클래스 하나 만들기
 *  - 사각형의 폭(width), 높이(height)를 필드에 저장할 수 있어야 함
 *  - 필드에 저장된 폭과 높이를 이용해서 사각형의 넓이를 콘솔창에 출력하는 메소드를 가지고 있어야 함
 *  - 필드와 메소드는 모두 non static으로 만들어야 함
 */
public class MainClass10 {
	public static void main(String[] args) {
		Quad quadrangle = new Quad();
		
		quadrangle.width = 7;
		quadrangle.height = 4;
		
		quadrangle.printArea();
	}
}
