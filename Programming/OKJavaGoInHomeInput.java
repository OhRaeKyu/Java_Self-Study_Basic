import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OKJavaGoInHomeInput {
	public static void main(String[] args) {
		
		String home = args[0];
		String Bright = args[1];
				
		//	Elevator call
		Elevator myElevator = new Elevator(home);
		myElevator.callForUp(1);

		//	Security off
		Security mySecurity = new Security(home);
		mySecurity.off();
		
		//	Light on
		Lighting hallLamp = new Lighting(home + " / Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(home + " / floor Lamp");
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(home + " mood Lamp");
		moodLamp.setBright(Double.parseDouble(Bright));
		moodLamp.on();
	}
}