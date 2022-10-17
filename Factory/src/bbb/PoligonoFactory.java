package bbb;

public class PoligonoFactory {
	
	public static Poligono getPoligono(int numeroLados) {
		if(numeroLados == 3) {
			System.out.println("Triangulo criado");
			return new Triangulo();
		}else if(numeroLados == 4) {
			System.out.println("Quadrado criado");
			return new Quadrado();
		}else if(numeroLados == 5) {
			System.out.println("Pentagono criado");
			return new Pentagono();
		}
		return null;
	}
}
