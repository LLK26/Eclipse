package check;

public class Ch1 {
	//atributos
	int valor;
	
	//métodos
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
		//utlização dos métodos
		
		Ch1 valor1 = new Ch1();
		valor1.zerCont();
		System.out.println("o número de pessoas na festa é de " + valor1.retCont());
		valor1.incCont();
		valor1.incCont();
		valor1.incCont();
		System.out.println("o número de pessoas na festa é de " + valor1.retCont());
		valor1.zerCont();
		System.out.println("o número de pessoas na festa é de " + valor1.retCont());
		valor1.incCont();
		valor1.incCont();
		valor1.incCont();
		valor1.incCont();
		valor1.incCont();
		valor1.incCont();
		valor1.incCont();
		valor1.incCont();
		valor1.incCont();
		System.out.println("o número de pessoas na festa é de " + valor1.retCont());
	}
}
