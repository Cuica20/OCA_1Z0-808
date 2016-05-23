package RedeclaringPrivateMethods;

public class BactrianCamel extends Camel {
	
	
	/*This code compiles without issue. Notice that the return type differs in the child method from String to int. In this example, the method
getNumberOfHumps() in the parent class is hidden, so the method in the child class is a new method and not an override of the method in
the parent class. As you saw in the previous section, if the method in the parent class were public or protected, the method in the child
class would not compile because it would violate two rules of overriding methods. The parent method in this example is private, so there
are no such issues.*/
	
	
	private int getNumberOfHumps() {
		return 2;
	}	
}
