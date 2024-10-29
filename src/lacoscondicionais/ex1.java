package lacoscondicionais;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a, b, c;
		int soma;
		
		System.out.println("Digite o número A: ");
		a = Integer.valueOf(scanner.nextLine());
		
		System.out.println("Digite o número B: ");
		b = Integer.valueOf(scanner.nextLine());
		
		System.out.println("Digite o número C: ");
		c = Integer.valueOf(scanner.nextLine());
		
		soma = a + b;
		
		if(soma > c) {
			System.out.println(b + " + " + a + " = " + soma + " > " + c);
			System.out.println("A soma de A + B é maior do que C.");
		}else if(soma < c) {
			System.out.println(b + " + " + a + " = " + soma + " < " + c);
			System.out.println("A soma de A + B é menor do que C.");
		}else if(soma == c) {
			System.out.println(b + " + " + a + " = " + soma + " = " + c);
			System.out.println("A soma de A + B é igual a C.");
		}
		
		scanner.close();

	}

}
