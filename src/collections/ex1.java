package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o nome de uma cor: ");
			cores.add(scanner.nextLine());
		}
		System.out.println("Listar todas as cores:\n");
		for (String cor : cores) {
			System.out.println(cor);
		}
		System.out.println("Ordenar as cores:\n");
		cores.sort(null);
		Iterator<String> iCores = cores.iterator();
		while (iCores.hasNext()) {
			System.out.println(iCores.next());
		}
		scanner.close();
	}

}
