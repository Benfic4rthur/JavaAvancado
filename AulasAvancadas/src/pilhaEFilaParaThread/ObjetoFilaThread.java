package pilhaEFilaParaThread;

import java.util.Objects;

public class ObjetoFilaThread {

	private String nomeString;
	private String emailString;
	
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
	@Override
	public int hashCode() {
		return Objects.hash(emailString, nomeString);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjetoFilaThread other = (ObjetoFilaThread) obj;
		return Objects.equals(emailString, other.emailString) && Objects.equals(nomeString, other.nomeString);
	}
	@Override
	public String toString() {
		return "ObjetoFilaThread [nomeString=" + nomeString + ", emailString=" + emailString + "]";
	}
}
