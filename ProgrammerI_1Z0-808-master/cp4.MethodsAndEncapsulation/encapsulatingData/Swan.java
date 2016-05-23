package encapsulatingData;



//Encapsulamento, é o recurso utilizado para controlar o acesso aos atributos, através dos métodos get e set. 

public class Swan {
	
	
	//Suponhamos que o atributo numberEggs não pode receber um valor negativo, esse controle pode ser feito através do método set 
	
	private int numberEggs; // private
	
	//getter
	public int getNumberEggs() {		
		return numberEggs;
	}
	
	// setter
	public void setNumberEggs(int numberEggs) {
		// guard condition
		if (numberEggs >= 0) 
			this.numberEggs = numberEggs;
	}
	
}

