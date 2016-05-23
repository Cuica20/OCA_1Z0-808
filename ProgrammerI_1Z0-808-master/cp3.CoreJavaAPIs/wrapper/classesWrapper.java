package wrapper;

public class classesWrapper {
	public static void main(String[] args) {
		
		// Classes wrapper converte para primitivo ou para wrapper
		
		//converte para Int
		int primitive = Integer.parseInt("123");
		
		//converte para Integer
		Integer wrapper = Integer.valueOf("123");
		
		// throws NumberFormatException
		int bad1 = Integer.parseInt("a");
		
		// throws NumberFormatException
		Integer bad2 = Integer.valueOf("123.45");	
	}

}
