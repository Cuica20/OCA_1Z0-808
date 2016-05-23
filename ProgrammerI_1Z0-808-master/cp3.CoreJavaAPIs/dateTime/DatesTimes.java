package dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DatesTimes {

	public static void main(String[] args) {
		
		// O método now retorna a data local de onde o SO está sendo executado 
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		
		System.out.println("\n");
		
		//Ambos criam a mesma data
		LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
		LocalDate date2 = LocalDate.of(2015, 1, 20);
		
		
		System.out.println("\n");
		//Apesar de d ser DateTime, A saida do metodo formater é apenas a hora
		LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
		Period p = Period.of(1, 2, 3);
		d = d.minus(p);
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT); 
		System.out.println(d.format(f));
		
	
		System.out.println("\n");
		//Periodo não permite encademanto, apenas o útimo método chamado contém a alteração
		LocalDateTime d2 = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
		Period p2 = Period.ofDays(1).ofYears(2);
		d2 = d2.minus(p2);
		DateTimeFormatter f2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println(f2.format(d2));
		
	}

}
