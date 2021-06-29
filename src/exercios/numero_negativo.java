package exercios;
import java.util.Scanner;
public class numero_negativo {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int numero=sc.nextInt();
		
		if (numero <0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NAO NEGATIVO");
		}
		sc.close();
	}

}
