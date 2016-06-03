package two.Question6;

public class OperationPrecedenceAndTypeConvertion {

	public static void main(String[] args) {
		int x = 4;
		long y = x * 4 - x++;

		System.out.println(y);
		System.out.println(x);
		if(y<10) System.out.println("Too Low");
		else System.out.println("Just right");
		else System.out.println("Too High"); // F - does not compile becuse of line 7
	}
}