package ch6;

public class ParameterTest3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {10};
		System.out.println("main() : x = " + x[0]);
		
		change(x);
		System.out.println("After change(x)");
		System.out.println("main() : x = " + x[0]);
	}
	
	static void change(int[] x) {		// 참조형 매개변수
		x[0] = 1000;
		System.out.println("Change() : x = " + x[0]);
	}
}
