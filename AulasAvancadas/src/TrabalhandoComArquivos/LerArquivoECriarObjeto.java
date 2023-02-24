package TrabalhandoComArquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LerArquivoECriarObjeto {
	public static void main(String[] args) throws IOException {
		// Cria um objeto FileInputStream para ler o arquivo "Lista de clientes.txt"
		try (FileInputStream entradaArquivo = new FileInputStream(new File(
				"C:\\Users\\Arthur Benfica\\git\\AulasAvancadas\\AulasAvancadas\\src\\TrabalhandoComArquivos\\Lista de clientes.txt"))) {
			// Cria uma lista de objetos ArquivoPessoas vazia para armazenar as pessoas do
			// arquivo
			List<ArquivoPessoas> listaPessoas = new ArrayList<ArquivoPessoas>();
			// Cria um objeto Scanner para ler o arquivo, usando a codificação "utf-8"
			try (Scanner lerArquivoScanner = new Scanner(entradaArquivo, "utf-8")) {
				// Lê o arquivo linha por linha e imprime cada linha no console
				while (lerArquivoScanner.hasNext()) {
					String linhaString = lerArquivoScanner.nextLine();
					// Verifica se a linha lida do arquivo não é nula /*e nem vazia.*/ 
					if (linhaString != null /*&& !linhaString.isEmpty()*/) {
						// Se a linha não for nula e nem vazia, então imprime a linha no console.
						System.out.println(linhaString);
						// Separa os dados da linha pelo caractere de pipe (|)
						String[] dadoStrings = linhaString.split("\\|");
						// Verifica se há pelo menos 4 elementos na linha
						if (dadoStrings.length >= 4) {
							// Cria um objeto ArquivoPessoas e seta os atributos com os dados da linha
							ArquivoPessoas pessoa = new ArquivoPessoas();
							pessoa.setNomeString(dadoStrings[0]);
							pessoa.setEmailString(dadoStrings[1]);
							pessoa.setDataDeNascimentoString(dadoStrings[2]);
							pessoa.setIdade(Integer.parseInt(dadoStrings[3]));
							// Adiciona a pessoa criada à lista de pessoas
							listaPessoas.add(pessoa);
						}
					}
				}
				// Imprime na tela os objetos da lista de pessoas
				for (ArquivoPessoas pessoa : listaPessoas) {
					System.out.println(pessoa);
				}
			} catch (NumberFormatException e) {
				// exceção lançada caso não seja possível converter uma String em um número
				// inteiro
				System.out.println("Erro ao converter idade para inteiro.");
				e.printStackTrace();
			} catch (Exception e) {
				// exceção genérica, caso ocorra algum erro não esperado
				System.out.println("Ocorreu um erro não esperado.");
				e.printStackTrace();
			}
		}
	}
}