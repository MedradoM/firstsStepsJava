package exercicios_3;

import java.util.Scanner;

public class exercicio3_dois {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x, y;
		
		System.out.println("Digite as cordenadas de um plano cartesiano para saber em qual quadrante ele se encontra:");
		x = sc.nextInt();
		y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			}
			else if (x < 0 && y > 0) {
				System.out.println("segundo");
			}
			else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			}
			else {
				System.out.println("quarto");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		System.out.println("");
		
		
		
		sc.close();
	}

}
