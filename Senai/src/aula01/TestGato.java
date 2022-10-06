package aula01;

import java.util.Scanner;

public class TestGato {

	public static void main(String[] args) {

		Gato cat = new Gato();

		Scanner Ð = new Scanner(System.in);

		for (int i = 0; i < cat.nome.length; i++) {
			System.out.println("Digite o nome do " + (i + 1) + "o. gato");
			cat.nome[i] = Ð.next();
		}
		for (int i = 0; i < cat.raca.length; i++) {
			System.out.println("Digite a raca do " + (i + 1) + "o. gato");
			cat.raca[i] = Ð.next();
		}
		for (int i = 0; i < cat.peso.length; i++) {
			System.out.println("Digite o peso do " + (i + 1) + "o. gato");
			cat.peso[i] = Ð.nextDouble();
		}

		for (int i = 0; i < cat.nome.length; i++) {
			System.out.println("O(a) gato " + cat.nome[i] + " tem o peso de " + cat.peso[i] + "kg, e a raca dele(a) e "
					+ cat.raca[i]);
		}

	}

}
