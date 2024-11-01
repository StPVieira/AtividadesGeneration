package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashSet<Integer> listaInteiros = new HashSet<Integer>();
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um número inteiro e não o repita:");
			listaInteiros.add(Integer.valueOf(scanner.nextLine()));
		}

		System.out.println("Listar dados do Set: ");

		Iterator<Integer> iInteiros = listaInteiros.iterator();
		while (iInteiros.hasNext()) {
			System.out.println(iInteiros.next());
		}
		scanner.close();
	}

}
