package ch6;

/**
 * 재귀호출 샘플
 * @author CJ-USER
 *
 */
public class PowerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2;
		int n = 5;
		long result = 0;
		
		for(int i = 1; i <= n ; i++) {
			result += power(x, i);		// 연산자 확인 필요(+=, =+)
		}
		
		System.out.println(result);
	}
	
	static long power(int x, int n) {
		return (n==0) ? 1 : x*power(x, n-1);
	}

}
