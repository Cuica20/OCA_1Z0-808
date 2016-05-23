package designingMethods;

public class ExceptionList {

	
	//A declaração de exceptions é opcional...
	
	public void zeroExceptions() { }
	
	public void oneException() throws IllegalArgumentException { }
	
	//podendo ser mais de uma separada por vírgula.	
	
	public void twoExceptions() throws	IllegalArgumentException, InterruptedException { }
}
