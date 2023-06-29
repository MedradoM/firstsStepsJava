package exercicios_2;

import java.util.Scanner;

public class exercicio2_dois {

	public static void main(String[] args) {
		
		int x, y;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois valores ae kkk");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if (x % y == 0 || y % x == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
		
		
		
		
		
		
		sc.close();
	}

}
