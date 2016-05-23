package lambdaExpressions;

import java.util.ArrayList;
import java.util.List;

public class Bunnies {

	//Imaginge que você tenha uma lista de nomes e queira apenas imprimir o que comece com a letra "h". Isso com expressão lambda seria feito facilmente em apenas uma linha de código.
	public static void main(String[] args){
		List<String> bunnies = new ArrayList<>();
		bunnies.add("long ear");
		bunnies.add("floppy");
		bunnies.add("hoppy");
		
		//Expressão Lambda
		bunnies.removeIf(s -> s.charAt(0) != 'h');
		System.out.println(bunnies);
	}
}