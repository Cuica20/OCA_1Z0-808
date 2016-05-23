package superVSsuper;



/*The first, super(), is a statement that explicitly calls a parent constructor and may only be used in the
first line of a constructor of a child class. The second, super, is a keyword used to reference a member defined in a parent class and may
be used throughout the child class.*/


public class Rabbit {
	
	public Rabbit(int age) {
		super();
//		super.setAge(10);
	}
	
	
//	public Rabbit(int age) {
//		super; // DOES NOT COMPILE
//		super().setAge(10); // DOES NOT COMPILE
//	}

}
