package InheritingClass;

public abstract class Cars {
	
	public abstract void velocity();
	
	public static void test() {
	}
	
	public static void main (String[] args){
		
		Cars car = new Pickup();
		car.velocity();
	}

}
