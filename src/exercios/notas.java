package exercios;

import java.util.Locale;
import java.util.Scanner;

public class notas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		double nota1, nota2, notaf;
		nota1=sc.nextDouble();
		nota2=sc.nextDouble();
		notaf=nota1+nota2;
		if (notaf <60.0) {
			System.out.printf("NOTA FINAL = %.1f%n REPROVADO", notaf);
		}
		
		else {
			System.out.printf("NOTA FINAL = %.1f%n ",notaf);
		}
		sc.close();
	}

}
