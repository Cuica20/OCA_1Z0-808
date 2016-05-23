package UnderstandingPolymorphism;

public interface HasTail {	
	public boolean isTailStriped();
	
	public static void eatGrass() {
	}
	
	public default int numberOfYears() {
		return 0;
	}
	
}
