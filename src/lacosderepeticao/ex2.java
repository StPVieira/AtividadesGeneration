package lacosderepeticao;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		int contPar = 0;
		int contImpar = 0;
		
		for(int i = 1; i < 11; i++) {
			System.out.println("Digite o " + i + "º número: ");
			numero = Integer.valueOf(scanner.nextLine());
			if(numero % 2 == 0) {
				contPar++;
			}else {
				contImpar++;
			}
		}
		System.out.println("Total de número pares: " + contPar);
		System.out.println("Total de número ímpares: " + contImpar);
		scanner.close();
	}

}
