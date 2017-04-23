package level4;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;
	int speed = 1000;

	public static void main(String[] args) {
		PApplet.main("level4.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}
	/**
	 * complete the MAZE
	 * Hint: use bump sensors
	 */
	
	
	public void initialize() {
	
		
		

	}

	public void loop() {
		goStraight(50);
		if (isBumpedRight()){
			makeLeftTurn(450);
			rightBump = false;
			leftBump = false;
		
		}
		
		if (isBumpedLeft()){
			makeRightTurn(450);
			leftBump = false;
			rightBump = false;
			
		}
		

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
