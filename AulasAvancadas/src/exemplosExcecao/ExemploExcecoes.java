package exemplosExcecao;

public class ExemploExcecoes extends Exception {
	public ExemploExcecoes(String erro) {
		super("Erro no processamento do arquivo" + erro);
	}
}