package exercios;

import java.util.Locale;
import java.util.Scanner;

public class nota {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		double nota1, nota2, media;
		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		
		while (nota1 < 0 || nota2 >10) {
			
			
				media =(nota1 +nota2)/2.0;
				System.out.printf("",media);
			
		}
		nota1 =sc.nextDouble();
		nota2=sc.nextDouble();
		
		sc.close();

	}

}
