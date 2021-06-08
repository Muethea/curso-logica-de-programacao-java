package exercios;

import java.util.Scanner;

public class switc {

	public static void main(String[] args) {
		Scanner w = new Scanner (System.in);
		System.out.println("Digite o dia ");
		int x = w.nextInt();
		String dia;
		
		switch(x){
		case 1:
			dia = "Domingo";
			break;
			
			case 2:
				dia="Segunda-Ferira";
				break;
			case 3:
				dia="Terça-Ferira";
				break;
			case 4:
				dia="Quarta-Ferira";
				break;
			case 5:
				dia="Quinta-Ferira";
				break;
			case 6:
				dia="Sexta-Ferira";
				break;
			case 7:
				dia="Sabado";
				break;
				
				default:
					dia="Dia Invalido";
		}	
			
					System.out.println("O dia da Semana selecionado é: "+dia);
					w.close();
		

	}

}
