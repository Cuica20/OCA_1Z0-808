package DeclaracaoVariaveis;

public class Scopo {
	
	
	static int x = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
//		Se uma variável int x fosse declarado dentro desse scopo uma checked exception seria lançada.
		
		int[] nums = {0,1,2,3,4};
		for (int x : nums) {
			System.out.println(x);			
		}		
		
	}

}

class Scopo2{
	
	public static void main(String[] args) {

		
		int i = 1;
		
		do{
			
//			Se o int fosse declarado aqui dentro não estaria visível ao escop do while e uma checked exception seria lançada.
//			int i = 1;
			System.out.println(i++ + "");
		}while(i <=5);
		
		
		
	}
	
	
}
