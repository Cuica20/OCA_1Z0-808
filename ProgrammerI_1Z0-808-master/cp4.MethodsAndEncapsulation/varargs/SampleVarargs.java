package varargs;

public class SampleVarargs {
	
	//Vargs são como arrays, porém sempre deve ser o último parametro, e portanto só pode haver um por declaração.
	
	
	public void walk1(int... nums) { }
	
	public void walk2(int start, int... nums) { }
	
	//Deve ser último parâmetro.
	//public void walk3(int... nums, int start) { } // DOES NOT COMPILE
	
	//Só pode haver um por declaração.
	//public void walk4(int... start, int... nums) { } // DOES NOT COMPILE

}
