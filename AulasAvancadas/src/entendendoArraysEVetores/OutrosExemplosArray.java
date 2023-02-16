package entendendoArraysEVetores;

import javafx.geometry.Pos;

public class OutrosExemplosArray {
	public static void main(String[] args) {
		try {
		//criou-se um array com 3 elementos, sem a necessidade de informar a quantidade
		//apenas passando os valores para os respectivos elementos
		            //posição 0    1    2
		double[] valores = { 7.5, 8.6, 9.7 };

		for (int pos = 0; pos < valores.length; pos++) {
			System.out.println("nota "+(pos+1)+":"+valores[pos]);
		}
		}catch (Exception e) {
			System.out.println("xi deu erro!");
		}
	}
}