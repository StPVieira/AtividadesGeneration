package lacoscondicionais;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float num1, num2;
		int codOperacao;
		
		System.out.println("Digite o 1º número: ");
		num1 = Float.valueOf(scanner.nextLine());
		System.out.println("Digite o 2º número: ");
		num2 = Float.valueOf(scanner.nextLine());
		System.out.println("Operação: ");
		codOperacao = Integer.valueOf(scanner.nextLine());
		
		switch(codOperacao) {
		
		case 1:
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			break;
		case 2:
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
			break;
		case 3:
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
			break;
		case 4:
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
			break;
		default:
			System.out.println("Operação Inválida!");
		}
		
		scanner.close();

	}

}
