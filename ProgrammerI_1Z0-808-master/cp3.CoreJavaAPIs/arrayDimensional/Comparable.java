package arrayDimensional;

import java.util.Arrays;

public class Comparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] strings = {{"A", "Z"},{"C","D","S"},{"L"}};
		
		
		
//		O método sort tenta fazer um cast para comparable, porém arrays bidimensionais não são comparable 
//		por isso uma ClasCastException é lançada.
		
		Arrays.sort(strings);
		
		
		for (String[] str : strings) {
			for (String s : str) {
				System.out.println(s);
			}
		}
		
		
	}

}
