package overloadingConstructors;

public class Mouse {

	//Assim como métodos, construtores também podem ser sobrecarregados e podem ser instanciados por otros cosntrutores como a seguir:	
	private int numTeeth;
	private int numWhiskers;
	private int weight;
	public Mouse(int weight) {
	this(weight, 16); // calls constructor with 2 parameters
	}
	public Mouse(int weight, int numTeeth) {
	this(weight, numTeeth, 6); // calls constructor with 3 parameters
	}
	public Mouse(int weight, int numTeeth, int numWhiskers) {
	this.weight = weight;
	this.numTeeth = numTeeth;
	this.numWhiskers = numWhiskers;
	}
	public void print() {
	System.out.println(weight + " " + numTeeth + " " + numWhiskers);
	}
	public static void main(String[] args) {
	Mouse mouse = new Mouse(15);
	mouse.print();
	}	
}
