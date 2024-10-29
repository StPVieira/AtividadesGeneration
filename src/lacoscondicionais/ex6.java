package lacoscondicionais;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nomeColab, cargo;
		int codCargo;
		float salario, reajuste;
		float novoSalario;

		System.out.println("Nome do colaborador: ");
		nomeColab = scanner.nextLine();

		System.out.println("Cargo: ");
		codCargo = Integer.valueOf(scanner.nextLine());

		System.out.println("Salário: ");
		salario = scanner.nextFloat();

		switch (codCargo) {

		case 1:
			cargo = "Gerente";
			reajuste = 1.10f;
			break;
		case 2:
			cargo = "Vendedor";
			reajuste = 1.07f;
			break;
		case 3:
			cargo = "Supervisor";
			reajuste = 1.09f;
			break;
		case 4:
			cargo = "Motorista";
			reajuste = 1.06f;
			break;
		case 5:
			cargo = "Estoquista";
			reajuste = 1.05f;
			break;
		case 6:
			cargo = "Técnico de TI";
			reajuste = 1.08f;
			break;
		default:
			cargo = "Inválido";
			reajuste = 1f;
			break;
		}

		novoSalario = salario * reajuste;

		System.out.println("Nome do colaborador: " + nomeColab);

		System.out.println("Cargo: " + cargo);

		System.out.printf("Salário: R$%.2f%n", novoSalario);

		scanner.close();

	}

}
