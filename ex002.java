package exerciciosExtras01;

import java.util.Scanner;

public class ex002 {

	public static void main(String[] args) {
		float nota1,nota2,nota3,nota4,media;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite sua primeira nota: ");
		nota1 = ler.nextFloat();
		
		System.out.println("Digite sua segunda nota: ");
		nota2 = ler.nextFloat();
		
		System.out.println("Digite sua terceira nota: ");
		nota3 = ler.nextFloat();
		
		System.out.println("Digite sua quarta nota: ");
		nota4 = ler.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("\nSua média final é: " + media);
		
		

	}

}
