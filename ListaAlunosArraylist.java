package ArrayListPOO;

import java.util.ArrayList;

public class ListaAlunosArraylist {
	private ArrayList<AlunoArraylist> alunos;
	
	public ListaAlunosArraylist() {
		alunos = new ArrayList<AlunoArraylist>();
	}
	
	//inserindo um aluno na lista
	public void inserirAluno(AlunoArraylist a) {
		alunos.add(a);
	}
	
	//percorrendo a lista de alunos
	public void imprimirLista() {
		for (AlunoArraylist a : alunos) {
			System.out.println("Aluno: " + a.toString());
		}
	}
	
}
