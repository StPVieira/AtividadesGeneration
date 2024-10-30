package lacosderepeticao;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		int posNum = 0;
		
		do {
			System.out.println("Digite um número: ");
			num = Integer.valueOf(scanner.nextLine());
			if(num > 0) {
				posNum += num;
			}
			
		}while(num != 0);
		System.out.println("A soma dos números positivos é: " + posNum);
		scanner.close();
	}
	

}
