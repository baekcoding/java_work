package dept.dto;

public class DeptDto {
	//필드
	private int deptno;
	private String dname;
	private String loc;
	
	//생성자
	public DeptDto() {
		System.out.println("Dto 객체가 생성되었습니다.");
	}
	
	public DeptDto(int deptno, String dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	
	//메소드
	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
	
}
