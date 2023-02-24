package trabalhandoComDatas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class ExemploGeraParcelaMensal {
	public static void main(String[] args) throws ParseException {
		Date dataInicial = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2023"); //data inicial
		/*SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date datainicial = formato.parse("01/01/2023");
		faz a mesma coisa que a linha unica em cima
		*/
		Calendar calendar = Calendar.getInstance(); //chama o calendario
		calendar.setTime(dataInicial); //seta a dataInicial
		
		for (int parcela = 1; parcela <= 12; parcela++) {
			calendar.add(Calendar.MONTH, 1); //pega a data inserida no calendar e insere um mes a cara repetição do for
			//é utilizado o .add(calendar.month, 1) para adicionar o mês
			System.out.println("Parcela de numero " + parcela + " vencimento é em " + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		}	
	}
}