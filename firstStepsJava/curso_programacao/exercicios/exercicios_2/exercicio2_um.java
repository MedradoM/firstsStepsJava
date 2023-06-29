package exercicios_2;

import java.util.Scanner;

public class exercicio2_um {

	public static void main(String[] args) {
		
		int x;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		x = sc.nextInt();
		
		if (x % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}

		sc.close();
	}

}
