/* Ler um número inteiro N e calcular todos os seus divisores.*/
package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class exc6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = 0, div = 1;

		System.out.println("Digite um número:");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			if (n % div == 0) {
				System.out.println(div);
			}

			div++;
		}
		sc.close();
	}
}
