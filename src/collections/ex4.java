package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashSet<Integer> listaInteiros = new HashSet<Integer>(Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));
		while (true) {
			System.out.println("Digite o número que você deseja encontrar: ");
			int numDesejado = Integer.valueOf(scanner.nextLine());
			if (listaInteiros.contains(numDesejado)) {
				System.out.println("O número " + numDesejado + " foi encontrado! ");
			} else {
				System.out.println("O número " + numDesejado + " não foi encontrado!");
			}
			System.out.println("Deseja continuar procurando números? (S/N)");
			String escolha = scanner.nextLine();
			if (escolha.equalsIgnoreCase("S")) {
				continue;
			} else {
				break;
			}
		}
		scanner.close();
	}

}
