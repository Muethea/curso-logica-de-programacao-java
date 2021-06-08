package exercios;

import java.util.Locale;
import java.util.Scanner;

public class idade_media {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		String nome =sc.next();
		int Idade = sc.nextInt();
		String nome2 =sc.next();
		int Idade2 = sc.nextInt();
		double idademedia = (double) (Idade+Idade2)/2;
		
		System.out.printf("A idade Media de "+nome+" e "+nome2+" é de %.1f%n",idademedia," anos de idade");
		
		sc.close();
	}

}
