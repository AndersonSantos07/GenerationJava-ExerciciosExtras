package exerciciosExtras01;

import java.util.Scanner;

public class ex004 {

	public static void main(String[] args) {
		float n1,n2,n3,n4,diferenca;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nDigite o primeiro número: ");
		n1 = ler.nextFloat();
		
		System.out.println("\nDigite o segundo número: ");
		n2 = ler.nextFloat();
		
		System.out.println("\nDigite o terceiro número: ");
		n3 = ler.nextFloat();
		
		System.out.println("\nDigite o quarto número: ");
		n4 = ler.nextFloat();
		
		diferenca = (n1 * n2) - (n3*n4);
		
		System.out.println("\nDiferança: " + diferenca);
	}

}
