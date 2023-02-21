package trabalhandoComDatas;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FaixaDeTempoComChronoUnit {
	public static void main(String[] args) throws ParseException { //não pode esquecer da ParseException
		long dias = ChronoUnit.DAYS.between(LocalDate.parse("2021-01-01"), LocalDate.now());
		// o ChronoUnit, entrega datas de diversas formas, neste caso como foi utilizado um between que é "ENTRE", ele vai contar o tipo de data
		// escolhido que no caso é DAYS entre a data inicial e a data de hoje, capturado pelo LocalDate.now()
		// pode-se descobiri , dias, meses, anos, semanas, horas, minutos, decadas, seculos, meio dia, entre as datas com ChronoUnit
		System.out.println("Seu boleto esta "+dias+" dias em atraso");
	}	
}