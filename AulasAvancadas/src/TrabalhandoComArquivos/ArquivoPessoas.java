package TrabalhandoComArquivos;

import java.util.Objects;

import trabalhandoComDatas.DatasEmJava;

public class ArquivoPessoas {
	
	private String nomeString;
	private String emailString;
	private String dataDeNascimentoString;
	private int idade;
	public String getNomeString() {
		return nomeString;
	}
	public void setNomeString(String nomeString) {
		this.nomeString = nomeString;
	}
	public String getEmailString() {
		return emailString;
	}
	public void setEmailString(String emailString) {
		this.emailString = emailString;
	}
	public String getDataDeNascimentoString() {
		return dataDeNascimentoString;
	}
	public void setDataDeNascimentoString(String dataDeNascimentoString) {
		this.dataDeNascimentoString = dataDeNascimentoString;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dataDeNascimentoString, emailString, idade, nomeString);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArquivoPessoas other = (ArquivoPessoas) obj;
		return Objects.equals(dataDeNascimentoString, other.dataDeNascimentoString)
				&& Objects.equals(emailString, other.emailString) && idade == other.idade
				&& Objects.equals(nomeString, other.nomeString);
	}
	@Override
	public String toString() {
		return "ArquivoPessoas [nomeString=" + nomeString + ", emailString=" + emailString + ", dataDeNascimentoString="
				+ dataDeNascimentoString + ", idade=" + idade + "]";
	}
}