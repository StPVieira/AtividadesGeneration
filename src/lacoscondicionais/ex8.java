package lacoscondicionais;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int codOperacao;
		float valor;
		float saldo = 1000;
		
		System.out.println("Operação: ");
		codOperacao = Integer.valueOf(scanner.nextLine());
		
		switch(codOperacao) {
		
		case 1:
			System.out.println("Operação - Saldo");
			System.out.printf("Saldo: R$%.2f%n", saldo);
			break;
		case 2:
			System.out.println("Operação - Saque");
			System.out.println("Valor: ");
			valor = scanner.nextFloat();
			if(valor < 0) {
				System.out.println("Não é possível fazer operações com um número negativo.");
				break;
			}	
			
			if(valor > saldo) {
				System.out.println("Saldo Insuficiente!");
				break;
			}
			saldo = saldo - valor;
			System.out.printf("Novo Saldo: R$%.2f%n", saldo);
			break;
		case 3:
			System.out.println("Operação - Depósito");
			System.out.println("Valor: ");
			valor = scanner.nextFloat();
			if(valor < 0) {
				System.out.println("Não é possível fazer operações com um número negativo.");
				break;
			}
			saldo = saldo + valor;
			System.out.printf("Novo Saldo: R$%.2f%n", saldo);
			break;
		default:
			System.out.println("Operação Inválida!");
		}
		scanner.close();

	}

}
