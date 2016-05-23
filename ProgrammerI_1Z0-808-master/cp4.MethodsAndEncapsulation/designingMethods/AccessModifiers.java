package designingMethods;

public class AccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public void walk1() {}
	
	//O modificador de acesso default deve ser omitido na delcaração de um método.	
	//default void walk2() {} // DOES NOT COMPILE
	
	//O modificador de acesso sempre vem antes do tipo de retorno.
	//void public walk3() {} // DOES NOT COMPILE
	
	void walk4() {}

}
