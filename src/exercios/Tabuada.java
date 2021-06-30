package exercios;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int N=sc.nextInt();
		char resp;
		do {
			
			for (int i = 1; i <=10; i++) {
				int produto = i*N;
				System.out.println(i + " X " + N + " = " + produto);
			}
			System.out.println("Deseja saber a tabuada de outro numero: (S/N) ");
			resp=sc.next().charAt(0);
			N=sc.nextInt();
		} while (resp !='n');
	
		
		sc.close();
	}

}
