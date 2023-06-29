package exercicios_2;

import java.util.Scanner;

public class exercicio2_cinco {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("Digite um numero: ");
		n = sc.nextInt();
		
		if (n > 0 && n < 25) {
			System.out.println("Numero entre[0,25]");
		}
		else if (n > 25 && n < 50) {
			System.out.println("Numero entre[25,50]");
		}
		else if (n > 50 && n < 75) {
			System.out.println("Numero entre[50,75]");
		}
		else if (n > 75 && n < 100) {
			System.out.println("Numero entre[75,100]");
		}
		else {
			System.out.println("Numero inválido");
		}
		
		
		sc.close();
	}

}
