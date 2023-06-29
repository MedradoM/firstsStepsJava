
import java.util.Scanner;

public class exercicio_um {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y, soma;
		
		System.out.println("Digite dois números para efetuar a soma");
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		soma = x + y;
		
		System.out.printf("a soma dos valores deu: " + soma);
		
		sc.close();

	}

}
