package matrizes;

import java.util.Arrays;
import java.util.List;

public class StringSplit {
	public static void main(String[] args) {
	 String texto = "Arthur,curso java,nota 80,nota 70,nota 89";
	 String[] valoresArray = texto.split(","); // aqui cria o padrão que será usado para repartir o valor informado na string, no caso é a virgula
 
	 
	 //convertendo um Array para uma lista
	 List<String> list = Arrays.asList(valoresArray);
	 for (String Valorstring : list) {
		System.out.println(Valorstring);
	 }
	 //convertendo uma lista para um Array             ↓ aqui ele busca o length do valoresArray
	 String[] conversaoArray = list.toArray(new String[valoresArray.length]);
	 for(int pos = 0; pos < conversaoArray.length; pos++) {
		 System.out.println(conversaoArray[pos]);	 
	 }
	}
}