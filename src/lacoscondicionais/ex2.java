package lacoscondicionais;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um número: ");
		num = Integer.valueOf(scanner.nextLine());
		
		if(num > 0 && num % 2 == 0) {
			System.out.println("O número " + num + " é par e positivo!");
		}else if(num < 0 && num % 2 != 0) {
			System.out.println("O número " + num + " é impar e negativo!");
		}else if(num < 0 && num % 2 == 0) {
			System.out.println("O número " + num + " é par e negativo!");
		}else if(num > 0 && num % 2 != 0) {
			System.out.println("O número " + num + " é impar e positivo!");
		}
		scanner.close();
	}

}
