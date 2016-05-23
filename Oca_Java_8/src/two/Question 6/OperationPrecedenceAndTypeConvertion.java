public class OperationPrecedenceAndTypeConvertion {

	public static void main(String[] args) {
		int x = 4;
		long y = x * 4 - x++;

		if(y>10) System.out.println("Too Low");
		else System.out.println("Just right");
		else System.out.println("Too High"); // F - does not compile becuse of line 7
	}
}