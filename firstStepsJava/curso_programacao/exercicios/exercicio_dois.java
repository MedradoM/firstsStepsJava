
import java.util.Locale;
import java.util.Scanner;

public class exercicio_dois {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double pi, x, total;
		pi = 3.14159;
		
		System.out.println("Digite um valor para o raio para calcular o valor da area do circulo");
		x = sc.nextDouble();
		total = pi * x * x;
		
		System.out.printf("O valor do seu círculo deu : %.4f%n", total);
		
		
		sc.close();
	}

}
