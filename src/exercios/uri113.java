package exercios;

import java.util.Scanner;

public class uri113 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);
	     int X =sc.nextInt();
	     int Y =sc.nextInt();
	     
	     while (X != Y){
	         if (X<Y){
	             System.out.println("Crecente");
	             
	         }
	         else{
	             System.out.println("Decrescente");
	         }
	         X =sc.nextInt();
	         Y =sc.nextInt();
	     }
	     sc.close();
	}

}
