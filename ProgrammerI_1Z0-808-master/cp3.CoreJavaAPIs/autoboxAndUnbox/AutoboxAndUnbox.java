package autoboxAndUnbox;

import java.util.ArrayList;
import java.util.List;

public class AutoboxAndUnbox {
	

	public static void main(String[] args) {
		
		
		//Adicionamos um primitivo double a um array de objetos Double (autobox), depois atribuimos a um primitivo double o valor de um objeto Double(unbox).		
		List<Double> weights = new ArrayList<>();
		//autobox;
		weights.add(50.5); // [50.5]
		weights.add(new Double(60)); // [50.5, 60.0]
		weights.remove(50.5); // [60.0]
		//unbox
		double first = weights.get(0); // 60.0
		
		
		//Since calling any method on null gives a NullPointerException,
		List<Integer> heights = new ArrayList<>();
		heights.add(null);
		//int h = heights.get(0); // NullPointerException
		
		//Apesar de ser um array de Integer, ele considera o argumento como indice, para informar o valor como parametro deve-se usar numbers.remove(new Integer(1)).
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.remove(1);
		System.out.println(numbers);

	}

}
