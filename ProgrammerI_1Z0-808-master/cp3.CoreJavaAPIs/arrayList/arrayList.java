package arrayList;

import java.util.ArrayList;
import java.util.List;

public class arrayList {
	
	  public static void main(String[] args){
		  
		  
		  System.out.println("\n" + "");
		  
		  // Se não especificarmos o tipo do array, ele aceitará qualquer coisa.
		  ArrayList list = new ArrayList();
		  list.add("hawk"); // [hawk]
		  list.add(Boolean.TRUE); // [hawk, true]
		  System.out.println(list); // [hawk, true]
		  
		  System.out.println("\n" + "");

		  // Podemos especificar o tipo do array através de genérics(<>)
		  ArrayList<String> safer = new ArrayList<>();
		  safer.add("sparrow");
		  //safer.add(Boolean.TRUE); // DOES NOT COMPILE
		  System.out.println(safer);
		  
		  
		  System.out.println("\n" + "====add====");		  
		  //add
		  // Quando usamos o indice, ele sermpre respeitará o indice.		
		  List<String> birds = new ArrayList<>();
		  birds.add("hawk"); // [hawk]
		  birds.add(1, "robin"); // [hawk, robin]
		  birds.add(0, "blue jay"); // [blue jay, hawk, robin]
		  birds.add(1, "cardinal"); // [blue jay, cardinal, hawk, robin]
		  birds.add(0, "sabiá"); // [sabiá, blue jay, cardinal, hawk, robin]
		  System.out.println(birds); // [blue jay, cardinal, hawk, robin]
		  
		  
		  System.out.println("\n" + "=====remove====");
		  //remove()
		  //Remove o index ou a String especificada, se a String specificada não for encontrada,
		  //false será exibido, caso o index especificado não for encontrado uma exception é lançada.		  
		  List<String> birds2 = new ArrayList<>();
		  birds2.add("hawk"); // [hawk]
		  birds2.add("hawk"); // [hawk, hawk]
		  System.out.println(birds2.remove("cardinal")); // prints false
		  System.out.println(birds2.remove("hawk")); // prints true
		  //System.out.println(birds2.remove(5)); // Exception é lançada
		  System.out.println(birds2.remove(0)); // prints hawk
		  System.out.println(birds2); // []
		  
		  System.out.println("\n" + "====set====");
		  //Set
		  //Altera o conteudo do index especificado, sem alterar o tamanho.
		  List<String> birds3 = new ArrayList<>();
		  birds3.add("hawk"); // [hawk]
		  System.out.println(birds3.size()); // 1
		  birds3.set(0, "robin"); // [robin]
		  System.out.println(birds3.size()); // 1
		  //birds3.set(1, "robin"); // IndexOutOfBoundsException
		  
		  System.out.println("\n" + "====clear====");
		  //clear
		  //Depois de limpar, o array volta ao tamanho 0 e 
		  List<String> birds4 = new ArrayList<>();
		  birds4.add("hawk"); // [hawk]
		  birds4.add("hawk"); // [hawk, hawk]
		  System.out.println(birds4.isEmpty()); // false
		  System.out.println(birds4.size()); // 2
		  birds4.clear(); // []
		  System.out.println(birds4.isEmpty()); // true
		  System.out.println(birds4.size()); // 0
		  
		  
		  //O equals compara arrays com os mesmos elementos e na mesma ordem.
		  System.out.println("\n" + "====equals====");
		  List<String> one = new ArrayList<>();
		  List<String> two = new ArrayList<>();
		  System.out.println(one.equals(two)); // true
		  one.add("a"); // [a]
		  System.out.println(one.equals(two)); // false
		  two.add("a"); // [a]
		  System.out.println(one.equals(two)); // true
		  one.add("b"); // [a,b]
		  two.add(0, "b"); // [b,a]
		  System.out.println(one.equals(two)); // false
		  
	  }

}
