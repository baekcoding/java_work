package test.mypac;

public class TestRemocon implements Remocon{

	@Override
	public void up() {
		System.out.println("올라가라 채널");
	}

	@Override
	public void down() {
		System.out.println("내려가라 채널");
	}

	public void reserve() {
		System.out.println("전원 off를 예약합니다.");
	}
}
