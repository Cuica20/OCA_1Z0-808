package SwitchCase;

public class DiaSemBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String diaDaSemana = "Quarta"; 
		
		
		switch (diaDaSemana) { 
		
			case "Domingo": System.out.println("Você informou o dia 1"); 
				 
			case "Segunda": System.out.println("Você informou o dia 2"); 
				 
			case "Terça": System.out.println("Você informou o dia 3"); 
				
			case "Quarta": System.out.println("Você informou o dia 4"); 
				 
			case "Quinta": System.out.println("Você informou o dia 5"); 
				 
			case "Sexta": System.out.println("Você informou o dia 6"); 
				 
			case "Sábado": System.out.println("Você informou o dia 7");

		}		
		
//		Sem o break todas as condições são verdadeiras a partir da primeira encontrada

	}

}
