package trabalhandoComDatas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalcularDatasComCalendar {
	public static void main(String[] args) throws ParseException {
		Calendar calendarioCalendar = Calendar.getInstance(); //pega a data atual
		String DataSimulada = "05/02/2023";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		/*SIMULAR DATA VINDA POR DATABASE*/
		
		
		//calendarioCalendar.setTime(new SimpleDateFormat("dd/MM/yyyy").parse(DataSimulada)); 
		//seta uma data no calendar criado lá em cima, já criando um formato e passando ela de string para data ao mesmo tempo
		calendarioCalendar.setTime(simpleDateFormat.parse(DataSimulada));
		//seta a data no calendar criado lá em cima, e formata ela pelo SimpleDateFormat criado lá em cima tambem
		
		
		
		calendarioCalendar.add(Calendar.DAY_OF_MONTH, 5); // soma 5 dias ao dia setado do calendario
		calendarioCalendar.add(Calendar.MONTH, 1); //somou 1 mês a data setada 
		//System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(calendarioCalendar.getTime())); 
		// imprime já criando um formato, formatando e pegando a data
		System.out.println(simpleDateFormat.format(calendarioCalendar.getTime())); 
		// imprime a data, formatando com o simpleDateFormat criado lá em cima e pegando a data
	}
}
