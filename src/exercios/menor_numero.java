package exercios;
import java.util.Scanner;

public class menor_numero {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n1, n2, n3;
		System.out.println("Digite tres numeros para saber qual é o menor numero: ");
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		int menorNumero = min(n1, n2, n3);
		showResult(menorNumero);	
sc.close();
}
	public static int min (int a, int b, int c) {
		int abc;
		if (a< b && a<c) {
			abc=a;
		}
		else if (b<a && b<c) {
			abc = b;
		}
		else {
			abc=c;
		}
		
		return abc;
	}
	public static void showResult(int valor) {
		System.out.println("O menor numero = "+valor);
	}
	
}
