package matrizes;

public class StringSplit {
	public static void main(String[] args) {
	 String texto = "Arthur, curso java, nota 80, nota 70, nota 89";
	 String[] valoresArray = texto.split(","); // aqui cria o padrão que será usado para repartir o valor informado na string
	 System.out.println("Nome do aluno " + valoresArray[0]);
	 System.out.println("Curso aluno " + valoresArray[1]);
	 System.out.println("nota 1 do aluno " + valoresArray[2]);
	 System.out.println("nota 2 do aluno " + valoresArray[3]);
	 System.out.println("nota 3 do aluno " + valoresArray[4]);
	}
}