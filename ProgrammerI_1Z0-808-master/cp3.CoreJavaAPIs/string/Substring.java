package string;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//O indice, inicia no index e vai até uma posição anterior ao index final
		String numbers = "012345678";
		System.out.println(numbers.substring(1, 3));
		System.out.println(numbers.substring(7, 8));
		System.out.println(numbers.substring(7));
		
		
		//O mesmo ocorre pro delete
		System.out.println("\n");
		StringBuilder b = new StringBuilder("rumble");
		b.append(4);
		b.deleteCharAt(3);
		b.delete(3, b.length()-1);
		System.out.println(b);
		

	}

}
