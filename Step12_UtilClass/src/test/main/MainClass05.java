package test.main;

import java.util.ArrayList;
import test.mypac.Member;

public class MainClass05 {

	public static void main(String[] args) {
		//1. Member 객체를 담을 수 있는 ArrayList 객체를 생성해서
		//참조값을 members 라는 지역변수에 담기
		ArrayList<Member> members = new ArrayList<>();
		//2. 3명의 회원정보를 Member 객체에 각각 담기
		Member m1 = new Member(1, "김구라", "노량진");
		Member m2 = new Member(2, "해골", "행신동");
		Member m3 = new Member(3, "지렁이", "인계동");
		//3. 위에서 생성된 Member 객체의 참조값을 members List 객체에 모두 담기
		members.add(m1);
		members.add(m2);
		members.add(m3);
		/*
		 * 4. members List 객체에 담긴 내용을 이용해서 회원 목록을 아래와 같은
		 *    형식으로 반복문 돌면서 출력하기
		 *    
		 *    번호 : 1, 이름 : 김구라, 주소 : 노량진
		 *    번호 : 2, 이름 : 해골, 주소 : 행신동
		 */
		for (int i=0; i<members.size(); i++) {
			System.out.println("번호 : "+members.get(i).num+", 이름 : "
		+members.get(i).name+", 주소 : "+members.get(i).addr);
		}
	}

}
