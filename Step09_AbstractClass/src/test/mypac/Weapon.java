package test.mypac;

public abstract class Weapon {
	//무기 작동을 준비하는 메소드
	public void prepare() {
		System.out.println("무기 작동을 준비합니다.");
	}
	//메소드를 정의하지 않고 미완성으로 남겨두고 싶을 때 abstract 예약어 사용
	public abstract void attack();
}
