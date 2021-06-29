package exercios;
import java.util.Scanner;
public class maior_numero {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite tres numeros: ");
		int n1, n2, n3;
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		int heigher = max(n1, n2, n3);
		showResult(heigher);
		sc.close();

	}
	
	public static int max (int a, int b, int c) {
		int aux;
		if (a>b && a>c) {
			aux=a;
		}
		
		else if (b>c && b>c) {
			aux=b;
		}
		else {
			aux=c;
		}
		
		return aux;
	}
	
	public static void  showResult(int value) {
	
		System.out.println("Maior numero = "+value);
		
	}

}
