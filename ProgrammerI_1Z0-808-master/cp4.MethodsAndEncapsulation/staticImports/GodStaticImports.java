package staticImports;

import java.util.List;

//Import Estáticos importam apenas membros Estáticos.

import static java.util.Arrays.*; // static import

public class GodStaticImports {

	public static void main(String[] args) {
		List<String> list = asList("one", "two"); // no Arrays.
	} 
}
