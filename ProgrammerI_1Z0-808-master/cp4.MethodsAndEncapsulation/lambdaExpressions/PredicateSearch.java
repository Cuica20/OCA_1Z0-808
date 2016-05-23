package lambdaExpressions;

import java.util.*;
import java.util.function.*;

public class PredicateSearch {
	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("frog", true, true));
		animals.add(new Animal("kangaroo", true, false));
		print(animals, a -> a.canHop() && a.canSwim());
	}
	
	//Agora o método recebe como seundo parametro um predicado, isso tira a necessidade de termos uma interface implementada para que a expressão funcione, o java já fornece essa interface implementada no pacote java.util.function.
	private static void print(List<Animal> animals, Predicate<Animal> checker) {
		
		for (Animal animal : animals) {
			if (checker.test(animal))
				System.out.print(animal + " ");
		}
		System.out.println();
	}
 }
