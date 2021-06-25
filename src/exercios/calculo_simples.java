package exercios;
import java.util.Locale;
import java.util.Scanner;
public class calculo_simples {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		int peca1, valor1, peca2, valor2;
		double unitario1, unitario2, valorapagar;
		peca1=sc.nextInt();
		valor1=sc.nextInt();
		unitario1=sc.nextDouble();
		peca2=sc.nextInt();
		valor2=sc.nextInt();
		unitario2=sc.nextDouble();
		valorapagar=(valor1*unitario1)+(valor2*unitario2);
		System.out.printf("VALOR A PAGAR: R$ %.2f%n",valorapagar);
		sc.close();
		
	}

}
