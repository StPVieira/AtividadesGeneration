package lacoscondicionais;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int codProduto, quantProduto;
		float precoProduto = 0;
		String nomeProduto;

		System.out.println("Código do Produto: ");
		codProduto = Integer.valueOf(scanner.nextLine());
		System.out.println("Quantidade: ");
		quantProduto = Integer.valueOf(scanner.nextLine());

		switch (codProduto) {
		case 1:
			nomeProduto = "Cachorro Quente";
			precoProduto = 10;
			break;
		case 2:
			nomeProduto = "X-Salada";
			precoProduto = 15;
			break;
		case 3:
			nomeProduto = "X-Bacon";
			precoProduto = 18;
			break;
		case 4:
			nomeProduto = "Bauru";
			precoProduto = 12;
			break;
		case 5:
			nomeProduto = "Refrigerante";
			precoProduto = 8;
			break;
		case 6:
			nomeProduto = "Suco de laranja";
			precoProduto = 13;
			break;
		default:
			nomeProduto = "Código inválido";
			break;
		}
		System.out.println("Produto: " + nomeProduto);
		System.out.printf("Valor total: R$ %.2f%n", precoProduto * quantProduto);

		scanner.close();
	}

}
