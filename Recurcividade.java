package recurcividade;

import java.util.Scanner;

public class Recurcividade {

	public static void main(String[] args) {
		// 2- Fa�a um programa que implemente recursividade onde dever� multiplicar os 
				//n�meros compreendidos de 1 at� o n�mero que o usu�rio desejar.
				Scanner entrada = new Scanner(System.in);
				System.out.println("Digite um numero");
				int numero = entrada.nextInt();
				int x = 5;
				System.out.println(multiplicador(x,numero));
			}
			public static int multiplicador (int x, int numero) {
					if(numero == 1) {
					return 1;
				}else {
					return (x * multiplicador(x,numero - 1));
					
				}
				
				}

}
