package InheritingClass;

public class Pickup extends Cars {

	public Pickup() {
		// TODO Auto-generated constructor stub
	}
	
	Pickup car = new Pickup();

	public void velocity(int velocidade) {
		
	}

	@Override
	public void velocity() {
		System.out.println("Rodando");
		
	}
	
	public int portas(){
		
		return 4;
	}
	

}
