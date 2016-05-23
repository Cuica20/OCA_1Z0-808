package Subclass;

public class Bunny extends Hopper {
	//	public void hop() throws CanNotHopException { }  Don'r compile because checked exception can't be declared if your class parent not declar.
		public void hop() throws RuntimeException {
			
		}	
}
