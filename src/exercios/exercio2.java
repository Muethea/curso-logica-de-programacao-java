package exercios;
import java.util.*;

public class exercio2 {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		int A, B, C, D, DIFERENCA;
		System.out.println("Valor A");
		A = numero.nextInt();
		System.out.println("Valor B");
		B = numero.nextInt();
		System.out.println("Valor C");
		C = numero.nextInt();
		System.out.println("Valor D");
		D = numero.nextInt();
		DIFERENCA = (A*B-C*D);
		System.out.println("DIFERENCA = "+DIFERENCA);
		numero.close();		
	}
 
}
