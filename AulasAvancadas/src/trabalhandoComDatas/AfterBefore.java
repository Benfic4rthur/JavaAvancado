package trabalhandoComDatas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AfterBefore {
	public static void main(String[] args) throws ParseException {
		Date dataAtual = new Date(); // cria um objeto de data atual
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); // cria um formato para a data
		Date databoletoDate = formato.parse("20/03/2023"); // informar a data do boleto
		String dataFormatada = formato.format(dataAtual); // pega a data atual do objeto e transfora em uma string formatando-a com o formato
		Date datadate = formato.parse(dataFormatada); // pega a string da data atual formatada e transforma em Date
		if(databoletoDate.after(datadate)) { // faz um if, se databoletoDate for posterior ao dia atual
			//after serve para datas é como se fosse um maior que
			System.out.println("Seu boleto esta em dia!");
		}else if(databoletoDate.before(datadate)){ // faz um if, se databoletoDate for anterior ao dia atual
			//before serve para datas é como se fosse um menor que
			System.out.println("Seu boleto esta vencido!");
		}else if (databoletoDate.equals(datadate)) { //o equals compara se são iguais, padrão para objetos
			System.out.println("Seu boleto vence hoje!");
			//after é se data1 é maior que data2
			//before é se data1 é menor que data2
		}
	}
}