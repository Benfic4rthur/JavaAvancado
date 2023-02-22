package TrabalhandoComArquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AutomatizandoGeracaoVariosArquivos {
    public static void main(String[] args) throws IOException {
        
        // Cria uma string com o caminho onde serão criados os arquivos
        String diretorio = "C:\\Users\\Arthur Benfica\\git\\AulasAvancadas\\AulasAvancadas\\src\\TrabalhandoComArquivos\\";
        // Loop que irá criar um arquivo para cada parcela, de 1 até 10
        for (int parcelas = 1; parcelas <= 10 ; parcelas++) {
            // Cria um novo objeto File com o nome do arquivo a ser criado, no formato "boleto X.txt", onde X é o número da parcela
            File arquivoFile = new File(diretorio + "boleto " + parcelas + ".txt");
            // Verifica se o arquivo já existe. Se não existir, o código entra no bloco "if"
            if (!arquivoFile.exists()) {
                // Cria um novo arquivo
                arquivoFile.createNewFile();
                // Cria um objeto FileWriter para escrever no arquivo criado
                FileWriter escrever = new FileWriter(arquivoFile);
                // Escreve no arquivo o texto "boleto X", onde X é o número da parcela
                escrever.write("boleto " + parcelas);
                // Dá um flush para atualizar o arquivo
                escrever.flush();
                // Fecha o objeto FileWriter
                escrever.close();
            }
        }
    }
}
