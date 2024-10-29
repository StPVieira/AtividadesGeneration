package lacoscondicionais;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String vertebradoInvertebrado, classe, catAlimentar;

		System.out.println("O animal é vertebrado ou invertebrado? ");
		vertebradoInvertebrado = scanner.nextLine();

		System.out.println("O animal pertence a qual classe? ");
		classe = scanner.nextLine();

		System.out.println("Qual a categoria alimentar do animal? ");
		catAlimentar = scanner.nextLine();

		if (vertebradoInvertebrado.equalsIgnoreCase("Vertebrado")
				|| vertebradoInvertebrado.equalsIgnoreCase("Invertebrado")) {

			if (vertebradoInvertebrado.equalsIgnoreCase("Vertebrado")) {
				if (classe.equalsIgnoreCase("Ave")) {
					if (catAlimentar.equalsIgnoreCase("Carnivoro")) {
						System.out.println("Águia");
					} else if (catAlimentar.equalsIgnoreCase("Onivoro")) {
						System.out.println("Pomba");
					} else {
						System.out.println("Categoria alimentar inválida.");
					}
				} else if (classe.equalsIgnoreCase("Mamifero")) {
					if (catAlimentar.equalsIgnoreCase("Onivoro")) {
						System.out.println("Homem");
					} else if (catAlimentar.equalsIgnoreCase("Herbivoro")) {
						System.out.println("Vaca");
					} else {
						System.out.println("Categoria alimentar inválida.");
					}
				} else {
					System.out.println("Classe inválida.");
				}
			} else if (vertebradoInvertebrado.equalsIgnoreCase("Invertebrado")) {
				if (classe.equalsIgnoreCase("Inseto")) {
					if (catAlimentar.equalsIgnoreCase("Hematofago")) {
						System.out.println("Pulga");
					} else if (catAlimentar.equalsIgnoreCase("Herbivoro")) {
						System.out.println("Lagarta");
					} else {
						System.out.println("Categoria alimentar inválida.");
					}
				} else if (classe.equalsIgnoreCase("Anelideo")) {
					if (catAlimentar.equalsIgnoreCase("Hematofago")) {
						System.out.println("Sanguessuga");
					} else if (catAlimentar.equalsIgnoreCase("Onivoro")) {
						System.out.println("Minhoca");
					} else {
						System.out.println("Categoria alimentar inválida.");
					}
				} else {
					System.out.println("Classe inválida.");
				}
			}
		} else {
			System.out.println("Informação inválida. O animal precisa ser vertebrado ou invertebrado.");
		}
		scanner.close();
	}

}
