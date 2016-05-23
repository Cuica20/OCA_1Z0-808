package arrayAndList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAndList {

	public static void main(String[] args) {
				
		// Line 12 converts the array to a List. Note that it isn't the java.util.ArrayList. It is a fixed-size,
		String[] array = { "hawk", "robin" }; // [hawk, robin]
		List<String> list = Arrays.asList(array); // returns fixed size list
		System.out.println(list.size()); // 2
		list.set(1, "test"); // [hawk, test]
		array[0] = "new"; // [new, test]
		for (String b : array) System.out.print(b + " "); // new test
		list.remove(1); // throws UnsupportedOperation Exception
		
		
		//Array temos a propriedade Length
		char[]c = new char[2];
		int length = c.length;
		System.out.println(length);
		
		//ArrayList temos a propriedade size
		ArrayList a = new ArrayList();
		int tamanho = a.size();
		System.out.println(tamanho);
		
	}
}
