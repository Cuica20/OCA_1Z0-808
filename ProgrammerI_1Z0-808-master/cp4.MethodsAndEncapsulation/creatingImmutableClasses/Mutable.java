package creatingImmutableClasses;

// Agora podemos dizer que a classe é mutável.
public class Mutable {

	private StringBuilder builder;
	
	//A solution is to make a copy of the mutable object. This is called a defensive copy.
	public Mutable(StringBuilder b) {
		builder = new StringBuilder(b);
	}
	
	//O objeto builder sempre retornará a referencia inicial atribuída na inicialização do objeto.
	public StringBuilder getBuilder() {
		return new StringBuilder(builder);
	}
	
	public static void main(String[] args){		
		StringBuilder sb = new StringBuilder("initial");
		Mutable noProblem = new Mutable(sb);
	
		sb.append(" added");
		StringBuilder gotBuilder = noProblem.getBuilder();
		gotBuilder.append(" more");
		System.out.println(noProblem.getBuilder());
		//E a saída seria "more".		
	}
}
