package aaa;

public class Singleton {
	
	private static Singleton instancia;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstancia() {
		if(instancia == null) {
			instancia = new Singleton();
			System.out.println("Objeto criado!");
		}else {
			System.out.println("Objeto NÃO criado!");
		}
		return instancia;
	}
	
}
