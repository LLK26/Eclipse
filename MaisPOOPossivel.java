package ddd;

public class MaisPOOPossivel {
	
	private String t;
	
	public MaisPOOPossivel(String t) {
		this.t = t;
	}


	public MaisPOOPossivel() {
		// TODO Auto-generated constructor stub
	}


	public void Excecaozinha(String t) throws VerificaLetraException {
		if(!t.contains("F") && !t.contains("f")) {
			throw new VerificaLetraException();
		}else {
			System.out.println("Letra Encontrada :)");
		}
	}
}
