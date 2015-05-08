package ch6;

class MyMath2 {

	long a, b;
	
	// 인스턴스 변수 a, b만을 이용해서 작업하므로 매개변수가 필요없다.
	long add() { return a + b;}
	long sutract() { return a - b;}
	long multiply() { return a * b; }
	double divide() { return a / b; }
	
	// 인스턴스 변수와 관계없이 매개변수만으로 작업이 가능하다.
	static long add(long a, long b) {return a + b;}	// a,b는 지역변수이다.
	static long sutract(long a, long b) {return a - b;}
	static long multiply(long a, long b) {return a * b;}
	static double divide(double a, double b) {return a / b;}
}
