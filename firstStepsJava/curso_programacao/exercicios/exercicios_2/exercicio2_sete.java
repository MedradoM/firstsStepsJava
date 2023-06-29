package exercicios_2;

import java.util.Locale;
import java.util.Scanner;

public class exercicio2_sete {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Projeto Imposto de Renda");
		System.out.println("Digite um valor para calcular seu imposto:");

		double s = sc.nextDouble();
		double i;

		if (s <= 2000) {
			i = 0.0;
		} else if (s <= 3000) {
			i = (s - 2000) * 0.08;
		} else if (s <= 4500) {
			i = (s - 3000) * 0.18 + 1000.0 * 0.08;
		} else {
			i = (s - 4500) * 0.28 + 1500.0 * 0.18 + 1000 * 0.08;
		}

		if (i == 0) {
			System.out.println("Isento");
		} else {
			System.out.printf("R$ %.2f%n", i);
		}
		sc.close();
	}

}
