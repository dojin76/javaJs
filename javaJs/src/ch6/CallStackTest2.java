package ch6;

/**
 * JVM의 메모리 구조 상에서 메서드 호출 시, Call Stack 영역에서 
 * 어떤 순서로 처리되는지 확인하는 예제.
 * @author CJ-USER
 *
 */
public class CallStackTest2 {
	
	public static void main(String[] args) {
		System.out.println("main(String[] args)이 시작되었음");
		firstMethod();
		System.out.println("main(String[] args)이 끝났음");
	}

	static void firstMethod() {
		System.out.println("firstMethod()이 시작되었음");
		secondMethod();
		System.out.println("firstMethod()이 끝났음");
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()이 시작되었음");
		System.out.println("secondMethod()이 끝났음");
	}
}
