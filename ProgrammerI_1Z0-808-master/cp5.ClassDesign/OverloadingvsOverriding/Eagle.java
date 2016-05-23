package OverloadingvsOverriding;

public class Eagle extends Bird {
	
	
	//Overloading
	private int fly(int height) {
		System.out.println("Bird is flying at "+height+" meters");
		return height;
	}
	
	//Overriding
	public void eat(int food) { // DOES NOT COMPILE
		System.out.println("Bird is eating "+food+" units of food");		
	}
	
}
