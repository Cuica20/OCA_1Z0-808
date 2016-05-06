/**
 * 
 */
package Java8.FunctionalInterfacesTest;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author interfaces funcionales tienen una única funcionalidad para exhibir.
 *         Por ejemplo, una interfaz Comparable con un único método 'compareTo'
 *         se utiliza para fines de comparación. Java 8 ha definido una gran
 *         cantidad de interfaces funcionales que se utiliza ampliamente en las
 *         expresiones lambda. A continuación se presenta la lista de interfaces
 *         funcionales definidas en el paquete java.util.Function.
 *
 */
public class Java8FunctionalInterfaces {

	public static void main(String args[]){
	      List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
			
	      // Predicate<Integer> predicate = n -> true
	      // n is passed as parameter to test method of Predicate interface
	      // test method will always return true no matter what value n has.
			
	      System.out.println("Print all numbers:");
			
	      //pass n as parameter
	      eval(list, nn->true);
			
	      // Predicate<Integer> predicate1 = n -> n%2 == 0
	      // n is passed as parameter to test method of Predicate interface
	      // test method will return true if n%2 comes to be zero
			
	      System.out.println("Print even numbers:");
	      eval(list, nn-> nn%2 == 0 );
			
	      // Predicate<Integer> predicate2 = n -> n > 3
	      // n is passed as parameter to test method of Predicate interface
	      // test method will return true if n is greater than 3.
			
	      System.out.println("Print numbers greater than 3:");
	      eval(list, nnn-> nnn > 3 );
	   }
		
	   public static void eval(List<Integer> list, Predicate<Integer> predicate) {
	      for(Integer n: list) {
			
	         if(predicate.test(n)) {
	            System.out.println(n + " ");
	         }
	      }
	   }

}
