package staticVariables;

public class Program {
	
	static {
//		x não poderia ser inicializado em um escopo stático visto que o mesmo não está declarado como um atributo estático
//		x = 10;
		y = 5;		
	}

	final int x = 11;
	final static int y;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			Program pr = new Program();
			int c = pr.x/y;
			
		}catch (ArithmeticException E){
			System.out.println(E);
		}
		
		
	}

}
