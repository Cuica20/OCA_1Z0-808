package Finally;

public class Aritimetic {

	public static void main(String[] args) {
		
		
		try {
			
			System.out.println("Pega Nada");
			
		} catch (Exception e) {
			System.out.println(e);
		} finally{
			System.out.println("Deus ruim");
		}

	}
	
	public static int calculate(int a, int b) throws Exception {
		return a/b;
	}

}
