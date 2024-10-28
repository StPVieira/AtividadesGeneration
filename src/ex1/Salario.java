package ex1;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float salario;
		float abono;
		float novoSalario;
		
		System.out.println("Digite o salário: ");
		salario = scanner.nextFloat();
		
		System.out.println("Digite o abono: ");
		abono = scanner.nextFloat();
		
		novoSalario = salario + abono;
		
		DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
		symbols.setDecimalSeparator('.');
		DecimalFormat df = new DecimalFormat("0.00", symbols);		
		System.out.println("Salário Líquido: " + df.format(novoSalario));
		
		scanner.close();
	}

}

