package exercios;
import java.util.Locale;
import java.util.Scanner;

public class Consumo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		int X;
		float Y;
		X=sc.nextInt();
		Y=sc.nextFloat();
		System.out.printf(String.format(" %.3f km/l%n ",X/Y));
		sc.close();

	}

}
