package lacoscondicionais;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nome;
		int idade;
		boolean primeiraDoacao;
		
		System.out.println("Digite o nome do doador: ");
		nome = scanner.nextLine();
		
		System.out.println("Digite a idade do doador: ");
		idade = Integer.valueOf(scanner.nextLine());
		
		System.out.println("Primeira doação de sangue? ");
		primeiraDoacao = scanner.nextBoolean();
		
		if(idade >= 18 && idade <= 69) {
			if(idade >= 60 && primeiraDoacao == false) {
				System.out.println(nome + " está apto(a) para doar sangue!");
			}else if(idade >= 60 && primeiraDoacao == true) {
				System.out.println(nome + " não está apto(a) para doar sangue!");
			}else {
				System.out.println(nome + " está apto(a) para doar sangue!");
			}
		}else {
			System.out.println(nome + " não está apto(a) para doar sangue!");
		}
		scanner.close();
	}
}
