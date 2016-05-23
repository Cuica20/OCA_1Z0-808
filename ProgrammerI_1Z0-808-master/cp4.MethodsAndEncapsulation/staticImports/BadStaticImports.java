package staticImports;

//Import Errado.
//import static java.util.Arrays; // DOES NOT COMPILE

import static java.util.Arrays.asList;

//Ordem de import errada.
//static import java.util.Arrays.*; // DOES NOT COMPILE

public class BadStaticImports {

	
	
	public static void main(String[] args) {
		//O membro estático "asList" foi importado, porém a classe Arrays não.
		//Arrays.asList("one"); // DOES NOT COMPILE
	}
	
}
