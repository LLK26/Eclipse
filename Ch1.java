package check;

public class Ch1 {
	//atributos
	int valor;
	
	//m�todos
	public void zerCont() {
		this.valor = 0;
	}
 
	public void incCont() {
		this.valor = this.valor + 1;
	}
	
	public int retCont() {
		return valor;
	}
	
	public static void main(String[] args) {
		//utliza��o dos m�todos
		
		Ch1 valor1 = new Ch1();
		valor1.zerCont();
		System.out.println("o n�mero de pessoas na festa � de " + valor1.retCont());
		valor1.incCont();
		valor1.incCont();
		valor1.incCont();
		System.out.println("o n�mero de pessoas na festa � de " + valor1.retCont());
		valor1.zerCont();
		System.out.println("o n�mero de pessoas na festa � de " + valor1.retCont());
		valor1.incCont();
		valor1.incCont();
		valor1.incCont();
		valor1.incCont();
		valor1.incCont();
		valor1.incCont();
		valor1.incCont();
		valor1.incCont();
		valor1.incCont();
		System.out.println("o n�mero de pessoas na festa � de " + valor1.retCont());
	}
}
