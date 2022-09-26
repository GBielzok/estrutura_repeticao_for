/*  Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.*/
package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class exc5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = 0, fat = 1;

		System.out.println("Digite um número:");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			fat = fat * i;
		}

		System.out.print(fat);

		sc.close();
	}
}
