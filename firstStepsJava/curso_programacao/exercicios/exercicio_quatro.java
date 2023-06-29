import java.util.Locale;
import java.util.Scanner;

public class exercicio_quatro {

	public static void main(String[] args) {
		
		int x;
		double h, s, v;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número do Funcionário:");
		
		x = sc.nextInt();
		
		System.out.println("Digite a qauntidade de horas trabalhadas e seu salário:");
		
		h = sc.nextDouble();
		s = sc.nextDouble();
		v = h * s;
		
		Locale.setDefault(Locale.US);
		
		System.out.println("NUMBER = " + x);
		System.out.printf("SALARY = U$ %.2f%n", v);
		
		
		
		sc.close();
	}

}
