package calculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		float n1;
		float n2;
		int escolher = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual o primeiro n�mero?");
		n1 = input.nextFloat();
		
		System.out.println("Qual o segundo n�mero?");
		n2 = input.nextFloat();
		
		System.out.println("Escolhe qual dessas op��es vai quere executa");
		System.out.println("1-soma  2-subtra��o  3-multiplica��o  4-divis�o  5-porcentagem");
		escolher = input.nextInt();
		
		if(escolher == 1) {
			System.out.println("sua soma foi: " + (n1 + n2) );
			
		}
		else if(escolher == 2) {
			System.out.println("sua subtra��o foi: " + (n1 - n2) );
			
		}
		else if(escolher == 3) {
			System.out.println("sua multiplica��o foi: " + (n1 * n2) );
			
		}
		else if(escolher == 4) {
			System.out.println("sua divis�o foi: " + (n1 / n2) );
		}
		else if(escolher == 5) {
			System.out.println("sua porcentagem foi " + (n1 / 100 * n2) + "%");
		}
		else {
			System.out.println("essa opc�o � invalida!!");
		}
		
	}

}
