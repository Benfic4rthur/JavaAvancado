package trabalhandoComDatas;

import java.time.LocalDate;
import java.time.Period;

public class FaixaDeTempoComLocalDateIsAfterEIsBeforeEObjetoPeriod {
	public static void main(String[] args) {
		LocalDate dataAntiga = LocalDate.of(2021, 01, 01);
		// cria primeira data, ou data antiga
		//LocalDate dataAntiga = LocalDate.parse("2021/01/01");
		// faria a mesma coisa que o LocalDate.of

		LocalDate dataNova = LocalDate.of(2023, 02, 22);
		// cria segunda data, ou data nova, tudo para meios de comparação

		System.out.println("Data antiga é posterior a data nova? " + dataAntiga.isAfter(dataNova)); // metodo tradicional em ingles
		// pergunta se uma data é posterior a outra ou como se fosse um >, retorna um boleano

		System.out.println("Data antiga é anterior a data nova? " + dataAntiga.isBefore(dataNova)); // metodo tradicional em ingles
		// pergunta se uma data é anterior a outra ou como se fosse um <, retorna um  boleano
		
		/*APRENDENDO A UTILIZAR O PERIOD*/
		
		Period periodo = Period.between(dataAntiga, dataNova); 
		// consegue pegar um periodo de forma mais pratica ainda
		
		System.out.println("Este é o periodo em dias entre as datas: "+periodo.getDays());
		// imprime o valor de dias entre os periodos 1 e 2
		
		System.out.println("Este é o periodo apenas em meses entre as datas: "+periodo.getMonths());
		// imprime o valor apenas de meses entre o periodo 1 e 2
		
		System.out.println("Este é o periodo em meses entre as datas: "+periodo.getYears());
		// imprime o valor de anos entre o periodo 1 e 2
		
		System.out.println("Este é o periodo total de meses entre as datas: "+periodo.toTotalMonths());
		// imprime o valor de meses entre o periodo 1 e 2
		
/* No Java, as classes Period e Duration podem ser usadas para representar um intervalo de tempo entre duas datas ou instantes. 
A diferença entre as funções getMonths() e toTotalMonths() depende do objeto Period que está sendo utilizado.
O método getMonths() retorna o número de meses no período de tempo representado pelo objeto Period. Por exemplo, se o período 
de tempo for de 1 ano e 6 meses, getMonths() retornará 6, porque esse é o número de meses incluídos no período que não se enquadram 
em anos inteiros.
Por outro lado, o método toTotalMonths() retorna o número total de meses no período de tempo representado pelo objeto Period. 
Isso significa que o método leva em consideração o número total de anos e meses no período. Por exemplo, se o período de tempo 
for de 1 ano e 6 meses, toTotalMonths() retornará 18, porque é o número total de meses incluídos no período (12 meses por ano mais 6 meses).
Em resumo, getMonths() retorna o número de meses adicionais ao número de anos, enquanto toTotalMonths() retorna o número total de meses 
no período, incluindo os meses que fazem parte de anos inteiros. Ambos os métodos podem ser úteis dependendo do contexto em que estão 
sendo usados.*/
	}
}