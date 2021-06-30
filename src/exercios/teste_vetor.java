package exercios;
import java.util.Locale;
import java.util.Scanner;

public class teste_vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		int N  =sc.nextInt();
		int [] vet = new int [N];
		for (int x =0; x <N; x++) {
			vet[x] = sc.nextInt();
		}
		for (int x = 0; x < N; x++) {
			System.out.println(vet[x]);
		}
		
		sc.close();
	}

}
