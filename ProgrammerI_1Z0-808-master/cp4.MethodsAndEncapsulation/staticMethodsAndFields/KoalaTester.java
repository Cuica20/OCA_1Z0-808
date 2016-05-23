package staticMethodsAndFields;

public class KoalaTester {
	
	//Métodos státicos podem ser chamados diretamente, sem a necessidade de instanciá-los
	
	public static void main(String[] args) {
				
		//O main é um método estático.
		Koala.main(new String[0]); // call static method		
		
		{	
		//Chamada direta, sem instância.	
		System.out.println(Koala.count);
		Koala.main(new String[0]);
		}
						
		{
		//Chamada com instancia
		Koala k = new Koala();
		System.out.println(k.count); // saída: 0
		}
			
		{
		//Chamada com instância, veja que mesmo "k" sendo null, não interfiril no resultado pois a variável "count" é stático.
		Koala k = new Koala();
		k = null;
		System.out.println(k.count); // saída: 0
		}
		
		{
		//Chamada através de instância, veja que a variável "count" por ser stática é a mesma para todas as instâncias, por isso o útlimo valor atribuído será o exibido.
		Koala.count = 4;
		Koala koala1 = new Koala();
		Koala koala2 = new Koala();
		koala1.count = 6;
		koala2.count = 5;
		System.out.println(Koala.count); // saída: 5
		}
	}
}
