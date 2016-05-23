package lambdaExpressions;

public class CheckIfHopper implements CheckTrait {
	
	//se quizessemos verificar também se o animal pode nadar, deveríamos criar mais um método, e fazermos a chamada.
	public boolean test(Animal a) {
		return a.canHop();
		}
}
