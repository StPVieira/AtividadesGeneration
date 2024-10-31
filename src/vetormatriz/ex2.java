package vetormatriz;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int vetorInteiros[] = new int[10];

		for (int i = 0; i < vetorInteiros.length; i++) {
			System.out.println("Digite um número inteiro a ser inserido no vetor: ");
			int numAdicionado = Integer.valueOf(scanner.nextLine());
			vetorInteiros[i] = numAdicionado;
		}
		System.out.println("Elementos nos índices ímpares: ");
		for (int i = 0; i < vetorInteiros.length; i++) {
			if (i % 2 != 0) {
				System.out.print(vetorInteiros[i] + " ");
			}
		}
		int somaElementos = 0;
		System.out.println("\nElementos pares: ");
		for (int i = 0; i < vetorInteiros.length; i++) {
			if (vetorInteiros[i] % 2 == 0) {
				System.out.print(vetorInteiros[i] + " ");
			}
			somaElementos += vetorInteiros[i];
		}
		System.out.print("\nSoma: " + somaElementos + "\n");
		System.out.print("Média: " + somaElementos * 1.0 / vetorInteiros.length);
		scanner.close();
	}

}
