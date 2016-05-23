package Estruture;

public class Hierarchy {
	
	public void visitSnakes() {	
	
//		try {
//			seeAnimal();
//		} catch (Exception e) {
//			System.out.print("exception");		
//		} catch (RuntimeException re) {// DOES NOT COMPILE Because Runtime Exception is laster than Exception, so It have come first.
//			System.out.print("runtime exception");
//		}	
		
		
		try {
			seeAnimal();
		} catch (RuntimeException e) {
			System.out.print("runtime exception");		
		} catch (Exception e) {
			System.out.print("exception");
		}	
	
	}	
	
	void seeAnimal() throws RuntimeException {
		
	}
	
}