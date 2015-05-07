package ch6;

public class Time {
	
	/**
	 * 비 객체지향적 표현
	 * int hour1, hour2, hour3;
	 * int minute1, minute2, minute3;
	 * int second1, second2, second3;
	 * 
	 * int[] hour = new int[3];
	 * int[] minute = new int[3];
	 * int[] second = new int[3];
	 *  
	 * 객체지향적 표현
	 * Time t1 = new Time();
	 * Time t2 = new Time();
	 * Time t3 = new Time();
	 * 
	 * Time[] t = new Time[3];
	 * t[0] = new Time();
	 * t[1] = new Time();
	 * t[2] = new Time();
	 * 
	 */
	
	private int hour;
	private int minute;
	private int second;
	
	public int getHour() {
		return hour;
	}
	public void setHour(int h) {
		if( h < 0 || h > 23 ) return;
		this.hour = h;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int m) {
		if( m < 0 || m > 59 ) return;
		this.minute = m;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int s) {
		if( s < 0 || s > 59 ) return;
		this.second = s;
	}
}
