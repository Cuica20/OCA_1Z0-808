package staticVsInstance;

//Membros (métodos e variáveis) estáticas, não podem referenciar membros não estáticos.

public class Static {

	private String name = "Static class";
	
	public static void first() { }
	public static void second() { }
	public void third() { System.out.println(name); }
	
	public static void main(String args[]) {
		first();
		second();
		//O método main é estático e referência um método não estático, porém se acrescentarmos o especificador estático oa método "third" o problema mudará de lugar, pois agora o mesmo estará referênciando uma variável não estática, "name".		
		//third(); // DOES NOT COMPILE	 
	}	
}
