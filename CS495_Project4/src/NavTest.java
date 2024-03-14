import lejos.robotics.navigation.*;
import lejos.nxt.*;

public class NavTest {
	public static void main(String[] args) throws Exception {
			double diam = 4.0;
			double trackwidth = 11.8;
			Button.waitForPress();
		DifferentialPilot robot = new 
		DifferentialPilot(diam, trackwidth, Motor.A, Motor.C);
		NavPathController nav = new NavPathController(robot);
		
		WayPoint wp = new WayPoint(20, 20);
		nav.goTo(wp);
		Button.waitForPress();
	}
}
