/**
 * 
 */
package Java8.DefaultMethodTest;

/**
 * @author Java 8 introduce un nuevo concepto de implementaci�n del m�todo por
 *         defecto en las interfaces. Se a�ade esta capacidad para la
 *         compatibilidad hacia atr�s de modo que las viejas interfaces se
 *         pueden utilizar para aprovechar la capacidad de expresi�n de lambda
 *         de Java 8. Por ejemplo, 'Lista' o interfaces de 'Collection' no
 *         tienen declaraci�n de m�todo 'forEach'. Por lo tanto, la adici�n de
 *         estos m�todos simplemente romper las realizaciones de marco
 *         colecci�n. Java 8 introduce m�todo predeterminado para que la
 *         interfaz de lista / Colecci�n puede tener una implementaci�n por
 *         defecto del m�todo forEach, y la clase que implementa estas
 *         interfaces no tiene por qu� poner en pr�ctica la misma.
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