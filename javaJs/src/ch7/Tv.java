package ch7;

class Tv {
	
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void changeUp() {++channel;}
	void changeDown() {--channel;}

}
