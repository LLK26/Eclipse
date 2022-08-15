package arrayObjetos;

public class ListaAlunosTeste {
	public static void main(String[] args) {
		//Cria a lista de alunos "lista"
		ListaAlunos lista = new ListaAlunos(3);
	
		//Cria os objetos de Aluno
		Aluno a1 = new Aluno(1, "Aluno 1");
		Aluno a2 = new Aluno(2, "Aluno 2");
		Aluno a3 = new Aluno(3, "Aluno 3");
		
		//Inserindo os alunos na lista
		lista.insereAluno(a1);
		lista.insereAluno(a2);
		lista.insereAluno(a3);
		
		//Imprimindo os elementos da lista
		lista.imprimeLista();
	}
}
