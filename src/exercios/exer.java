package exercios;

import java.util.Scanner;

public class exer {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double raio, Pi=3.14159;
		System.out.println("Digite o valor do raio: ");
		raio=sc.nextDouble();
		raio= Math.pow(raio, 2);
		double area = Pi*raio;
		System.out.printf("O valor da area é %.4f%n ",area);
		

		sc.close();
		

	}

}
