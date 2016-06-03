package two.Question3;
public class CompareValues {
	public static void main(String[] args){
		int x = 0;

		while(x++ < 10) {}
//		String message = x > 10 ? "Greater than" : false; // F, cannot convert boolean to String
//		System.out.println(message + "," + x);
		System.out.println(x);
		System.out.println(x > 10 ? "Greater than" : false);
	}
}