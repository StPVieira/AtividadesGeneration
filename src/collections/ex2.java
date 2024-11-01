package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> listaValores = new ArrayList<>(Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));
		while (true) {
			System.out.println("Digite o número que você deseja encontrar: ");
			int numDesejado = Integer.valueOf(scanner.nextLine());
			if (listaValores.contains(numDesejado)) {
				System.out.println("O número " + numDesejado + " está localizado na posição: "
									+ listaValores.indexOf(numDesejado));
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
