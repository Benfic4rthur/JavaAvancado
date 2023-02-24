package TrabalhandoComArquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivos {
	public static void main(String[] args) throws IOException {
		File arquivoFile = new File("C:\\Users\\Arthur Benfica\\git\\AulasAvancadas\\AulasAvancadas\\src\\TrabalhandoComArquivos\\arquivo.txt");
		if(!arquivoFile.exists()) {
			arquivoFile.createNewFile();
			FileWriter escrever = new FileWriter(arquivoFile); // cria um objeto que escreve no arquivo
			escrever.write("teste de novo arquivo"); // passa o que deve ser escrito
			escrever.flush(); // dá um flush para atualizar o arquivo
			escrever.close(); // encerra ele
		}
	}
}
