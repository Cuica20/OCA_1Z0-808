package designingMethods;

public class ReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public void walk1() { }
	
	//Quando o tipo de retorno é void, pode ter uma afirmação ruturn sem valor.
	public void walk2() { return; }
	
	public String walk3() { return ""; }
		
	//O afirmação "return" é obrigatório no corpo do método, quando há um tipo de retorno que não seja Void na declaração do mesmo.
	//public String walk4() { } // DOES NOT COMPILE
	
	//É obrigatório na declaração de um método, o tipo de retorno.
	//public walk5() { } // DOES NOT COMPILE
	
	//A afirmação "return" deve estar visível ao método.
	//String walk6(int a) { if (a == 4) return ""; } // DOES NOT COMPILE
}
