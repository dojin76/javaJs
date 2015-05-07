package ch6;

public class CardTest {

	public static void main(String[] args) {
		
		/**
		 * 변수의 종류
		 * 1) 클래스 변수
		 *    -. 모든 인스턴스가 공통된 저장공간(변수)을 공유하게 된다. -> 공유변수
		 *    -. static 사용
		 * 2) 인스턴스 변수
		 *    -. 인스턴스는 독립적인 저장공간을 가지므로 서로 다른 값을 가질 수 있다.
		 *    -. 인스턴스마다 상태를 유지해야 하는 속성의 경우, 인스턴스 변수를 사용
		 * * 인스턴스 변수는 인스턴스를 생성한 후에야 사용가능하지만, 클래스 변수는 인스턴스를 생성하지 않아도 
		 *   언제든 바로 사용할 수 있는 특징이 있다.
		 * 3) 지역변수
		 *    -. 메서드 내에서 선언되어 메서드 내에서만 사용 가능
		 *    -. 메서드는 생성자와 초기화 블록을 포함한다.
		 *    
		 */
		
		/**
		 * 클래스변수(static변수)는 객체생성없이 '클래스명.클래스변수'로 직접 사용 가능하다.
		 */
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		
		/**
		 * 인스턴스 변수 값을 변경한다.
		 */
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")" );
		System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")" );
		
		/**
		 * 클래스 변수 값을 변경한다.
		 */
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
		c1.width = 50;
		c1.height = 80;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")" );
		System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")" );

	}

}
