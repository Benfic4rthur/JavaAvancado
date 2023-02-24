package trabalhandoComDatas;

import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class AprendendoAFormatarDatas {
	public static void main(String[] args) throws ParseException {
		
		Date dataDate = new Date(); 
		// chama o objeto com a data
		
		SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy"); 
		// o formato deve ser passado como argumento neste objeto
		
		System.out.println(dataFormatada.format(dataDate)); 
		//pegamos o objeto de formatação e concatenamos
		//com a formatação passando como argumento o objeto que coleta de data que é convertido para String
		
		SimpleDateFormat dataFormatadaDB = new SimpleDateFormat("yyyy-MM-dd"); 
		//formato mais utilizado para bancos de dados
		
		System.out.println(dataFormatadaDB.format(dataDate));
		//imprime a data geralmente utilizada para banco de dados
		
		SimpleDateFormat dataFormatadaMinutagem = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss"); 
		//formato com horas, minutos e segundos
		
		System.out.println(dataFormatadaMinutagem.format(dataDate)); 
		
		SimpleDateFormat dataFormatadaPortugues = new SimpleDateFormat("dd/MMM/yyyy", new Locale("pt", "BR"));
		// formata para portguês
		System.out.println(dataFormatadaPortugues.format(dataDate));
		
		SimpleDateFormat dataFormatadatipoparse = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", new Locale("pt", "BR"));
		// cria um formato com dia da semana, mes, dia do mes, hora, minuto, segundo, Fuso horário abreviado em três letras e ano atual
		DateFormatSymbols symbols = new DateFormatSymbols(new Locale("pt", "BR")); 
		// pega a localização para traduzir as abreviações para o nosso idioma
		symbols.setShortMonths(new String[] { "Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez" });
		// traduz os meses
		symbols.setShortWeekdays(new String[] { "", "Dom", "Seg", "Ter", "Qua", "Qui", "Sex", "Sáb" });
		// traduz os dias da semana
		dataFormatadatipoparse.setDateFormatSymbols(symbols);
		/* Essa linha de código está definindo os símbolos de formatação de datas 
		 * para o objeto dataFormatadatipoparse, que foi criado para fazer o parse da data no formato "EEE MMM dd HH:mm:ss zzz yyyy" */
		
		System.out.println(dataFormatadatipoparse.format(dataDate)); // criado do zero com as abreviações em portugues,
		//praticamente como se tivesse traduzido o que vem pelo metodo parse nativo
		
		System.out.println(dataFormatada.parse("20/02/2023"));// resultado em ingles
		/*
		 * O método parse() é utilizado para analisar uma string que contém uma data no formato especificado por um objeto SimpleDateFormat, 
		 * e retorna um objeto Date que representa essa data.
		 * */
	}
}
