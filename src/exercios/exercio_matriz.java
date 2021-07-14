package exercios;

import java.util.Scanner;

public class exercio_matriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		int [] [] matriz = new int [N] [N];
		
		for (int i = 0; i < N; i++) {
			for (int x = 0; x< N; x++) {
				matriz [i] [x]=sc.nextInt();
			}
			System.out.println();
		}
		
		System.out.println("Diagonal Principal: ");
		for (int i =0; i<N; i++) {
			System.out.println(matriz[i][i]);
		}
		int cont =0;
		for (int i =0; i < N; i++) {
			for(int x= 0; x<N; x++) {
				if (matriz[i][x]<0) {
					cont = cont +1;
				}
			}
		}
		System.out.println("Quantidade de negativos = "+cont);
		
		
		sc.close();
	}

}
