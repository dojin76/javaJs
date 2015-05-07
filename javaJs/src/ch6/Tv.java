package ch6;

class Tv {

	// TV의 속성(멤버변수)
	String color;	// 색상
	boolean power;	// 전원상태(On/Off)
	int channel;	// 채널
	
	// TV의 기능(메서드)
	/*  TV를 켜거나 끄는 기능의 메서드 */
	void power() {
		/*
		if(power) {
			power = false;
		} else {
			power = true;
		}
		*/
		power = !power;
	}
	
	/* TV의 채널을 높이는 기능의 메서드 */
	void challelUp() {
		++channel;
	}
	
	/* TV의 채널을 낮추는 기능의 메서드 */
	void channelDown() {
		--channel;
	}
	
}