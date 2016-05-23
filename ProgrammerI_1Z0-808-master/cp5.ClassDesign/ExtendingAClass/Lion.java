package ExtendingAClass;

	public class Lion extends Animal {
		
	@SuppressWarnings("unused")
	private void roar() {
		
		//The method getAge � a herons from class parent Animal
		System.out.println("The "+getAge()+" year old lion says: Roar!");
		
		/*Therefore an instance off Lion can't access the private attribute age off 
		 * the Animal class, an instance off Lion is "bigger" then an instance off
		 * Animal class, because it's can access indirectly all attribute off Animal 
		 * and all attribute off Lion Class  
		 * */
	}
}