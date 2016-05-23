public class Identifiers {

	public void A$B() {
		System.out.println("Legal identifier");
	}

	public void true() {
		System.out.println("Illegal identifier caused by keyword usage");
	}

	public void Public() {
		System.out.println("Legal identifier");
	}

	public void _helloWorld() {
		System.out.println("Legal identifier");
	}

	public void java.lang() {
		System.out.println("Illegal identifier caused by dot usage");
	}

	public void 1980_s() {
		System.out.println("Illegal identifier caused by starting with a number");
	}

}