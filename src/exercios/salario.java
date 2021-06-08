package exercios;

import java.util.Locale;
import java.util.Scanner;

public class salario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		String nome=sc.next();
		double salarioFixo=sc.nextDouble();
		double totalVendas=sc.nextDouble();
		double total =(totalVendas*0.15)+salarioFixo;
		System.out.printf("TOTAL = R$ %.2f%n ",total);
	sc.close();
	}

}
