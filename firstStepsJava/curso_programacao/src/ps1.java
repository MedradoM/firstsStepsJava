import java.util.Scanner;

public class ps1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int interprise;
		double A = 0, B =0, C =0, F =0, I =0;
		boolean add;

		
		
		do{
			System.out.println("Selecione a empresa que você quer :");
			System.out.println("Digite 1 para = A");
			System.out.println("Digite 2 para = B");
			System.out.println("Digite 3 para = C");
			System.out.println("Digite 4 para = F");
			System.out.println("Digite 5 para = I");
			System.out.println("Digite 6 para cancelar");
			interprise = sc.nextInt();
			 
			switch(interprise) {
			case 1:
				System.out.println("Empresa pagou? type true, or false");
				add = sc.nextBoolean();
				if (add = true) {
					A = A + 1;
				} else {
					A = A - 1;
				}
				break;
			case 2:
				System.out.println("Empresa pagou? type true, or false");
				add = sc.nextBoolean();
				if (add = true) {
					B = B + 1;
				} else {
					B = B - 1;
				}
				break;
			case 3:
				System.out.println("Empresa pagou? type true, or false");
				add = sc.nextBoolean();
				if (add = true) {
					C = C + 1;
				} else {
					C = C - 1;
				}
				break;
			case 4:
				System.out.println("Empresa pagou? type true, or false");
				add = sc.nextBoolean();
				if (add = true) {
					F = F + 1;
				} else {
					F = F - 1;
				}
				break;
			case 5:
				System.out.println("Empresa pagou? type true, or false");
				add = sc.nextBoolean();
				if (add = true) {
					I = I++;
				} else {
					I = I - 1;
				}
				break;		
			default:	
				System.out.println("Total de pagamentos, empresa A = " + A);
				System.out.println("Total de pagamentos, empresa B = " + B);
				System.out.println("Total de pagamentos, empresa C = " + C);
				System.out.println("Total de pagamentos, empresa F = " + F);
				System.out.println("Total de pagamentos, empresa I = " + I);
			}
			
			System.out.println("Registro adicionado com sucesso!!!");
		}while(interprise != 6);
		
		sc.close();
	}

}
