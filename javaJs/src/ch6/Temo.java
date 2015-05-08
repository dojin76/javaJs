package ch6;

/**
 * 클래스변수와 인스턴스 변수에 대한 클래스 메서드, 인스턴스 메서드 호출 가능 여부 확인
 * @author CJ-USER
 *
 */
public class Temo {
	
	int x = 0;
	static int y = 10;

	public static void main(String[] args) {
		Temo t = new Temo();
		t.x = 5;
		Temo.y = 100;
	}
	
	public void temp(int a) {
		x = 100;
		y = 500;
	}
}
