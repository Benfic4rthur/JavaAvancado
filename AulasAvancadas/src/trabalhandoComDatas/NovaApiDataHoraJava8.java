package trabalhandoComDatas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class NovaApiDataHoraJava8 {
	public static void main(String[] args) {
		/*Aprendendo a utilizar a nova API*/
		
		
		LocalDate dataAtuaLocalDate = LocalDate.now();//apenas a data dia-mes-ano
		System.out.println("Data atual: "+dataAtuaLocalDate); // original da API
		System.out.println("Data atual formatada: "+dataAtuaLocalDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))); // formatado
		
		LocalTime horaAtuaLocalTime = LocalTime.now();// hora atual hora-min-seg-milis
		System.out.println("Hora atual: "+horaAtuaLocalTime); // original da API
		System.out.println("Hora atual formatada: "+horaAtuaLocalTime.format(DateTimeFormatter.ofPattern("HH:mm:ss.ms"))); // formatado
		
		LocalDateTime dataHoraAtuaLocalDateTime = LocalDateTime.now(); // pega data e hora completas
		System.out.println("Data e hora atual: "+dataHoraAtuaLocalDateTime); //original
		System.out.println("Data e hora atual formatados: " + dataHoraAtuaLocalDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.ms")));
		
		
		/*aprendendo a formatar na nova API*/
		
		//ofPattern = para o padrão
		System.out.println("Primeiro teste formatação: "+dataHoraAtuaLocalDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.ms")));
		
	}
}
