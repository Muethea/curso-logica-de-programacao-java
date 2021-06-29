package POO;
import java.util.Scanner;
public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		numeros n;
		n = new numeros();
		System.out.println("Digite 3 numeros: ");
		n.a=sc.nextInt();
		n.b=sc.nextInt();
		n.c=sc.nextInt();
		if (n.a> n.b && n.a>n.c) {
			System.out.println("Maior = "+n.a);
		}
		else if (n.b>n.b && n.b>n.c) {
			System.out.println("Maior = "+n.b);
		}
		else {
			System.out.println("Maior = "+n.c);
		}
		sc.close();
	}
}
