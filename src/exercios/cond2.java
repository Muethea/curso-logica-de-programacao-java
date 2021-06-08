package exercios;
import java.util.*;
public class cond2 {

	public static void main(String[] args) {
	Scanner cond = new Scanner (System.in);
	int idade;
	char sexo;
	
	System.out.println("Digite a sua idade");
	idade = cond.nextInt();
	System.out.println("Digite o sexo");
	sexo=cond.next().charAt(0);
	
	if (idade >18 && sexo =='M') {
		System.out.println("Vai a tropa");
	}
	
	else if (idade <18 && sexo == 'F') {
			System.out.println("Vai a cozinha");
		}
		else {
			System.out.println("Vai estudar");
		}
	
	
	cond.close();
		
	}

}
