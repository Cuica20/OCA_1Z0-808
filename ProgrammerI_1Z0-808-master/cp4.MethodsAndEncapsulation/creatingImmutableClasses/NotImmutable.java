package creatingImmutableClasses;


//Aprentemente a classe é imutável, mas não é.
public class NotImmutable {
	
	private StringBuilder builder;
	
	public NotImmutable(StringBuilder b) {
		builder = b;
	}
	
	//O objeto builder tem o sua referência alterada a cada nova chamada
	public StringBuilder getBuilder() {
		return builder;
	}
	
	public static void main(String[] args){		
		StringBuilder sb = new StringBuilder("initial");
		NotImmutable problem = new NotImmutable(sb);
	
		sb.append(" added");
		StringBuilder gotBuilder = problem.getBuilder();
		gotBuilder.append(" more");
		System.out.println(problem.getBuilder());
		//E a saída seria "initial added more".		
	}	
}
