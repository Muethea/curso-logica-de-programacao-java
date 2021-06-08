package exercios;
import java.util.*;
public class condicional {

	public static void main(String[] args) {
		Scanner cond = new Scanner (System.in);
		int numero;
		System.out.println("Digite o numero: ");
		numero=cond.nextInt();
		
		if (numero <0) {
			System.out.println("Negativo");
		}
		else {
			System.out.println("Nao negativo");
		}
		
		cond.close();
		
	}

}
