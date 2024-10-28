package ex4;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		float numero1, numero2, numero3, numero4;
		float diferenca;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("numero1: ");
		numero1 = scanner.nextFloat();
		
		System.out.println("numero2: ");
		numero2 = scanner.nextFloat();
		
		System.out.println("numero3: ");
		numero3 = scanner.nextFloat();
		
		System.out.println("numero4: ");
		numero4 = scanner.nextFloat();
		
		diferenca = (numero1 * numero2) - (numero3 * numero4);
		
		DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
		symbols.setDecimalSeparator('.');
		DecimalFormat df = new DecimalFormat("0.0", symbols);
		
		System.out.println("Diferença: " + diferenca);
		scanner.close();
	}
}
