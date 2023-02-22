package trabalhandoComDatas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AulaoFinalDatas {
	public static void main(String[] args) {

		System.err.println("/**DATAS COM PLUS**/");

		LocalDate dataBase = LocalDate.parse("2023-01-01");
		System.out.println("Data base    :  " + dataBase);
		// data base
		System.out.println("Mais 5 dias  :  " + dataBase.plusDays(5));
		// data base + 5 dias
		System.out.println("Mais 5 dias  :  " + dataBase.plusWeeks(5));
		// data base + 5 semanas
		System.out.println("Mais 5 meses :  " + dataBase.plusMonths(5));
		// data base + 5 meses
		System.out.println("Mais 5 anos  :  " + dataBase.plusYears(5));
		// data base + 5 anos
		System.out.println("Mais 5 anos  :  " + (dataBase = dataBase.plusYears(5)));
		// seta a data base + 5 anos
		System.out.println("Data base    :  " + dataBase);
		// data base alterada, pois a data acima foi setada e não só acrescentada

		System.err.println("/**DATAS COM MINUS**/");

		LocalDate dataBaseNegativa = LocalDate.parse("2023-01-01");
		System.out.println("Data base    :  " + dataBaseNegativa);
		// data base
		System.out.println("Menos 5 dias :  " + dataBaseNegativa.minusDays(5));
		// data base - 5 dias
		System.out.println("Menos 5 dias :  " + dataBaseNegativa.minusWeeks(5));
		// data base - 5 semanas
		System.out.println("Menos 5 meses:  " + dataBaseNegativa.minusMonths(5));
		// data base - 5 meses
		System.out.println("Menos 5 anos :  " + dataBaseNegativa.minusYears(5));
		// data base - 5 anos
		System.out.println("Menos 5 anos :  " + (dataBaseNegativa = dataBase.minusYears(5)));
		// seta a data base - 5 anos
		System.out.println("Data base    :  " + dataBaseNegativa);
		// data base alterada, pois a data acima foi setada e não só decrementada

		LocalDate dataparcelas = LocalDate.now();

		for (int parcela = 1; parcela <= 12; parcela++) {
			dataparcelas = dataparcelas.plusMonths(1);
			if (parcela > 9) {
				System.out.println("Data de vencimento do boleto do " + parcela + "º boleto : "
						+ dataparcelas.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
			} else {
				System.out.println("Data de vencimento do boleto do " + parcela + "º boleto  : "
						+ dataparcelas.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
			}
		}
	}
}