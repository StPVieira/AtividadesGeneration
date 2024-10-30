package lacosderepeticao;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		int contNum = 0;
		int somaNumMult3 = 0;
		
		do {
			System.out.println("Digite um número: ");
			num = Integer.valueOf(scanner.nextLine());
			if(num != 0 && num % 3 == 0) {
				somaNumMult3 += num;
				contNum++;
			}
			
		}while(num != 0);
		System.out.println("A média de todos os números múltiplos de 3 é: " + somaNumMult3 * 1.0 / contNum);
		scanner.close();

	}

}
