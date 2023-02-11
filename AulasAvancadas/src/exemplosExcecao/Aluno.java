package exemplosExcecao;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {
		/*Está é a nossa classe/objeto que representa o aluno*/
		String nome;
		String sexo;
		//cria os getters e setters de nome e sexo
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
		//Cria lista de disciplinas e notas
		List<ObjetoDisciplinaComLista> disciplinas = new ArrayList<ObjetoDisciplinaComLista>();
		//setter e getter da lista de disciplinas
		public List<ObjetoDisciplinaComLista> getDisciplinas() {
			return disciplinas;
		}
		public void setDisciplinas(List<ObjetoDisciplinaComLista> disciplinas) {
			this.disciplinas = disciplinas;
		}
		//faz o processamento da média
		public double getMediaNota() {
			//cria uma variavel para receber o valor da soma das notas
			double somaNotas = 0.0;
			//cria um for para passar por dentro da lista de disciplinas e ir somando as mesmas
			for (ObjetoDisciplinaComLista objetoDisciplinaComLista : disciplinas) {
				//faz a soma das disciplinas pegas pela lista (objeto)
				somaNotas += objetoDisciplinaComLista.getNota();
			}
			//retorna a soma das notas dividido peloa quantidade de vezes que foram informadas disciplinas
			//disciplinas.size() pega a quantidade de disciplinas que foram informadas na lista
			//lembrando que o nome disciplinas é a referencia da LISTA
			return somaNotas / disciplinas.size();
		}
		public String getAlunoAprovado() {
			if (getSexo().equals("M") || getSexo().equals("m")) {
				if (getMediaNota() < 70) {
					if (getMediaNota() > 60 && getMediaNota() < 69) {
						//se a media do aluno estiver entre 60/69 ele entra em recuperação
						return "O Aluno " + getNome() + " teve a  média de "
								+ getMediaNota() + ", portanto esta em RECUPERAÇÃO!";
					} else {
						//se a media do aluno for menor que 60, ele reprova
						return "O Aluno " + getNome() + " teve a  média de "
								+ getMediaNota() + ", portanto foi REPROVADO!";
					}
				} else if (getMediaNota() >= 70) {
					//se a media do aluno for maior que 70 ele entra neste if
					if (getMediaNota() >= 90) {
						//se a media for maior ou igual a 90, ele entra neste if
						return "O aluno " + getNome()
								+ " está de parabéns, ele foi um excelente aluno e sua média foi: " + getMediaNota();
					} else
						//se a nota do aluno for entre 70 e 90, ele irá ter o resultado APROVADO
						return "O Aluno " + getNome() + " teve a  média de "
								+ getMediaNota() + ", portanto foi APROVADO!";
				}
			} else {
				//caso o sexo do aluno não seja M ou m, ele irá cair na condição de sexo feminino
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
						+ " está de parabéns, ele foi uma excelente aluna e sua média foi: " + getMediaNota();
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