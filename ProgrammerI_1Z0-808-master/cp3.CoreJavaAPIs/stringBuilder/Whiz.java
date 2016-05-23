package stringBuilder;

public class Whiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] chars = {'1','Z','0','-','8','1'};
		
		StringBuilder sb = new StringBuilder();
		sb.append(chars,0,chars.length);
		sb.append("0");
		sb.append('8');
		System.out.println(sb);
	}

}
