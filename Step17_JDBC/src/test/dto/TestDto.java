package test.dto;

public class TestDto {
	//필드
	private int num;
	private String name;
	private String addr;
	
	//디폴트 생성자
	public TestDto() {}
	
	//메소드	
	public TestDto(int num, String name, String addr) {
		super();
		this.num = num;
		this.name = name;
		this.addr = addr;		
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
