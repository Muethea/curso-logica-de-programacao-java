package exercios;
import java.util.Scanner;
public class soma {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int N=sc.nextInt();
		int soma =0;
		
		for (int n = 0; n<N; n++) {
			int x=sc.nextInt();
			soma=soma+x;
		
		}
		System.out.println(soma);
		sc.close();
	}

}
