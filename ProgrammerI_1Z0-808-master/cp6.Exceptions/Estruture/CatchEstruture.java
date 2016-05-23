package Estruture;

public class CatchEstruture {

	@SuppressWarnings("finally")
	public static void main(String[] args) {
		
		System.out.print("a");
		try {
			
			System.out.print("b");
			throw new IllegalArgumentException();
				
			} catch (IllegalArgumentException e) {
				System.out.print("c");
				
			} finally {
				System.out.print("e");
				throw new RuntimeException("3");
			}
	}
}



