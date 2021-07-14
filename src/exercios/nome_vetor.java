package exercios;

import java.util.Locale;
import java.util.Scanner;

public class nome_vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		String [] nome = new String [N];
		int [] idades = new int [N];
		double alturas [] = new double [N];
		
		for (int i = 0; i <N; i++) {
			nome [i] = sc.next();
			idades [i] = sc.nextInt();
			alturas [i] =sc.nextDouble();
		}
		double	soma = 0;
		for (int i = 0; i < N; i++ ) {
			soma=soma + alturas [i];
			
		}	
		double media = soma/N;
		System.out.printf("Altura media: %.2f%n",media);
		sc.close();

	}

}
