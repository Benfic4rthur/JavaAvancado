package exemplosExcecao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExemploCatcExtendsException {
	public static void main(String[] args) throws ExemploExcecoes{
		try {
			File fil = new File("c://Files.txt");
			Scanner imagemScanner = new Scanner(fil);
		} catch (FileNotFoundException e) {
			throw new ExemploExcecoes(e.getMessage());
		}
	}
}