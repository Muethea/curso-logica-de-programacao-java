package exercios;
import java.util.Locale;

import java.util.Scanner;
public class blaskara {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		double A,B,C, r1,r2, del;
		A=sc.nextDouble();
		B=sc.nextDouble();
		C=sc.nextDouble();
		del=Math.pow(B, 2)-4*A*C;
		r1=(-B+Math.sqrt(del))/2*A;
		r2=(-B-Math.sqrt(del))/2*A;
		
		
		System.out.printf("R1 = %.5f%n ",r1);
		System.out.printf("R2 = %.5f%n ",r2);
		
sc.close();
	}

}
