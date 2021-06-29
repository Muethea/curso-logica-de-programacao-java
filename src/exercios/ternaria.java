package exercios;
public class ternaria {

	public static void main(String[] args) {
		double preco = 23;
	double	desconto = (preco < 20) ? preco*0.1 : preco*0.05;
		System.out.printf("%.2f%n",desconto);

	}

}
