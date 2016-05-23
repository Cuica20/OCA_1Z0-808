package autoboxing;

public class TooManyConversions {

	
	
	public static void play(Long l) { }
	public static void play(Long... l) { }
	public static void main(String[] args) {
		
	//A conversão(Autoboxing) em dois steps não pode ser realizada, caso existisse um método play(Object o) ele converteria de int para Integer e funcionaria já que Integer é um object, porém desta forma ele teria que converter para long e então para Long.	
	//play(4); // DOES NOT COMPILE
		
	play(4L); // calls the Long version
	
	
	}
}
