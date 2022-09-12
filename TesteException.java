package ddd;

import java.util.Scanner;

public class TesteException {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		MaisPOOPossivel ma = new MaisPOOPossivel();
		
		System.out.println("Texto: ");
		String texto = input.nextLine();
			try {
				ma.Excecaozinha(texto);
			} catch (VerificaLetraException e) {
				System.out.println("Letra não encontrada ;-;");
				e.getMessage();
			}
	}
}
