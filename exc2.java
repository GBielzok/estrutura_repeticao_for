/* Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).*/
package exercicio;

import java.util.Scanner;

public class exc2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n, ndigitado, in = 0, out = 0;

		System.out.println("Digite quantos números irá entrar:");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("Digite um número:");
			ndigitado = sc.nextInt();

			if (ndigitado >= 10 && ndigitado <= 20) {
				in++;
			} else
				out++;

		}

		System.out.println("Números digitados:");
		System.out.println(in + " in");
		System.out.println(out + " out");

		sc.close();
	}

}