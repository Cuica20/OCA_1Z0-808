package staticInitialization;

public class StaticInitialization {

	private static int one;
	private static final int two;
	private static final int three = 3;		
	
	//O compilador permite apenas a primeira inicialização estática ocorrida na linha 14
	//private static final int four; // DOES NOT COMPILE
	
	static {
		
		
		
		one = 1;
		
		two = 2;
		
		// O Especificador "final", não permite reatribuição de valor. 
		//three = 3; // DOES NOT COMPILE
		
		//// O Especificador "final", não permite reatribuição de valor.
		//two = 4; // DOES NOT COMPILE
	}
}
