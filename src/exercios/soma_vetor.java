package exercios;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		double [] vet = new double [N];
		double soma =0;
		double media = 0;
		
		for (int i = 0; i <N; i++) {
			vet [i] = sc.nextDouble();
		}
		for (int i =0; i< N; i++) {
		
			System.out.print(vet[i]+ " ");
		
		}
		System.out.println("");
		
		for (int i = 0; i < N; i++) {
			soma  = soma + vet[i];

		}
		System.out.printf("%.1f%n ",soma);
		
		for (int i = 0; i < N; i++) {
			media  = soma / N;

		}
		System.out.printf("%.1f%n",media);
		sc.close();

	}

}
