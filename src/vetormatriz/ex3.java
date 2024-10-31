package vetormatriz;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int matrizInteiros[][] = new int[3][3];
		int length = matrizInteiros.length;
		for (int linha = 0; linha < length; linha++) {
			for (int coluna = 0; coluna < length; coluna++) {
				System.out.println("Insira um número inteiro a ser adicionado na matriz: ");
				int numAdicionado = Integer.valueOf(scanner.nextLine());
				matrizInteiros[linha][coluna] = numAdicionado;
			}
		}
		System.out.println("Elementos da Diagonal Principal:");
		int somaElePrin = 0;
		for (int linha = 0; linha < length; linha++) {
			for (int coluna = 0; coluna < length; coluna++) {
				if (coluna == linha) {
					System.out.print(matrizInteiros[linha][coluna] + " ");
					somaElePrin += matrizInteiros[linha][coluna];
				}
			}
		}
		System.out.println("\nElementos da Diagonal Secundária: ");
		int somaEleSec = 0;
		for (int linha = 0; linha < length; linha++) {
			for (int coluna = 0; coluna < length; coluna++) {
				if (coluna == linha) {
					System.out.print(matrizInteiros[linha][length - 1 - linha] + " ");
					somaEleSec += matrizInteiros[linha][length - 1 - linha];
				}
			}
		}
		System.out.println("\nSoma dos Elementos da Diagonal Principal:\n" + somaElePrin);
		System.out.println("Soma dos Elementos da Diagonal Secundária:\n" + somaEleSec);
		scanner.close();
	}

}
