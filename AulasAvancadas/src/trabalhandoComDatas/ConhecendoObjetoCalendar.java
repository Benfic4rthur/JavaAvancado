package trabalhandoComDatas;

import static java.util.Calendar.MONTH;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ConhecendoObjetoCalendar {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println("Ano: "+calendar.get(Calendar.YEAR)); 
		// imprime o ano
		System.out.println("Mês: "+(calendar.get(MONTH)+1)); 
		// imprime o mes inicia em janeiro = 0, por isso o +1 pra ficar igual ao real
		System.out.println("Dia da semana: "+(calendar.get(Calendar.DAY_OF_WEEK)-1));
		// imprime o dia da semana inicia em segunda = 1, por isso o -1 para que fique igual ao date, mas só pra caso de igualidade	
		//nada obrigatorio
		System.out.println("Dia do mês: "+ calendar.get(Calendar.DAY_OF_MONTH)); 
		// imprime o dia do mes 
		System.out.println("Dia do mês contando quantidade de semanas: "+calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH)); 
		// imprime dia da semana no mes tipo segunda é 1 se estivermos na terceira semana do mes e na segunda sera 1 + 1 + 1 = 3
		System.out.println("Dia do ano: "+calendar.get(Calendar.DAY_OF_YEAR)); 
		// imprime dia do ano
		System.out.println("Hora: "+calendar.get(Calendar.HOUR)); 
		// hora
		System.out.println("Hora do dia: " +calendar.get(Calendar.HOUR_OF_DAY)); 
		// hora do dia baseado em 24hrs
		System.out.println("Minuto da hora: "+calendar.get(Calendar.MINUTE)); 
		// minuto
		System.out.println("Segundo do minuto: "+ calendar.get(Calendar.SECOND)); 
		// segundos
		System.out.println("Calendar data atual: "+Calendar.getInstance().getTime());
		//data atual
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Calendar data atual com formatação criada préviamente: "+ simpleDateFormat.format(calendar.getTime()));
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd"); // não precisa instanciar o SimpleDateFormat do zero, pode puxar o objeto
		//criado anteriormente para criar uma nova formatação
		System.out.println("Calendar nova formatação para DB: "+simpleDateFormat.format(calendar.getTime()));
	}

}
