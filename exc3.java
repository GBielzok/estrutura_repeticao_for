/* Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.*/
package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class exc3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n;
		double valorDigitado = 0, valor1 = 0, valor2 = 0, valor3 = 0, res = 0;

		System.out.println("Digite quantos números irá entrar:");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < 3; j++) {

				System.out.println("Digite um valor:");
				valorDigitado = sc.nextDouble();

				switch (j) {

				case 0:
					valor1 = valorDigitado * 2;
					break;
				case 1:
					valor2 = valorDigitado * 3;
					break;
				case 2:
					valor3 = valorDigitado * 5;
					res = (valor1 + valor2 + valor3) / 10;
					System.out.printf("%.1f\n", res);
					break;

				}

			}

		}

		sc.close();
	}

}