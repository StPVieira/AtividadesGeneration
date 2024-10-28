package ex1;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float salario;
		float abono;
		float novoSalario;
		
		System.out.println("Digite o salário: ");
		salario = scanner.nextFloat();
		
		System.out.println("Digite o abono: ");
		abono = scanner.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.println("Valor total: " + novoSalario);
		
		scanner.close();
	}

}

