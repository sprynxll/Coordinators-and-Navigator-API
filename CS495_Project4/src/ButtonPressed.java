import lejos.nxt.Button;
import lejos.nxt.LCD;

public class ButtonPressed {
	public static void main(String[] args) throws Exception {
		while (!Button.ESCAPE.isPressed()) {
			LCD.clear();
			if (Button.ENTER.isPressed()) {
				LCD.drawString("ENTER", 1, 1);
				Thread.sleep(1000);
			}
		}
	}
}
