package vetormatriz;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int vetor[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		while (true) {
			System.out.println("Digite o número que você deseja encontrar: ");
			int numDesejado = Integer.valueOf(scanner.nextLine());
			for (int i = 0; i < vetor.length; i++) {
				if (vetor[i] == numDesejado) {
					System.out.println("O número " + numDesejado + " está localizado na posição: " + i);
					break;
				} else if (i == vetor.length - 1) {
					System.out.println("O número " + numDesejado + " não foi encontrado!");
				}
			}
			System.out.println("Deseja continuar procurando outro número? (S/N)");
			String opcao = scanner.nextLine();
			if (opcao.equalsIgnoreCase("S")) {
				continue;
			} else {
				break;
			}
		}
		scanner.close();
	}

}
