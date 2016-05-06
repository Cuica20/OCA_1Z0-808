/**
 * 
 */
package Java8.MethodReferenceTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Method references help to point to methods by their names.
 *         A method reference is described using :: (double colon) symbol. A
 *         method reference can be used to point the following types of methods
 *
 */
public class Java8MethodReference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List names = new ArrayList();
		
	      names.add("Mahesh");
	      names.add("Suresh");
	      names.add("Ramesh");
	      names.add("Naresh");
	      names.add("Kalpesh");
	      
	      names.forEach(System.out::println);

	}

}
