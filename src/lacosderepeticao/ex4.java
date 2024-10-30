package lacosderepeticao;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean continuar = true;
		int idade, idGenero, pessoaDev;
		int contDevBack = 0;
		int contMulherFront = 0;
		int contHomemMob = 0;
		int contNbFullMenor30 = 0;
		int pessoas = 0;
		int somaIdade = 0;

		while (continuar) {
			System.out.println("Idade: ");
			idade = Integer.valueOf(scanner.nextLine());
			System.out.println("""
					1 - Mulher Cis
					2 - Homem Cis
					3 - Não Binário
					4 - Mulher Trans
					5 - Homem Trans
					6 - Outros""");
			System.out.println("Identidade de Gênero: ");
			idGenero = Integer.valueOf(scanner.nextLine());
			System.out.println("""
					1 - Backend
					2 - Frontend
					3 - Mobile
					4 - FullStack""");
			System.out.println("Pessoa Desenvolvedora: ");
			pessoaDev = Integer.valueOf(scanner.nextLine());
			somaIdade += idade;
			pessoas++;

			if (pessoaDev == 1) {
				contDevBack++;
			}
			if ((idGenero == 1 || idGenero == 4) && pessoaDev == 2) {
				contMulherFront++;
			}
			if ((idGenero == 2 || idGenero == 5) && pessoaDev == 3 && idade > 40) {
				contHomemMob++;
			}
			if (idGenero == 3 && pessoaDev == 4 && idade < 30) {
				contNbFullMenor30++;
			}
			System.out.println("Deseja continuar? (S/N)");
			String opcao = scanner.nextLine();
			if (opcao.equalsIgnoreCase("S")) {
				continuar = true;
			} else if (opcao.equalsIgnoreCase("N")) {
				continuar = false;
			} else {
				System.out.println("Opção inválida. Repetindo loop.");
			}
		}
		System.out.println("Total de pessoas desenvolvedoras Backend: " + contDevBack + "\n");
		System.out.println("Total de Muheres Cis e Trans desenvolvedoras Frontend: " + contMulherFront + "\n");
		System.out.println(
				"Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + contHomemMob + "\n");
		System.out.println("Total de pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: "
				+ contNbFullMenor30 + "\n");
		System.out.println("O número total de pessoas que responderam à pesquisa: " + pessoas + "\n");
		System.out.println("A média de idade das pessoas que responderam à pesquisa: " + somaIdade * 1.0 / pessoas);
		scanner.close();
	}
}
