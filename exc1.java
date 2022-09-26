/*Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso.*/
package exercicio;

import java.util.Scanner;

public class exc1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x;

		System.out.println("Digite um número:");
		x = sc.nextInt();

		for (int i = 1; i < x; i += 2) {

			System.out.println(i);

		}
		sc.close();
	}

}
