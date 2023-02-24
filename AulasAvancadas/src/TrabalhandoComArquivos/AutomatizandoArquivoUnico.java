package TrabalhandoComArquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AutomatizandoArquivoUnico {
    public static void main(String[] args) throws IOException {
        
        // encontra o arquivo
    	File arquivoFile = new File("C:\\Users\\Arthur Benfica\\git\\AulasAvancadas\\AulasAvancadas\\src\\TrabalhandoComArquivos\\Arquivo.txt");

            // Verifica se o arquivo já existe. Se não existir, o código entra no bloco "if"
            if (!arquivoFile.exists()) {
            	// Cria um arquivo.txt
                arquivoFile.createNewFile();
                
                // Cria um objeto FileWriter para escrever no arquivo criado                
                FileWriter escrever = new FileWriter(arquivoFile);
                
                // este loop irá ocorrer até que chegue ao que foi predeterminado
                for (int parcelas = 1; parcelas <= 10 ; parcelas++) {
                
                  escrever.write("boleto " + parcelas + "\n");
                  // Escreve no arquivo o texto "boleto X", onde X é o número da parcela
            }
          
            // Dá um flush para atualizar o arquivo forçando a escrita pendente
            escrever.flush();
            // Fecha o objeto FileWriter
            escrever.close();
        }
    }
}
