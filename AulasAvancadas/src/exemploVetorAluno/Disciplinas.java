package exemploVetorAluno;

import java.util.Arrays;
import java.util.Objects;
public class Disciplinas {
	//cada disciplina tera 3 notas o ano inteiro
	private double[] nota = new double[3];
	private String disciplina;
	
	public double[] getNota() {
		return nota;
	}
	public void setNota(double[] nota) {
		this.nota = nota;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public double getMediaNotas() {
		double somaNotas = 0.0;
		for (int pos =0; pos < nota.length; pos++) {
			somaNotas += nota[pos];
			}
		return somaNotas/nota.length;
		}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(nota);
		result = prime * result + Objects.hash(disciplina);
		return result;
	}
	@Override
	public String toString() {
		return "Disciplinas [nota=" + Arrays.toString(nota) + ", disciplina=" + disciplina + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplinas other = (Disciplinas) obj;
		return Objects.equals(disciplina, other.disciplina) && Arrays.equals(nota, other.nota);
	}
	
}