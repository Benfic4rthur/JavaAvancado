package TrabalhandoComArquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class TrabalhandoComLeituraDeArquivos {
    public static void main(String[] args) throws FileAlreadyExistsException, FileNotFoundException {
        // Cria um objeto FileInputStream para ler o arquivo "Arquivo.txt"
        FileInputStream entradaArquivo = new FileInputStream(
            // Cria um objeto File com o caminho absoluto do arquivo
            new File("C:\\Users\\Arthur Benfica\\git\\AulasAvancadas\\AulasAvancadas\\src\\TrabalhandoComArquivos\\Lista de clientes.txt")
        );
        // Cria um objeto Scanner para ler o arquivo, usando a codificação "utf-8"
        try (Scanner lerArquivoScanner = new Scanner(entradaArquivo, "utf-8")) {
            // Lê o arquivo linha por linha e imprime cada linha no console
            while(lerArquivoScanner.hasNext()) {
                String linhaString = lerArquivoScanner.nextLine();
                if(linhaString != null && !linhaString.isEmpty()) {
                    // Verifica se a linha lida do arquivo não é nula e nem vazia.
                    // Se a linha não for nula e nem vazia, então imprime a linha no console.
                    System.out.println(linhaString);
                }
            }
        }
    }
}