import java.util.Locale;
import java.util.Scanner;

public class exercicio_seis {

	public static void main(String[] args) {

		double a, b, c, v1, v2, v3, v4, v5;
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digita três valor ae na moral kkk:");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
			v1 = a * c / 2;
			v2 = c * c * 3.14159;
			v3 = (a + b) * c / 2;
			v4 = b * b;
			v5 = a * b;
			
			System.out.printf("TRIANGULO: %.3f%n", v1);
			System.out.printf("CIRCULO: %.3f%n", v2);
			System.out.printf("TRAPEZIO: %.3f%n", v3);
			System.out.printf("QUADRADO: %.3f%n", v4);
			System.out.printf("RETANGULO: %.3f%n", v5);
			
			
		sc.close();	
	}

}
