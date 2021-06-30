package exercios;

import java.util.Scanner;

public class impar_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int X = sc.nextInt();
		
			for (int i =1; i<=X; i=i+2) {

				System.out.println(i);
			}
		
		
		sc.close();
	}

}
