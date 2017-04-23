package level3;


import processing.core.PApplet;

public class Challenge extends Head {
	int speed = 1000;
	
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level3.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	public void initialize() {
		goStraight(1000);
		makeLeftTurn(600);
		goStraight(1000);
		makeRightTurn(500);
		goStraight(1300);
		makeLeftTurn(550);
		goStraight(1000);
		makeRightTurn(600);
		goStraight(1000);
	
	}

	public void loop() {
	
	}
void makeLeftTurn(int sleep){
	driveDirect(0,500);
	sleep(sleep);
	
}

void makeRightTurn(int sleep){
	driveDirect(500,0);
	sleep(sleep);
}


void goStraight(int sleep){
	driveDirect(1000,1000);
	sleep(sleep);
}


















}

