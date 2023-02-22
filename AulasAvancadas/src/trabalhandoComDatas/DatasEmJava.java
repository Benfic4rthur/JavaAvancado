package trabalhandoComDatas;

import java.util.Date;

public class DatasEmJava {
	
@SuppressWarnings("deprecation")
public static void main(String[] args) {
	Date dataDate = new Date(); // cria um objeto data com a data atual
	int mes = dataDate.getMonth();
	int diaDaSemana = dataDate.getDay();
	String diadasemanaimpresso;
	String mesimpresso;
	switch (mes) {
	case 1:
		mesimpresso = "janeiro";
		break;
	case 2:
		mesimpresso = "fevereiro";
		break;
	case 3:
		mesimpresso = "março";
		break;
	case 4:
		mesimpresso = "abril";
		break;
	case 5:
		mesimpresso = "maio";
		break;
	case 6:
		mesimpresso = "junho";
		break;
	case 7:
		mesimpresso = "julho";
		break;
	case 8:
		mesimpresso = "agosto";
		break;
	case 9:
		mesimpresso = "setembro";
		break;
	case 10:
		mesimpresso = "outubro";
		break;
	case 11:
		mesimpresso = "novembro";
		break;
	case 12:
		mesimpresso = "Dezembro";
		break;
	default:
		mesimpresso = "Não informado";
		break;
	}
	switch (diaDaSemana) {
	case 0:
		diadasemanaimpresso = "Domingo";
		break;
	case 1:
		diadasemanaimpresso = "Segunda-Feira";
		break;
	case 2:
		diadasemanaimpresso = "Terça-Feira";
		break;
	case 3:
		diadasemanaimpresso = "Quarta-Feira";
		break;
	case 4:
		diadasemanaimpresso = "Quinta-Feira";
		break;
	case 5:
		diadasemanaimpresso = "Sexta-Feira";
		break;
	case 6:
		diadasemanaimpresso = "Sabado";
		break;
	default:
		diadasemanaimpresso = "Não informado";
		break;

	}
	System.out.println(dataDate); // retorna a data atual
	System.out.println("retorna a data completa em milisegundos " +dataDate.getTime()); 
	// 	retorna data em milisegundos
	System.out.println("retorna o ano atual " + (dataDate.getYear()+1900)); 
	//  retorna a data como base 1900 ou seja, imprimiria 123 pois o ano é 2023
	System.out.println("retorna o mês atual "+dataDate.getMonth() + " ou " + mesimpresso); 
	//  retorna o mês atual (começa em 0 em janeiro)
	System.out.println("retorna o dia do mês "+dataDate.getDate()); 
	//  retorna o dia do mês
	System.out.println("retorna o dia da semana "+dataDate.getDay() + " ou " + diadasemanaimpresso); 
	// 	retorna o dia da semana (começa em 0 no domingo)
	System.out.println("retorna a hora atual "+dataDate.getHours());
	// 	retorna a hora
	System.out.println("retorna o minuto atual " +dataDate.getMinutes());
	// 	retorna os minutos
	System.out.println("retorna o segundo atual "+ dataDate.getSeconds());
	// 	retorna os segundos
}
}
