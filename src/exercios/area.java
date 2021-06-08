package exercios;
import java.util.Locale;
import  java.util.Scanner;
public class area {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		double largura, comp, metrquad, area, preco;
		System.out.println("Largura: ");
		largura=sc.nextDouble();
		System.out.println("Comprimento: ");
		comp=sc.nextDouble();
		System.out.println("Metro quadrado: ");
		metrquad=sc.nextDouble();
		area = largura * comp;
		preco= area*metrquad;
		System.out.printf("A area = %.2f%n",area);
		System.out.printf("O preco = %.2f%n",preco);
	
		sc.close();
	}

}
