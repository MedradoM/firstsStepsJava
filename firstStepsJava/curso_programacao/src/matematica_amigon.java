import java.util.Scanner;

public class matematica_amigon {

	public static void main(String[] args) {
		
		double x, y, z, A, B, C;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite três valores para saber sua raiz quadrada!");
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		z = sc.nextDouble();
		
			A = Math.sqrt(x);
			B = Math.sqrt(y);
			C = Math.sqrt(z);
				System.out.println("Raiz quadrada de " + x + " = " + A);
				System.out.println("Raiz quadrada de " + y + " = " + B);
				System.out.println("Raiz quadrada de " + z + " = " + C);
				
		sc.close();
		
	}

}
