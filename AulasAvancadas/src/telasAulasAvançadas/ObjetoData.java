package telasAulasAvançadas;

import java.util.Objects;

public class ObjetoData extends Thread{
	
	private String dataString;

	public String getDataString() {
		return dataString;
	}

	public void setDataString(String dataString) {
		this.dataString = dataString;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataString);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjetoData other = (ObjetoData) obj;
		return Objects.equals(dataString, other.dataString);
	}
}
