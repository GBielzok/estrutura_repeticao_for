/* Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
exemplo.*/
package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class exc7 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número:");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			
			int quadrado = i*i;
			
			int cubo = i*i*i;
			
			System.out.printf("%d, %d, %d%n", i, quadrado, cubo);
			
		}
		sc.close();
	}
}
