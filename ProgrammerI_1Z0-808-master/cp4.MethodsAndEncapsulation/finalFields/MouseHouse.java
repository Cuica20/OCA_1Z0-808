package finalFields;

public class MouseHouse {
	// TODO Auto-generated method stub
	private final int volume;
	private final String name = "The Mouse House";
	
	
	// Campos com especificador Final, podem ser atribuídos valor apenas uma vez, também dentro do construtor.
	
	public MouseHouse(int length, int width, int height) {
		volume = length * width * height;
	}
	
}
