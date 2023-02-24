package trabalhandoComApachePoi;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import TrabalhandoComArquivos.ArquivoPessoas;

public class ApachePoi {
	public static void main(String[] args) throws IOException {
		int criartabela = JOptionPane.showConfirmDialog(null, "Deseja criar a planilha?");
		if (criartabela == 0) {
			// caminho do arquivo
			File arquivo = new File(
					"C:\\workspace-java\\AulasJavaAvancadas\\src\\trabalhandoComApachePoi\\arquivo_excel.xls");
			// se arquivo não existe
			if (!arquivo.exists()) {
				// cria um arquivo
				arquivo.createNewFile();
			}

			/* PESSOA 1 */
			ArquivoPessoas pessoa1 = new ArquivoPessoas();
			pessoa1.setNomeString("Arthur Benfica");
			pessoa1.setEmailString("arthur@email.com");
			pessoa1.setDataDeNascimentoString("26/07/1991");
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate dataNasceu = LocalDate.parse(pessoa1.getDataDeNascimentoString(), formatter);
			// Criando um objeto LocalDate com a data atual
			LocalDate hoje = LocalDate.now();
			// Calculando a diferença entre as datas de nascimento e a data atual para obter
			// a idade da pessoa
			Period periodo = Period.between(dataNasceu, hoje);
			Integer idade = periodo.getYears();
			pessoa1.setIdade(idade);

			/* PESSOA 2 */
			ArquivoPessoas pessoa2 = new ArquivoPessoas();
			pessoa2.setNomeString("Natacha Benfica");
			pessoa2.setEmailString("natacha@email.com");
			pessoa2.setDataDeNascimentoString("27/11/1998");
			DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate dataNasceu2 = LocalDate.parse(pessoa2.getDataDeNascimentoString(), formatter2);
			LocalDate hoje2 = LocalDate.now();
			Period periodo2 = Period.between(dataNasceu2, hoje2);
			Integer idade2 = periodo2.getYears();
			pessoa1.setIdade(idade2);

			/* PESSOA 3 */
			ArquivoPessoas pessoa3 = new ArquivoPessoas();
			pessoa3.setNomeString("Pirata Benfica");
			pessoa3.setEmailString("pirata@email.com");
			pessoa3.setDataDeNascimentoString("15/10/2017");
			DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate dataNasceu3 = LocalDate.parse(pessoa2.getDataDeNascimentoString(), formatter3);
			LocalDate hoje3 = LocalDate.now();
			Period periodo3 = Period.between(dataNasceu3, hoje3);
			Integer idade3 = periodo3.getYears();
			pessoa1.setIdade(idade3);

			ArrayList<ArquivoPessoas> pessoas = new ArrayList<ArquivoPessoas>(); // lista de pessoas
			pessoas.add(pessoa1); // adiciona o objeto pessoa1 a lista
			pessoas.add(pessoa2); // adiciona o objeto pessoa2 a lista
			pessoas.add(pessoa3); // adiciona o objeto pessoa3 a lista

			HSSFWorkbook hssfWorkbook = new HSSFWorkbook(); // vai ser usado para escrever a planilha
			HSSFSheet linhasPessoa = hssfWorkbook.createSheet("Planilha de pessoas"); // criar a planilha
			int numerolinha = 0; // cria um numero de linha baseado em 0

			for (ArquivoPessoas p : pessoas) { // faz um laço de repetição para informar todos os dados da lista
				Row linha = linhasPessoa.createRow(numerolinha++); // cria a linha na planilha
				int celula = 0; // cria uma celular baseado no 0
				Cell celNome = linha.createCell(celula++); // cria uma celula pro nome
				celNome.setCellValue(p.getNomeString()); // seta os dados do nome
				Cell celMail = linha.createCell(celula++); // cria uma celula pro email
				celMail.setCellValue(p.getEmailString()); // seta os dados do email
				Cell celData = linha.createCell(celula++); // cria uma celula pra data de nascimento
				celData.setCellValue(p.getDataDeNascimentoString()); // seta os dados da data de nascimento
				Cell celIdade = linha.createCell(celula++); // cria uma celula para idade
				celIdade.setCellValue(p.getIdade()); // seta os dados da idade
			} // terminou de montar a planilha
			FileOutputStream saidaFileOutputStream = new FileOutputStream(arquivo);
			hssfWorkbook.write(saidaFileOutputStream); // escreve a planilha em arquivo
			saidaFileOutputStream.flush(); // descarrega dados
			saidaFileOutputStream.close();// encerra o arquivo
			JOptionPane.showMessageDialog(null, "A planilha foi criada");
		} else
			JOptionPane.showMessageDialog(null, "A planilha Não foi criada");
	}
}