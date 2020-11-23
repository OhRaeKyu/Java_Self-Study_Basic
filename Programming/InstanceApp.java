import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class InstanceApp {
	public static void main(String[] args) throws FileNotFoundException {
		//	java.io 페키지 속 PrintWriter 클래스를 instance
		PrintWriter p1 = new PrintWriter("result1.txt");
		p1.write("Hello 1");
		p1.close();
		
		PrintWriter p2 = new PrintWriter("result2.txt");
		p2.write("Hello 2");
		p2.close();
	}
}