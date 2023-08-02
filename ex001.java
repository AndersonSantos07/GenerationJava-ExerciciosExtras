package exerciciosExtras01;

import java.util.Scanner;

public class ex001 {

	public static void main(String[] args) {
		
		int salario,abono,novoSalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite seu salário: ");
		salario = leia.nextInt();
		
		System.out.println("\nDigite seu abono: ");
		abono = leia.nextInt();
		
		novoSalario = salario + abono;
		
		System.out.println("\nSeu novo salário é:  " + novoSalario);

	}

}
