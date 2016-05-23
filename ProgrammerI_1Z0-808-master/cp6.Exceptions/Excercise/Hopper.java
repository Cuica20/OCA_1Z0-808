package Excercise;

public class Hopper {

	public static void main(String args[]){
		
		hop2();
		
		try {
			hop();
		}catch(RuntimeException e){
			System.out.println(e);
		} finally {
			System.out.println("Deu Ruim");
		}
	
		System.out.println("Mas to aqui");
	}
	
	
	private static void hop() throws RuntimeException {
		throw new RuntimeException("cannot hop");
	}
	
	private static void hop2() throws RuntimeException{
//		throw new RuntimeException("cannot hop");
	}
}
