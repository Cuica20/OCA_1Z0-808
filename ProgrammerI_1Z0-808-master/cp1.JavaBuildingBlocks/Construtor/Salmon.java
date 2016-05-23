package Construtor;

public class Salmon {

	int count;
	
	//Isso não é um construtor por possuir um tipo de retorno, o construtor default é chamado e printa o valor default do atributo. 
	public void Salmon(){
		count = 4;
	}
	
	public static void main(String[] args) {
		Salmon s = new Salmon();
		System.out.println(s.count);
		
		// TODO Auto-generated method stub
	}

}
