//	라이브러리 호출
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OKJavaGoInHome {
	public static void main(String[] args) {
		
		String home = "JAVA APT 305";
		
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
	}
}