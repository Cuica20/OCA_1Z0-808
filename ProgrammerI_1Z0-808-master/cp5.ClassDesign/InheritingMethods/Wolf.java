package InheritingMethods;

public class Wolf extends Canine {

	public double getAverageWeight() {
		return super.getAverageWeight()+20;
	}

	public static void main(String[] args) {
		System.out.println(new Canine().getAverageWeight());
		System.out.println(new Wolf().getAverageWeight());
	}

}
/*
 * In this example, in which the child class Wolf overrides the parent class Canine, the method getAverageWeight() runs without issue
and outputs the following:
50.00
70.00*/
 



 
 /*
  * You might be wondering, was the use of super in the child's method required? For example, what would the following code output if we
removed the super keyword in the getAverageWeight() method of the Wolf class?
  */
  
//  public double getAverageWeight() {
//	  return getAverageWeight()+20; // INFINITE LOOP
//	  }
