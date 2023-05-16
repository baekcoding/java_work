package test.main;

import dept.dao.DeptDao;
import dept.dto.DeptDto;

public class MainTest {

	public static void main(String[] args) {
		//필드
		int deptno = 2;
		String dname = "인사부";
		String loc = "인천";
		
		//생성자
		DeptDto dto = new DeptDto(deptno, dname, loc);
		
		DeptDao dao = new DeptDao();
		boolean isSuccess = dao.insert(dto);
		if(isSuccess) {
			System.out.println("생성했습니다.");
		}
	}

}
