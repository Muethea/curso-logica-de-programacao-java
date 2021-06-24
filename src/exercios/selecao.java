package exercios;
import java.util.Scanner;
public class selecao {

	public static void main(String[] args) {
		int A, B, C, D;
		Scanner sc = new Scanner (System.in);
		A=sc.nextInt();
		B=sc.nextInt();
		C=sc.nextInt();
		D=sc.nextInt();
		int somaCD= C+D;
		int somaAB=A+B;
		if (B>C && D>A && somaCD> somaAB && C>0 && D>0) {
			System.out.println("Valores  Aceitos");
		}
		else {
			System.out.println("Valores nao Aceitos");
		}
	}

}
