package check;

public class Ch3 {
	String nome;
	String num;
	double saldo;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNum(String num) {
		this.num = num;
	}
	
	public String getNum() {
		return num;
	}
	
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void depSaldo(double valor) {
		this.saldo += valor;
	}
	
	public void saqSaldo(double valor) {
		this.saldo -= valor;
	}
	
	
	
	public static void main(String[] args) {
		Ch3 c1 = new Ch3();
		c1.setNome("Rodrigo igo");
		System.out.println("Nome: " + c1.getNome());
		c1.setNum("955903519");
		System.out.println("Número da conta: " + c1.getNum());
		c1.setSaldo(700);
		System.out.println("Saldo: " + c1.getSaldo());
		c1.depSaldo(200);
		c1.saqSaldo(150);
		System.out.println("Saldo: " + c1.getSaldo());
		
	}
}
