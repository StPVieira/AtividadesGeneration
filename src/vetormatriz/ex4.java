package vetormatriz;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float notasClasse[][] = new float[10][4];
		int length = notasClasse.length;
		for (int linha = 0; linha < length; linha++) {
			for (int coluna = 0; coluna < notasClasse[linha].length; coluna++) {
				System.out.println("Insira a nota do bimestre " + (coluna + 1) + ": ");
				float notaBimestre = Float.valueOf(scanner.nextLine());
				notasClasse[linha][coluna] = notaBimestre;
			}
		}
		float mediaClasse[] = new float[10];
		for (int linha = 0; linha < length; linha++) {
			float somaNotas = 0;
			for (int coluna = 0; coluna < notasClasse[linha].length; coluna++) {
				somaNotas += notasClasse[linha][coluna];
			}
			int indiceAluno = linha;
			mediaClasse[indiceAluno] = somaNotas / notasClasse[linha].length;
		}
		System.out.println("Média de notas do ano por aluno: ");
		for (float nota : mediaClasse) {
			System.out.printf("%.1f ",nota);
		}
		scanner.close();
	}
}
