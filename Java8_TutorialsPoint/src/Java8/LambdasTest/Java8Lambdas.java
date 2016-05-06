package Java8.LambdasTest;

/**
 * @author jcuicapuza
 * 
 * A lambda expression is characterized by the following syntax −
 parameter -> expression body

 Following are the important characteristics of a lambda expression −

 Optional type declaration − No need to declare the type of a parameter. The compiler can inference the same from the 
 value of the parameter.

 Optional parenthesis around parameter − No need to declare a single parameter in parenthesis. For multiple parameters, 
 parentheses are required.

 Optional curly braces − No need to use curly braces in expression body if the body contains a single statement.

 Optional return keyword − The compiler automatically returns the value if the body has a single expression to return the value. 
 Curly braces are required to indicate that expression returns a value.
 -------------------------------------
 Opcional declaración de tipo - No hay necesidad de declarar el tipo de un parámetro. El compilador puede inferencia
 de la misma a partir del valor del parámetro.

 Opcional paréntesis alrededor de parámetros - No hay necesidad de declarar un solo parámetro entre paréntesis. 
 Para múltiples parámetros, se requieren paréntesis.

 Llaves opcionales - No hay necesidad de utilizar llaves en el cuerpo de expresión si el cuerpo contiene una única instrucción.

 Palabra clave opcional return - El compilador devuelve automáticamente el valor si el cuerpo tiene una sola expresión 
 para devolver el valor. Se requieren llaves para indicar que la expresión devuelve un valor.
 *
 */
public class Java8Lambdas {
	
	final static String salutation = "Hello! ";
	
	public static void main(String[] args) {
		Java8Lambdas tester = new Java8Lambdas();
		
		//with type declaration
	      MathOperation addition = (int a, int b) -> a + b;
			
	      //with out type declaration
	      MathOperation subtraction = (a, b) -> a - b;
			
	      //with return statement along with curly braces
	      MathOperation multiplication = (int a, int b) -> { return a * b; };
			
	      //without return statement and without curly braces
	      MathOperation division = (int a, int b) -> a / b;
			
	      System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
	      System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
	      System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
	      System.out.println("10 / 5 = " + tester.operate(10, 5, division));
			
	      //with parenthesis
	      GreetingService greetService1 = message ->
	      System.out.println("Hello " + message);
			
	      //without parenthesis
	      GreetingService greetService2 = (message) ->
	      System.out.println("Hello " + message);
			
	      greetService1.sayMessage("Mahesh");
	      greetService2.sayMessage("Suresh");
	      
	      GreetingService greetServ = msn ->
	      System.out.println(salutation + msn);
	      greetServ.sayMessage("Javier!");
	}
	
	interface MathOperation {
		int operation(int a, int b);
	}

	interface GreetingService {
		void sayMessage(String message);
	}

	private int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}

}
