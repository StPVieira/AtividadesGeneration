package lacosderepeticao;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero1, numero2;
		
		System.out.println("Digite o primeiro número do intervalo: ");
		numero1 = Integer.valueOf(scanner.nextLine());
		System.out.println("Digite o último número do intervalo: ");
		numero2 = Integer.valueOf(scanner.nextLine());
		
		if(numero1 < numero2) {
			System.out.println("No intervalo entre 10 e 100:\n");
			for(int i = numero1; i <= numero2; i++) {
				if(i % 3 == 0 && i % 5 == 0) {
					System.out.println(i + " é múltiplo de 3 e 5");
				}
			}
		}else {
			System.out.println("Intervalo inválido!");
		}
		scanner.close();
	}

}
