package CallingInheritedClassMembers;

public class Shark extends Fish{
	private int numberOfFins = 8;
	
	public Shark(int age) {
		super(age);
		this.size = 4;
	}
}
