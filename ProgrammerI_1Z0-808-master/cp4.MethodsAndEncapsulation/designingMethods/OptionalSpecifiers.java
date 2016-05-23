package designingMethods;

public class OptionalSpecifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public void walk1() {}
	public final void walk2() {}
	public static final void walk3() {}
	public final static void walk4() {}
	
	//"Modifier" não é um tipo de Especificador válido.
	//public modifier void walk5() {} // DOES NOT COMPILE
	
	//O Especificador deve ser declarados antes ou depois do Modificador de Acesso.
	//public void final walk6() {} // DOES NOT COMPILE
	
	
	//Java allows the optional specifiers to appear before the access modifier
	final public void walk7() {}	
	static public void walk8(){}
	final static public void walk9(){}
		

}
