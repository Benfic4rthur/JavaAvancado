package exemploVetorAluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {
		String nome;
		String sexo;
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getSexo() {
			return sexo;
		}
		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
		List<Disciplinas> disciplinas = new ArrayList<Disciplinas>();
		public List<Disciplinas> getDisciplinas() {
			return disciplinas;
		}
		public void setDisciplinas(List<Disciplinas> disciplinas) {
			this.disciplinas = disciplinas;
		}
		public double getMediaNota() {
			double somaNotas = 0.0;
			for (Disciplinas objetoDisciplinaComLista : disciplinas) {
				somaNotas += objetoDisciplinaComLista.getMediaNotas();
			}
			return somaNotas / disciplinas.size();
		}
		public String getAlunoAprovado() {
			if (getSexo().equalsIgnoreCase("M")) {
				if (getMediaNota() < 70) {
					if (getMediaNota() > 60 && getMediaNota() < 69) {
						return "O Aluno " + getNome() + " teve a  média de "
								+ getMediaNota() + ", portanto esta em RECUPERAÇÃO!";
					} else {
						return "O Aluno " + getNome() + " teve a  média de "
								+ getMediaNota() + ", portanto foi REPROVADO!";
					}
				} else if (getMediaNota() >= 70) {
					if (getMediaNota() >= 90) {
						return "O aluno " + getNome()
								+ " está de parabéns, ele foi um excelente aluno e sua média foi: " + getMediaNota();
					} else
						return "O Aluno " + getNome() + " teve a  média de "
								+ getMediaNota() + ", portanto foi APROVADO!";
				}
			} else {
				if (getMediaNota() < 70) {
					if (getMediaNota() > 60 && getMediaNota() < 69) {
						return "A Aluna " + getNome() + " teve a  média de "
								+ getMediaNota() + ", portanto esta em RECUPERAÇÃO!";
					} else {
						return "A Aluna " + getNome() + " teve a  média de "
								+ getMediaNota() + ", portanto foi REPROVADA!";
					}
				} else if (getMediaNota() >= 70) {
					if (getMediaNota() >= 90) {
						return "A aluna " + getNome()
						+ " está de parabéns, ela foi uma excelente aluna e sua média foi: " + getMediaNota();
					} else
						return "A Aluna " + getNome() + " teve a  média de "
								+ getMediaNota() + ", portanto foi APROVADA!";
				}
			}
			return getAlunoAprovado();
		}
		//toString
		@Override
		public String toString() {
			return "Aluno [nome=" + nome + ", sexo=" + sexo + "]";
		}
		//Equals e HashCode
		@Override
		public int hashCode() {
			return Objects.hash(disciplinas, nome, sexo);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Aluno other = (Aluno) obj;
			return Objects.equals(disciplinas, other.disciplinas) && Objects.equals(nome, other.nome)
					&& Objects.equals(sexo, other.sexo);
		}
	}