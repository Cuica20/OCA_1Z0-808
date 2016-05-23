package InheritingVariables;

public class Jellyfish extends Animal {
	
	public int length = 5;
	
	public static void main(String[] args) {
		Jellyfish jellyfish = new Jellyfish();
		Animal animal = new Jellyfish();
		System.out.println(jellyfish.length);
		System.out.println(animal.length);
	}
}

/*
Notice the same type of object was created twice, but the reference to the object determines which value is seen as output.
*/