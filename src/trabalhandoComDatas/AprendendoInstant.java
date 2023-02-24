package trabalhandoComDatas;

import java.time.Duration;
import java.time.Instant;

public class AprendendoInstant {
	public static void main(String[] args) throws InterruptedException {
		Instant inicio = Instant.now();
		//inicia a contagem do instante ou instante inicial
		
		Thread.sleep(1000); 
		// da um tempo entre o inicio e fim
		
		Instant ifinal = Instant.now(); 
		//pega o outro instante considerado o instante final
		
		Duration duracao = Duration.between(inicio, ifinal); 
		// faz a comparação entre inicio e fim para ter o retorno de um valor
		
		System.out.println("Duração em nanosegundos: "+duracao.toNanos()); 
		//imprime a duração entre os instantes em nanosegundos
		
		System.out.println("Duração em horas: "+duracao.toHours());
		//imprime a duração entre os instantes em horas
		
		System.out.println("Duração em minutos: "+duracao.toMinutes());
		//imprime a duração entre os instantes em minutos
		
		System.out.println("Duração em dias: "+duracao.toDays());
		//imprime a duração entre os instantes em dias
	}
}
