// Importando as classes necessárias para trabalhar com arquivos, lidar com data e hora e com caixas de diálogo (JOptionPane)
package TrabalhandoComArquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CadastraPessoaGeraLista {
	public static void main(String[] args) {
		try {
			// Capturando a quantidade de pessoas a serem cadastradas por meio de um
			// JOptionPane
			String pessoaString = JOptionPane.showInputDialog("Quantas pessoas deseja cadastrar?");
			// Convertendo a quantidade de pessoas para um valor numérico
			int numPessoas = Integer.parseInt(pessoaString);
			// Criando um ArrayList para armazenar os objetos ArquivoPessoas criados
			ArrayList<ArquivoPessoas> pessoas = new ArrayList<ArquivoPessoas>();
			// Laço de repetição para cadastrar todas as pessoas informadas pelo usuário
			for (int cadastro = 1; cadastro <= numPessoas; cadastro++) {
				String nomeCadastroString = JOptionPane.showInputDialog("Digite o nome da " + cadastro + "ª pessoa: ");
				String emailCadastroString = JOptionPane
						.showInputDialog("Digite o e-mail da " + cadastro + "ª pessoa: ");
				String dataNascimento = JOptionPane.showInputDialog(
						"Digite a data de nascimento da " + cadastro + "ª pessoa (formato: dd/mm/aaaa): ");
				// Criando um objeto LocalDate com a data de nascimento informada
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate dataNasceu = LocalDate.parse(dataNascimento, formatter);
				// Criando um objeto LocalDate com a data atual
				LocalDate hoje = LocalDate.now();
				// Calculando a diferença entre as datas de nascimento e a data atual para obter
				// a idade da pessoa
				Period periodo = Period.between(dataNasceu, hoje);
				Integer idade = periodo.getYears();
				// Criando um objeto ArquivoPessoas com as informações da pessoa
				ArquivoPessoas pessoa = new ArquivoPessoas();
				pessoa.setNomeString(nomeCadastroString);
				pessoa.setEmailString(emailCadastroString);
				pessoa.setIdade(idade);
				pessoa.setDataDeNascimentoString(dataNascimento);
				pessoas.add(pessoa);
			}
			// Verificando se o usuário deseja gerar a lista de pessoas cadastradas
			int gerarquivo = JOptionPane.showConfirmDialog(null, "Deseja gerar a lista de pessoas?");
			if (gerarquivo == 0) {
				// Criando um objeto File com o caminho e o nome do arquivo a ser gerado
				File arquivoFile = new File(
						"C:\\Users\\Arthur Benfica\\git\\AulasAvancadas\\AulasAvancadas\\src\\TrabalhandoComArquivos\\Lista de clientes.txt");
				// Verificando se o arquivo já existe, se não existir, ele será criado
				if (!arquivoFile.exists()) {
					arquivoFile.createNewFile();
				}
				// Criando um objeto FileWriter para escrever no arquivo
				FileWriter escrever = new FileWriter(arquivoFile);
				// Escrevendo as informações de cada pessoa cadastrada no arquivo
				// Este loop percorre a lista de pessoas, escrevendo no arquivo as informações
				// de cada pessoa
				for (int pos = 0; pos < numPessoas; pos++) {
					// Obtém a pessoa atual da lista
					ArquivoPessoas pessoa = pessoas.get(pos);
					// Escreve as informações da pessoa no arquivo
					escrever.write("Nome: " + pessoa.getNomeString() + "\n" + "e-mail: " + pessoa.getEmailString()
							+ "\n" + "Data de Nascimento: " + pessoa.getDataDeNascimentoString() + "\n" + "Idade: "
							+ pessoa.getIdade() + "\n\n");
				}
				// Descarrega o buffer de escrita do arquivo
				escrever.flush();
				// Fecha o arquivo
				escrever.close();
				// Exibe uma mensagem de sucesso para o usuário
				JOptionPane.showMessageDialog(null, "Lista de pessoas gerada com sucesso!");
				// Se o usuário cancelou a operação, exibe uma mensagem informando
			} else {
				JOptionPane.showMessageDialog(null, "Operação cancelada.");
			}
			// Captura e trata possíveis exceções que possam ocorrer durante o processo de
			// escrita do arquivo
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Erro ao gerar arquivo: " + e.getMessage());
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Valor inválido. Por favor, digite um número inteiro válido.");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado: " + e.getMessage());
		}
		// Fecha o bloco try-catch e o método principal
	}
}
