package operadoresIgualdade;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Equals_E_IgualIgual {

	public static void main(String[] args) {

		
		//Nesse casso o operador == compara as referencias dos atributos.
		String o = "Hello World";
		String p = " Hello World".trim();
		System.out.println(o == p);		
		
		
		//Nesse casso o operador Equals compara o conteúdo dos objetos.
		String a = "Hello World";
		String b = " Hello World".trim();
		System.out.println(a.equals(b));
		
		
		Integer x1 = new Integer(10);
		Integer x2 = new Integer(x1 - 0);

		if (x1 == x2) {
		  System.out.println("igual");
		} else {
		  System.out.println("diferente");
		}
		
		//Nesse caso ele compara o objeto que não são iguais, porém, caso ele comparasse a referencia(==), daria um erro, veja próximo exemplo
		String s = "Java";
		StringBuilder sb3 = new StringBuilder("Java");
		if(s.equals(sb3)){
			System.out.println("é um");
		}
		else
		{
			System.out.println("não é um");
		}
		
		//Não é possível comparar duas referencias de tipos diferentes.		
		String s1 = "Java";
		StringBuilder sb4 = new StringBuilder("Java");
//		if(s1 == sb4) //Geraria um erro de compilação 
//		{
//			System.out.println("não é um");
//		}
		
		
		//A comparação é possível com tipos iguais, ainda que primitivo com objetos... 
		System.out.println("\n" + "Compara Objetos com Primitivos");
		Integer it = new Integer(10);
		int in = 10;
		if(it == in){
			System.out.println("True");
		}
		if(it.equals(in)){
			System.out.println("False");
		}
		else {
			System.out.println("Não é nada");
		}
	}
}