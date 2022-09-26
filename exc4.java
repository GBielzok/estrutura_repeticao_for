/*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
*/
package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class exc4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n;
		double num1 = 0, num2 = 0, res = 0;

		System.out.println("Digite quantos números irá entrar:");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println("Digite um número:");
			num1 = sc.nextDouble();

			System.out.println("Digite mais um número:");
			num2 = sc.nextDouble();

			if (num2 != 0) {
				res = num1 / num2;
				System.out.printf("%.1f\n", res);

			} else
				System.out.print("Divisão impossível.\n");
		}

		sc.close();
	}
}
