package lacosderepeticao;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int idade = 0;
		int menores21 = 0;
		int maiores50 = 0;
		
		while(idade >= 0) {
			System.out.println("Digite uma idade: ");
			idade = Integer.valueOf(scanner.nextLine());
			if(idade >= 0 && idade < 21) {
				menores21++;
			}else if(idade > 50) {
				maiores50++;
			}
		}
		System.out.println("Total de pessoas menores de 21 anos: " + menores21);
		System.out.println("Total de pessoas maiores de 50 anos: " + maiores50);
		scanner.close();
	}

}
