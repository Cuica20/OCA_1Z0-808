package SwitchCase;

public class DiaComCaseDefault {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String diaDaSemana = "Quarta";

		switch (diaDaSemana) {		
		
//			Case default só é executado quando nenhum case foi encontrado independente da posição onde ele esteja.			
			default: System.out.println("voce não encontrou o dia");
				break;
			case "Domingo": System.out.println("Você informou o dia 1"); 
				break;
			case "Segunda": System.out.println("Você informou o dia 2"); 
				break;
			case "Terça": System.out.println("Você informou o dia 3"); 
				break;
			case "Quarta": {System.out.println("Você informou o dia 4");} 
				break;
			case "Quinta": System.out.println("Você informou o dia 5"); 
				break;
			case "Sexta": System.out.println("Você informou o dia 6"); 
				break;
			case "Sábado": System.out.println("Você informou o dia 7");
				break;

		}
	}
}
