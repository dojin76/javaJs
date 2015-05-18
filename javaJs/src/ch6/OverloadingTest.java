package ch6;

public class OverloadingTest {

	public static void main(String[] args) {
		MyMath3 mm = new MyMath3();
		System.out.println("mm.add(3, 3) 결과 : " + mm.add(3, 3));
		System.out.println("mm.add(3l, 3) 결과 : " + mm.add(3l, 3));
		System.out.println("mm.add(3, 3l) 결과 : " + mm.add(3, 3l));
		System.out.println("mm.add(3l, 3l) 결과 : " + mm.add(3l, 3l));
		
		int[] a = {100, 200, 300};
		System.out.println("mm.add(a) 결과 : " + mm.add(a));
	}

}
