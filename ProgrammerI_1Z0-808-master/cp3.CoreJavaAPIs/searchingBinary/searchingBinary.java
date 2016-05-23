package searchingBinary;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class searchingBinary {

	public static void main(String[] args){
		
	    //Procura por binary code só é previsível em lista ordenada, considere indice negativo e subtraia - 1:
		
		int[] numbers = {2,4,6,8};
		
		System.out.println(Arrays.binarySearch(numbers, 2)); // 0
		System.out.println(Arrays.binarySearch(numbers, 4)); // 1
		
		//(embora 1 não exista, deveria ser inserido no indice 0, 0 - 1 = -1)
		System.out.println(Arrays.binarySearch(numbers, 1));
		
		//(embora 3 não exista, deveria ser inserido no indice 1, -1 - 1 = - 2)
		System.out.println(Arrays.binarySearch(numbers, 3)); // -2
		
		//(embora 9 não exista, deveria ser inserido no indice 4, -4 - 1 = - 5)
		System.out.println(Arrays.binarySearch(numbers, 9)); // -5
		
		
		System.out.println("\n");
		
		//Procura por binaryCode em lista desordenada é imprevisível veja o resultado na segunda linha:		
		int[] numbers2 = {3,2,1};		
		//indice esperado
		System.out.println(Arrays.binarySearch(numbers2, 2));
		//indice inesperado
		System.out.println(Arrays.binarySearch(numbers2, 3));
		
		
		List<String> hex = Arrays.asList("30", "8", "3A", "FF");
		Collections.sort(hex);
		int x = Collections.binarySearch(hex, "8");
		int y = Collections.binarySearch(hex, "3A");
		int z = Collections.binarySearch(hex, "4F");
		System.out.println(x + " " + y + " " + z);
		
	}
}
