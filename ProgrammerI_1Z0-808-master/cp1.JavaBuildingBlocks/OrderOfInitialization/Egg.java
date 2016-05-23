package OrderOfInitialization;

// O compilador inicializa, variaveis de instancias, blocos, construtor e metodos na ordem em que aparecerem


	public class Egg {
	
	public Egg() {
		number = 5;
	}
		
	public static void main(String[] args) {
		Egg egg = new Egg();
		System.out.println(egg.number);
	}	
	
	{ number = 4; }
	
	private int number = 3;
	
	{ number = 6; }
	
	
}
