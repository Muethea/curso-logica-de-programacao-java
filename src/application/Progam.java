package application;
import java.util.Locale;
import java.util.Scanner;
import entidades.Triangulo;
public class Progam {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Digite as medidas do triangulo X: ");
		x.a=sc.nextDouble();
		x.b=sc.nextDouble();
		x.c=sc.nextDouble();
		double areaX = x.area();
		System.out.println("Digite as medidas do triangulo Y: ");
		y.a=sc.nextDouble();
		y.b=sc.nextDouble();
		y.c=sc.nextDouble();
		double areaY =y.area();
		System.out.printf("Area do triangulo X:  %.4f%n",areaX);
		System.out.printf("Area do triangulo Y:  %.4f%n",areaY);
		
		if (areaX > areaY) {
			System.out.printf("A maior area : X ");
		}
		
		else {
			System.out.println("A maior area: Y");
		}
		
		sc.close();
	}

}
