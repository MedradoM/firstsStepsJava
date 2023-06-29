import java.util.Locale;
import java.util.Scanner;

public class exercicio_exemplo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("digite três valores referentes ao valor do triangulo X");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		System.out.println("digite três valores referentes ao valor do triangulo Y");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA + xB + xC) / 2.0;
		double areax = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		p = (yA + yB + yC) / 2.0;
		double areay = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
		System.out.printf("Trinagulo x area: %.4f%n", areax);
		System.out.printf("Trinagulo y area: %.4f%n", areay);
		
		if (areax > areay) {
			System.out.println("maior é a area x");
		}
		else {
			System.out.println("maior é a area y");
		}
		
		sc.close();
	}

}
