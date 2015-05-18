package ch6;

public class MyMathTest2 {

	public static void main(String[] args) {
		// 클래스메서드 호출
		System.out.println(MyMath2.add(200l, 100l));
		System.out.println(MyMath2.sutract(200l, 100l));
		System.out.println(MyMath2.multiply(200l, 100l));
		System.out.println(MyMath2.divide(200l, 100l));
		
		System.out.println("==============================");
		
		MyMath2 mm = new MyMath2();
		mm.a = 200l;
		mm.b = 200l;
		System.out.println(mm.add());
		System.out.println(mm.sutract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
	}
	
}
