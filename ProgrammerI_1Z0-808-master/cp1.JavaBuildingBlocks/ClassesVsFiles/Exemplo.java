package ClassesVsFiles;


//Podem duas classes existirem no mesmo arquivo, desde que o nome do arquivo.java seja correspondente a classe que contém o método main.
class Exemplo {
	
	public static void main(String[] args){
		
		Exemplo2 ex = new Exemplo2();
		ex.setMsg("Hi");
		
		System.out.println(ex.getMsg());
	}
	
}

class Exemplo2{
	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	
}
