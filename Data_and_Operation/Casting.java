public class Casting{
	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1;
		System.out.println(a);
		System.out.println(b);
		
		//	Casting double to int
		int c = (int) 1.7;
		System.out.println(c);
		
		//	Casting int to String
		String d = Integer.toString(7);
		System.out.println(d);
		System.out.println(d.getClass());
		
		//	Casting double to String
		String e = Double.toString(1.7);
		System.out.println(e);
		System.out.println(e.getClass());
	}
}