package calculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		float n1;
		float n2;
		int escolher = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual o primeiro número?");
		n1 = input.nextFloat();
		
		System.out.println("Qual o segundo número?");
		n2 = input.nextFloat();
		
		System.out.println("Escolhe qual dessas opções vai quere executa");
		System.out.println("1-soma  2-subtração  3-multiplicação  4-divisão  5-porcentagem");
		escolher = input.nextInt();
		
		if(escolher == 1) {
			System.out.println("sua soma foi: " + (n1 + n2) );
			
		}
		else if(escolher == 2) {
			System.out.println("sua subtração foi: " + (n1 - n2) );
			
		}
		else if(escolher == 3) {
			System.out.println("sua multiplicação foi: " + (n1 * n2) );
			
		}
		else if(escolher == 4) {
			System.out.println("sua divisão foi: " + (n1 / n2) );
		}
		else if(escolher == 5) {
			System.out.println("sua porcentagem foi " + (n1 / 100 * n2) + "%");
		}
		else {
			System.out.println("essa opcão é invalida!!");
		}
		
	}

}
