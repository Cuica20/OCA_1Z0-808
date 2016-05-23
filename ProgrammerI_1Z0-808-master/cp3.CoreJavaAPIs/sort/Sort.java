package sort;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args){
		
		// Ordena de forma númerica
		int[] numbers = { 6, 9, 1 };
		Arrays.sort(numbers);
		System.out.println("\n");
		for (int i = 0; i < numbers.length; i++){
			System.out.print (numbers[i] + " ");
		}
		
		
		//Ordena de forma alfanumérica, por isso o 1 vem sempre antes do 9
		String[] string = {"10","9","100"};
		Arrays.sort(string);
		System.out.println("\n");
		for (String string2 : string) {
			System.out.println(string2);
		}
		
		//Ordena de forma alfanumérica, Maíusculas sempre vem antes do que Minúsculas
		String[] string3 = {"Abc","abc","ABC"};
		Arrays.sort(string3);
		System.out.println("\n");
		for (String string4 : string3) {
			System.out.println(string4);
		}
		
		//Ordena de forma alfanumérica, Números sempre vem antes do que Letras
		String[] string5 = {"Abc","abc","ABC", "123"};
		Arrays.sort(string5);
		System.out.println("\n");
		for (String string6 : string5) {
			System.out.println(string6);
		}
		
		
		
		
		
	}
	
	
}
