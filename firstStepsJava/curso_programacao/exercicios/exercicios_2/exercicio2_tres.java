package exercicios_2;

import java.util.Scanner;

public class exercicio2_tres {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a hora inicial e final do torneio:");
		int horaInicial, horaFinal, duracao;
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		System.out.println("O Jogo durou " + duracao + " Hora(s)");
	
		sc.close();
	}

}
