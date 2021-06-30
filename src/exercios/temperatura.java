package exercios;

import java.util.Locale;
import java.util.Scanner;

public class temperatura {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		char resp;
		do  { 
			Scanner sc = new Scanner (System.in);
			double celcius, temperatura; 
			System.out.println("Digite a temperatura em Celcius");
			celcius = sc.nextDouble();
			temperatura = celcius * 9.0/5.0+32.0;
			System.out.printf("Equivalente em Fahrenheit: %.2f%n ",temperatura);
			System.out.println("Deseja Repetir (S/N) ");
			 resp =sc.next().charAt(0);
		} while (resp !='n');
	}

}
