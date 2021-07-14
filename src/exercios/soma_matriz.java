package exercios;

import java.util.Locale;
import java.util.Scanner;

public class soma_matriz {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		 
		double [] [] matriz = new double [M] [N];
		
		for (int i =0; i< M; i++) {
			for (int j =0; j < N; j++) {
				matriz [i] [j] =sc.nextDouble();
			}
		}
		double [] vet = new double [M];
		for (int i = 0; i<M; i++) {
			double soma = 0.0;
			for (int j = 0; j <N; j++) {
				soma = soma + matriz [i] [j];
			}
			vet [i] = soma;
		
		}
		for (int i = 0; i<M; i++){
			System.out.println(vet[i]);	
		}
		
		
		
		sc.close();

	}

}
