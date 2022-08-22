package ArrayListPOO;

public class ListaAlunosTesteArraylist {
	public static void main(String[] args) {
		
		//Criando uma lista de alunos
		ListaAlunosArraylist lista = new ListaAlunosArraylist();
		
		//criando os objetos de Aluno (a1, a2, a3...)
		AlunoArraylist a1 = new AlunoArraylist(1, "Aluno1");
		AlunoArraylist a2 = new AlunoArraylist(2, "Aluno2");
		AlunoArraylist a3 = new AlunoArraylist(3, "Aluno3");
		
		lista.inserirAluno(a1);
		lista.inserirAluno(a2);
		lista.inserirAluno(a3);
		
		//imprimindo a lista
		lista.imprimirLista();
	}
}
