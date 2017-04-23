package level2;

import level1.Sonar;
import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level2.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
		Sonar sonar = new Sonar(roomba);
	}

	public void initialize() {
		driveDirect(1000,1000);
		sleep(1500);
		driveDirect(130,1400);
		sleep(272);
		driveDirect(1000,1000);
		sleep(2400);
		driveDirect(1400,130);
		sleep(272);
		driveDirect(1000,1000);
		sleep(10000);

	}

	public void loop() {
	
	}
}
