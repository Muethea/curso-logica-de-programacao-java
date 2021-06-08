package exercios;
import java.util.Scanner;

public class Par_impar {

	public static void main(String[] args) {
		Scanner n = new Scanner (System.in);
		int numero;
		System.out.println("Digite o numero ");
		numero = n.nextInt();
		
		if (numero % 2 ==0) {
			System.out.println("Par");
		}
		else {
			System.out.println("Impar");
		}
			n.close();
			}

}
