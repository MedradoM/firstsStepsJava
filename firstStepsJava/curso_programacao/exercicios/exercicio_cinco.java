import java.util.Scanner;

public class exercicio_cinco {

	public static void main(String[] args) {
		
		
		int c1, c2, q1, q2;
		double v1, v2, x, y, z;
		
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Digite o código do produto, quantidade, e seu preço(Produto 1):");
			c1 = sc.nextInt();
			q1 = sc.nextInt();
			v1 = sc.nextDouble();
			x = q1 * v1;
			
			System.out.println("Digite o código do produto, quantidade, e seu preço(Produto 2):");
			c2 = sc.nextInt();
			q2 = sc.nextInt();
			v2 = sc.nextDouble();
			y = q2 * v2;
			
			z = x + y;
			System.out.printf("Valor a pagar: R$ %.2f%n", z);
		
		sc.close();
	}

}
