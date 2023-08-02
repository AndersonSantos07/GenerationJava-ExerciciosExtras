package exerciciosExtras01;

import java.util.Scanner;

public class ex003 {

	public static void main(String[] args) {
		float salarioBruto,adicionalNot,horasExt,descontos,salarioLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o seu salário Bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("\nDigite o seu adicional Noturno: ");
		adicionalNot = leia.nextFloat();
		
		System.out.println("\nDigite o valor das horas Extras: ");
		horasExt = leia.nextFloat();
		
		System.out.println("\nDigite o valor dos descontos: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNot + (horasExt * 5) - descontos;
		
		System.out.println("\nO seu salário líquido é: " + salarioLiquido);
		
		

	}

}
