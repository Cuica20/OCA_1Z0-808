public class Rabbit {
	public static void main(String[] args) {
		Rabbit one = new Rabbit();
		Rabbit two = new Rabbit();
		Rabbit three = one;
		one = null;
		Rabbit four = one;
		three = null; 
		two = null;
		two = new Rabbit();
		System.gc();
	}
}