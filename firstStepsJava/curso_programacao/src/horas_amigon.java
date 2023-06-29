import java.util.Scanner;

public class horas_amigon {

	public static void main(String[] args) {
		
		int hora;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Fala meu patrão que horas é agora meu chegado?");
		hora = sc.nextInt();
		
		if (hora <= 12) {
			System.out.println("Bom dia meu consagrado!!");
		}
		else {
			if (hora > 12 && hora <=18) {
				System.out.println("Boa tarde meu consagrado!!");
			}
			else {
				if (hora > 18 && hora <= 24) {
					System.out.println("Boa noite meu consagrado!!");
				}
				else {
					if (hora > 24) {
						System.out.println("Fala a hora certo desgraça!!");
					}
				}
			}
		}
		
		
		
		
		
		sc.close();
	}

}
