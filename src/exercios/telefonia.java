package exercios;
import java.util.Scanner;
public class telefonia {

	public static void main(String[] args) {
		Scanner tel = new Scanner (System.in);
		int tempo, operadora = 50, tempoapagar;
		System.out.println("Digite o tempo da ligacao: ");
		tempo = tel.nextInt();
		tempoapagar=operadora+(tempo-100)*2;
		if (tempo >100) {
			System.out.println("Deve pagar "+tempoapagar);
		}
		
		else {
			System.out.println("Valor a pagar : "+operadora);
		}
		
		tel.close();
	}

}
