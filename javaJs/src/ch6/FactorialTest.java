/**
 * 
 */
package ch6;

/**
 * @author CJ-USER
 *
 */
public class FactorialTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(4));
	}

	static long factorial(int n) {
		long result = 0;
		
//		if(n == 1) result = 1;
//		else result = n*factorial(n-1);	// 다시 메서드 자신을 호출
		
		result = (n == 1) ? 1 : n*factorial(n-1);
		
		return result;
	}
}
