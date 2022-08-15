package arrayObjetos;

public class Aluno {
	//Variaveis
	private int matricula;
	private String nome;
	
	//Construtor
	public Aluno(int m, String n) {
		matricula = m;
		nome = n;
	}
	
	//Getters and Setters
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	//Método To String
	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + ", getMatricula()=" + getMatricula()
				+ ", getNome()=" + getNome() + "]";
	}
	
	
	
}
