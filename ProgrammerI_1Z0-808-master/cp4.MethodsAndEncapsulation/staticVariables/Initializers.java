package staticVariables;

import java.util.ArrayList;

public class Initializers {
	
	//Variável de Instância
	private static final int s1 = 45;
	
	public static void sample1(String args) {		
		//Especificador "final', não permite alteração em variáveis de Instância. 
		//s1 = 5; // DOES NOT COMPILE		
	}

	
	//Variável de Referência(Objeto)
	private static final ArrayList<String> s2 = new ArrayList<>();

	public static void sample2(String args) {
		//variável de Referencia permite alteração, porém o compilador irá reclamar se vc tentálo atribuir a uma variável de referencia diferente.
		s2.add("changed");		
	}
	

	
	
	
}
