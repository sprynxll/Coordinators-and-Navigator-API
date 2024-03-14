import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.Motor;
import lejos.robotics.navigation.DifferentialPilot;
import lejos.robotics.navigation.NavPathController;
import lejos.robotics.navigation.WayPoint;

public class attempt2 {
	public static void main(String[] args) {
		// Initialize hardware components - LCD display and Buttons
		DifferentialPilot robot = new DifferentialPilot(4.0, 11.8, Motor.A, Motor.C);
		NavPathController nav = new NavPathController(robot);

		// Wait for a button press to start the program
		Button.waitForPress();

		// Move to (20, 20)
		LCD.clear();
		LCD.drawString("Destination: (20, 20)", 0, 0);
		LCD.drawString("Press ENTER key", 0, 1);
		Button.waitForPress();
		WayPoint wp = new WayPoint(20, 20);
		nav.goTo(wp);

		// Move back to (0, 0)
		LCD.clear();
		LCD.drawString("Destination: (0, 0)", 0, 0);
		LCD.drawString("Press ENTER key", 0, 1);
		Button.waitForPress();
		WayPoint wp1 = new WayPoint(0, 0);
		nav.goTo(wp1);

		// Move to (-20, 20)
		LCD.clear();
		LCD.drawString("Destination: (-20, 20)", 0, 0);
		LCD.drawString("Press ENTER key", 0, 1);
		Button.waitForPress();
		WayPoint wp2 = new WayPoint(-20, 20);
		nav.goTo(wp2);

		// Move back to (0, 0)
		LCD.clear();
		LCD.drawString("Destination: (0, 0)", 0, 0);
		LCD.drawString("Press ENTER key", 0, 1);
		Button.waitForPress();
		WayPoint wp3 = new WayPoint(0, 0);
		nav.goTo(wp3);

		// Wait for a button press to exit the program
		Button.waitForPress();
	}
}
