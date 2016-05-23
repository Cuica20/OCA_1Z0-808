package NumericPromotion;

public class NumericPromotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Numéricos podem ser promovidos para tipos de níveis maiores
		byte a = 5;
		byte b = 10;
		int c = a+b;
		System.out.println("int " + c);
		
		long d = c;
		System.out.println("long " + d);
		
		float e = d;
		System.out.println("float " + e);
				
		double f = e;
		System.out.println("double " + f);
		
		//Níveis menores do que int (char, byte e shor), sempre serão promovidos para int
		byte g = 10;
		byte h = 11;
		//Não compila
		//byte i = g + h;
		//Compila
		int j = g + h;
		
		//Tipos diferentes, a promoção sempre ocorrerá ao tipo de nível maior.
		int k = 10;
		long l = 15;
		long m = k + l;
		
		
		
	}

}
