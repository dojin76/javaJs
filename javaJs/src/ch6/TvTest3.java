package ch6;

/**
 * 설명 : 참조변수에는 하나의 값(주소)만이 저장될 수 있으므로 둘 이상의 참조변수가 하나의 인스턴스를 가리키는(참조하는) 것은 가능하지만 
 *        하나의 참조변수로 여러 개의 인스턴스를 가리키는 것은 가능하지 않다.ㄴ
 * @author CJ-USER
 *
 */
public class TvTest3 {

	public static void main(String[] args) {
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
		
		t2 = t1;	// t1이 저장하고 있는 값(주소)을 t2에 저장한다.
		t1.channel = 7;
		System.out.println("t1의 channel값을 7로 변경하였다.");
		
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
	}
}