package test.main;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class MainClass07 {

	public static void main(String[] args) {
		/*
		 * 세명의 회원정보를 HashMap 객체에 각각 담아서
		 * 
		 * ArrayList 객체에 누적시켜 보기
		 * 
		 * 반복문 돌면서 ArrayList 객체에 누적된 회원정보를 콘솔창에 순서대로 출력해 보기
		 */
		List<HashMap<String, Object>> custInfo = new ArrayList<>();
		
		HashMap<String, Object> map1 = new HashMap<>();
		map1.put("num", 1);
		map1.put("name", "김구라");
		map1.put("addr", "서초동");
		
		HashMap<String, Object> map2 = new HashMap<>();
		map2.put("num", 2);
		map2.put("name", "지렁이");
		map2.put("addr", "역삼동");
		
		HashMap<String, Object> map3 = new HashMap<>();
		map3.put("num", 3);
		map3.put("name", "해쉬맵");
		map3.put("addr", "논현동");

		custInfo.add(map1);
		custInfo.add(map2);
		custInfo.add(map3);
	}
}
