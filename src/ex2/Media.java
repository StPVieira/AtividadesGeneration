package ex2;

import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Media {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		float media;
		
		System.out.println("Nota 1: ");
		nota1 = scanner.nextFloat();
		
		System.out.println("Nota 2: ");
		nota2 = scanner.nextFloat();
		
		System.out.println("Nota 3: ");
		nota3 = scanner.nextFloat();
		
		System.out.println("Nota 4: ");
		nota4 = scanner.nextFloat();
		
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
		symbols.setDecimalSeparator('.');
		DecimalFormat df = new DecimalFormat("0.0", symbols);

		System.out.println("Média final: " + df.format(media));
		
		scanner.close();
	}

}
