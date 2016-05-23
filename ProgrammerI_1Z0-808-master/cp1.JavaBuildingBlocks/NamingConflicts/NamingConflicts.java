package NamingConflicts;

import java.util.Date;

//Duas classes iguais importadas causam erro de compilação.
//import java.sql.Date;


//Apesar da classe Date estar dentro do sql, por ter sido especificado a classe Date do pacote Util acima, o compilador entende que quando for referenciada a classe Date, é deste pacote (Util) que será utilizada.
import java.sql.*;



class ClassesVsFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Porém, caso em algum momento eu queira usar o SQL Date, basta especificar na declaração.
		java.sql.Date date = new java.sql.Date(01012015);

	}
}

