/**
 * 
 */
package ch6;

/**
 * @author CJ-USER
 *
 */
public class MyMathTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMath mm = new MyMath();
		
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5l, 3l);
		long result3 = mm.multiply(5l, 3l);
		double result4 = mm.divide(5l, 3l);
		
		System.out.println("add(5l, 3l) = " + result1);
		System.out.println("subtract(5l, 3l) = " + result2);
		System.out.println("multiply(5l, 3l) = " + result3);
		System.out.println("divide(5l, 3l) = " + result4);

	}

}
