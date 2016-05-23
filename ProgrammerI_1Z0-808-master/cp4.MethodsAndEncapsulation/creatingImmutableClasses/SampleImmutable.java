package creatingImmutableClasses;

//Classes imutáveis são classes que não possuem o método set, portanto o atributo recebe valor apenas na inicialização do objeto.

public class SampleImmutable {
	
	private int numberEggs;

	public SampleImmutable(int numberEggs) {
		this.numberEggs = numberEggs;
	}
	
	public int getNumberEggs() {
		return numberEggs;
	}
}
