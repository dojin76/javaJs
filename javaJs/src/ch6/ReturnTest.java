/**
 * 
 */
package ch6;

/**
 * @author CJ-USER
 * 이 예제는 리턴값이 있는 메서드를 리턴값이 없는 메서드로 바꾸는 방법을 보여준다.
 * 참고) 참조형 매개변수
 *
 */
public class ReturnTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnTest r = new ReturnTest();
		
		int result = r.add(3, 5);
		System.out.println(result);
		
		int[] result2 = {0};			// 배열을 생성하고 result2[0]의 값을 0으로 초기화
		r.add(3, 5, result2);			// 배열을 add메서드의 매개변수로 전달
		System.out.println(result2[0]);
	}
	
	int add(int a, int b) {
		return a + b;
	}
	
	void add(int a, int b, int[] result) {
		result[0] = a + b;		// 매개변수로 넘겨받은 배열에 연산결과를 저장.
	}

}
