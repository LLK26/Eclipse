package arrayObjetos;

public class ListaAlunos {
	private Aluno[] alunos = null; //array de objetos
	private int i = 0; //variavel de controle do indice do array
	
	//método construtor
	public ListaAlunos(int qtde) {
		//instanciando o array alunos
		alunos = new Aluno[qtde];
		}
	
	//insere um aluno na lista "alunos"
	public void insereAluno(Aluno a) {
		if (i < alunos.length) {
			alunos[i] = a;
			i++; // (i++) = (i += 1)
		}else {
			System.out.println("Lista cheia");
		}
	}
	
	public void imprimeLista() {
		for(int i=0; i<alunos.length; i++) { //percorrendo o vetor
			if(alunos[i] == null) {
				System.out.println("vazio");
			}else {
			System.out.println(alunos[i].toString());
			}
		}
	}
	
	
}
