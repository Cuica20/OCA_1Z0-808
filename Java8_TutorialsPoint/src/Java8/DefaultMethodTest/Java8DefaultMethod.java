/**
 * 
 */
package Java8.DefaultMethodTest;

/**
 * @author Java 8 introduce un nuevo concepto de implementación del método por
 *         defecto en las interfaces. Se añade esta capacidad para la
 *         compatibilidad hacia atrás de modo que las viejas interfaces se
 *         pueden utilizar para aprovechar la capacidad de expresión de lambda
 *         de Java 8. Por ejemplo, 'Lista' o interfaces de 'Collection' no
 *         tienen declaración de método 'forEach'. Por lo tanto, la adición de
 *         estos métodos simplemente romper las realizaciones de marco
 *         colección. Java 8 introduce método predeterminado para que la
 *         interfaz de lista / Colección puede tener una implementación por
 *         defecto del método forEach, y la clase que implementa estas
 *         interfaces no tiene por qué poner en práctica la misma.
 *
 */
public class Java8DefaultMethod {

	/**
	 * With default functions in interfaces, there is a possibility that a class
	 * is implementing two interfaces with same default methods. The following
	 * code explains how this ambiguity can be resolved.
	 * 
	 */
	public static void main(String args[]){
	      Vehicle vehicle = new Car();
	      vehicle.print();
	   }
	}

	interface Vehicle {
	   default void print(){
	      System.out.println("I am a vehicle!");
	   }
		
	   default void blowHorn(){
	      System.out.println("Blowing horn!!!");
	   }
	}

	interface FourWheeler {
	   default void print(){
	      System.out.println("I am a four wheeler!");
	   }
	   static void print2(){
		  System.out.println("Print 2");
	   }
	}
	
	interface Bus {
		default void print(){
			  System.out.println("Print");
		}
	}

	class Car implements Vehicle, FourWheeler,Bus {
	   public void print(){
	      Vehicle.super.print();
	      Vehicle.super.blowHorn();
	      FourWheeler.super.print();
	      FourWheeler.print2();
	      Bus.super.print();
	      System.out.println("I am a car!");
	   }
	}