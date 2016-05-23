package DeclaracaoVariaveis;

public class ValoresDefault {

	private String brand;
	private boolean boo;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ValoresDefault vd = new ValoresDefault();		
		System.out.println(vd.brand);
		System.out.println(vd.boo);
		
//		Não compila, pois variáveis locais devem ser inicializadas antes de utilizar
//		int i;		
//		System.out.println(i);
		

	}

}
