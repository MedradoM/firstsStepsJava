import java.util.Scanner;

public class exercicio_tres {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A, B, C, D, dif;
		
		System.out.println("Digite quatro valores as fodasi kkkk");
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		dif = A * B - C * D;
			System.out.println("A diferença entre os valores é: " + dif);
		
		sc.close();
		
	}

}
