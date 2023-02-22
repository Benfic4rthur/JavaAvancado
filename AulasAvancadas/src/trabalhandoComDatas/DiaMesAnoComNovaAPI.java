package trabalhandoComDatas;

import java.time.LocalDate;

public class DiaMesAnoComNovaAPI {
	public static void main(String[] args) {
		
		//instancia a data atual com o localdate
		LocalDate dataAtuaLocalDate = LocalDate.now();
		
		/*DESCOBRINDO DIA DA SEMANA MESES E ANOS COM A NOVA API*/
		
		System.out.println("Dia da semana com a nova API: "+dataAtuaLocalDate.getDayOfWeek());
		//IMPRIME O DIA DA SEMANA EM INGLêS, PODE SE FAZER UM SWITCH PARA TRADUZI-LOS
		
		System.out.println("Dia do mês com a nova API: "+dataAtuaLocalDate.getDayOfMonth());
		//nada mais que o dia atual
		
		System.out.println("Dia do ano com a nova API: "+dataAtuaLocalDate.getDayOfYear());
		//pega o dia do ano entre 0-365
		
		System.out.println("Mês em número com a nova api: "+dataAtuaLocalDate.getMonthValue());
		//retorna de 1-12
		
		System.out.println("mês com a nova api: "+dataAtuaLocalDate.getMonth());
		//retorna o nome do mês
		
		System.out.println("Ano atual com a nova api: "+dataAtuaLocalDate.getYear());
		//retorna o ano atual
	}
}