package check;

public class Ch2 {
	String estado;
	
	public void ligLamp() {
		estado = "ligada";
	}
				
	public void	desLamp() {
		estado = "desligada";
	}
	
	public String retLamp() {
		return estado;
	}
	public static void main(String[] args) {
		Ch2 estado1 = new Ch2();
		estado1.ligLamp();
		System.out.println("Estado: " + estado1.retLamp());
		estado1.desLamp();
		System.out.println("Estado: " + estado1.retLamp());
	}
}
