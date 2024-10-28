package ex3;

import java.util.Scanner;

public class Holerite {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float salarioBruto;
		float adicionalNoturno;
		float horasExtras;
		float descontos;
		float salarioLiquido;
		System.out.println("Salário Bruto: ");
		salarioBruto = scanner.nextFloat();
		
		System.out.println("Adicional Noturno: ");
		adicionalNoturno = scanner.nextFloat();
		
		System.out.println("Horas Extras: ");
		horasExtras = scanner.nextFloat();
		
		System.out.println("Descontos: ");
		descontos = scanner.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.println("Salário Líquido: " + salarioLiquido);

		scanner.close();
	}

}
