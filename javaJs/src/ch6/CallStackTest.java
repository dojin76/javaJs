/**
 * 
 */
package ch6;

/**
 * @author CJ-USER
 *
 */
public class CallStackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		firstMethod();
	}
	
	static void firstMethod() {
		secondMethod();
	}
	
	static void secondMethod() {
		System.out.println("SecondMethod()");
	}

}
