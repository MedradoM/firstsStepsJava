package exercicios_2;

import java.util.Scanner;

public class exercicio2_seis {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite dois valores: ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if (x > 0 && y > 0) {
			System.out.println("Valor se encontra no eixo Q1");
		}
		else if (x < 0 && y > 0) {
			System.out.println("Valor se encontra no eixo Q2");
		}
		else if (x < 0 && y < 0) {
			System.out.println("Valor se encontra no eixo Q3");
		}
		else if (x > 0 && y < 0) {
			System.out.println("Valor se encontra no eixo Q4");
		}
		else {
			System.out.println("Origem");
		}
		
		
		
		
		sc.close();
	}

}
