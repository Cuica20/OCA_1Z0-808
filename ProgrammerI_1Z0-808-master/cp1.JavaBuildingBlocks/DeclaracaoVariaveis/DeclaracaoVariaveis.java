package DeclaracaoVariaveis;

import java.util.ArrayList;
import java.util.List;

public class DeclaracaoVariaveis {		
	
	//Variável de classe
	static int var = 0;
	
	//Variável de Instância
	int var1;
	
	
	//Aqui existem duas variaveis de escopo, o parametro também é uma variável de escopo
	public static void variavelEscopo(int i){
		i = 5;
		int x = i;		
	}	
	

	public static void main(String[] args) {
		
		List list = new ArrayList(1);
		
		// TODO Auto-generated method stub
		
		
		
		
		for(int var = 2; var < 5; var++){
			System.out.println(var);
		}
		
		
		//tipos flutuantes permitem anderscore desde que não seja no começo fim ou entre pontos
		double d = 1_000_000.00;
		
		//Não compila
		//double d1 = _100;
		
		
		//Permite Declarção de multiplas variáveis na mesma linha
		int i, n, t = 0;
		
		//Não permite tipos diferentes na mesma linha
		//int i2, String s;
		
	}

}
