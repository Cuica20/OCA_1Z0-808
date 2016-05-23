package wrapper;

public class CastNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object obj = new Double(10);
		
//		Um ClassCastException não ocorre porque o Number é uma SuperClasse de Double
		Number num = (Number) obj;
		System.out.println(num);
	}

}
