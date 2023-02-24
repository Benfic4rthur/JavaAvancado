package exemplosExcecao;

import java.util.Objects;
//a classe disciplina servirá para todos os objetos e instancias de materias e disciplinas
public class ObjetoDisciplinaComLista {
	double nota;
	String disciplina;
	//Setters and Getters
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	//Equals e HashCode
	@Override
	public int hashCode() {
		return Objects.hash(disciplina, nota);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjetoDisciplinaComLista other = (ObjetoDisciplinaComLista) obj;
		return Objects.equals(disciplina, other.disciplina)
				&& Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
	}
	//toString
	@Override
	public String toString() {
		return "ObjetoDisciplinaComLista [nota=" + nota + ", disciplina=" + disciplina + "]";
	}
}