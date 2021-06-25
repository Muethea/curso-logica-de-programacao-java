package exercios;
import java.util.Locale;
import java.util.Scanner;
public class Salarios {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		int numero, trabalho;
		double valor, salario;
		numero=sc.nextInt();
		trabalho=sc.nextInt();
		valor=sc.nextDouble();
		salario=valor*trabalho;
		System.out.println("NUMBER = "+numero);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
		
		

	}

}
