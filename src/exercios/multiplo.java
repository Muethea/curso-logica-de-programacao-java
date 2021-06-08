package exercios;
import java.util.Scanner;
public class multiplo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n1, n2;
		System.out.println("Primeiro numero: ");
		n1=sc.nextInt();
		System.out.println("Segundo numero: ");
		n2=sc.nextInt();
		
		if (n1%2==0 && n2%2==0) {
			System.out.println("sao Multplos");
		}
		else {
			System.out.println("Nao sao Multplos");
		}
		
		sc.close();
	}

}
