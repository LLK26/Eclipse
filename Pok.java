package check;

public class Pok {
	String nome;
	String tipo;
	String fraco;
	int ndex;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setFraco(String fraco) {
		this.fraco = fraco;
	}
	
	public String getFraco() {
		return fraco;
	}
	
	public void setNdex(int ndex) {
		this.ndex = ndex;
	}
	
	public int getNdex() {
		return ndex;
	}
	
	public static void main(String[] args) {
		
		Pok c1 = new Pok();
		c1.setNome("Wailord");
		c1.setTipo("Água");
		c1.setFraco("Grama e Elétrico");
		c1.setNdex(321);
		
		Pok c2 = new Pok();
		c2.setNome("Steelix");
		c2.setTipo("Metal e Chão");
		c2.setFraco("Fogo, Água, Lutador e Chão");
		c2.setNdex(208);
		
		Pok c3 = new Pok();
		c3.setNome("Hitmonlee");
		c3.setTipo("Lutador");
		c3.setFraco("Psíquico, Voador e Fada");
		c3.setNdex(106);
		
		Pok c4 = new Pok();
		c4.setNome("Kyogre");
		c4.setTipo("Água");
		c4.setFraco("Grama e Elétrico");
		c4.setNdex(382);
		
		System.out.println("Nome: " + c1.getNome());
		System.out.println("Tipo: " + c1.getTipo());
		System.out.println("Fraco contra: " + c1.getFraco());
		System.out.println("Número na Pokedex: " + c1.getNdex());
		
		System.out.println("\n");
		
		System.out.println("Nome: " + c2.getNome());
		System.out.println("Tipo: " + c2.getTipo());
		System.out.println("Fraco contra: " + c2.getFraco());
		System.out.println("Número na Pokedex: " + c2.getNdex());
		
		System.out.println("\n");
		
		System.out.println("Nome: " + c3.getNome());
		System.out.println("Tipo: " + c3.getTipo());
		System.out.println("Fraco contra: " + c3.getFraco());
		System.out.println("Número na Pokedex: " + c3.getNdex());

		System.out.println("\n");
		
		System.out.println("Nome: " + c4.getNome());
		System.out.println("Tipo: " + c4.getTipo());
		System.out.println("Fraco contra: " + c4.getFraco());
		System.out.println("Número na Pokedex: " + c4.getNdex());
	}
}
