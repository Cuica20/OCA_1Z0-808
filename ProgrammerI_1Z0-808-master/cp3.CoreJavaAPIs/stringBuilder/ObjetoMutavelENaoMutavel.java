package stringBuilder;

public class ObjetoMutavelENaoMutavel {

	public static void main(String[] args) {

		
		//Ao contrário de um objeto String, o String builder é um objeto mutável e tem o seu valor alterado.		
		StringBuilder a = new StringBuilder("abc");
		StringBuilder b = a.append("de");
		b = b.append("f").append("g");
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		
	
		String x = "abc";
		String z = x.concat("de");
		z = z.concat("f").concat("g");
		System.out.println("x=" + x);
		System.out.println("z=" + z);

		
		// Apesar de ser StringBuilder, o método Sustring retornar uma string e não altera o objeto utilizado (sb). 
		StringBuilder sb = new StringBuilder("animals");
		String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
		int len = sb.length();
		char ch = sb.charAt(6);
		System.out.println(sub + " " + len + " " + ch);
		System.out.println(sb + " " + len + " " + ch);
		
		
		System.out.println("\n");
		StringBuilder sb2 = new StringBuilder();
		sb2.append("aaa").insert(1, "bb").insert(4, "ccc"); //abbaa
		System.out.println(sb2); //abbcccaa
		
		
		String s = "Java";
		StringBuilder sb3 = new StringBuilder("Java");
		if(s.equals(sb3)){
			System.out.println("é um");
		}
		else
		{
			System.out.println("não é um");
		}
	}
}
