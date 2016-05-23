package overloadingMethods;

public class SampleOverload {

//Um método é considerado sobrecarregado quando na assinatura o tipo ou a ordem dos parametros são diferentes.
	
//ValidOverload
	public void fly(int numMiles) { }
	public void fly(short numFeet) { }
	public boolean fly() { return false; }
	void fly(int numMiles, short numFeet) { }
	public void fly(short numFeet, int numMiles) throws Exception { }
	
//InvalidOverload
	
	public void walk(int numMiles) { }
	//public int walk(int numMiles) { } // DOES NOT COMPILE
	
	//Apesar de um ser vetor e o outro varargs, o java considera a mesma coisa.
	public void runing(int[] lengths) { }
	//public void runing(int... lengths) { } // DOES NOT COMPILE
	
	
//Autoboxing
	
	//Caso a chamada seja smoking(3), o java procura o tipo mais espcífico (no caso, o int), porém caso este método não existisse, ai sim ocorreria um autoboxing.
	public void smoking(int numMiles) { }
	public void smoking(Integer numMiles) { }
	
}
