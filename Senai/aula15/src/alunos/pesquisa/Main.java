package alunos.pesquisa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int qtd, cont = 0, cont1 = 0, cont2 = 0, cont3 = 0, totalmedia = 0, total = 0, total1 = 0, total2 = 0,
				total3 = 0;

		ArrayList<Pessoa> lista = new ArrayList<Pessoa>();

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite quantas pessoas terao para o cadastro: ");
		qtd = scan.nextInt();

		System.out.println("Digite o nome, sobrenome, idade: ");

		for (int i = 0; i < qtd; i++) {
			lista.add(new Pessoa(scan.next(), scan.next(), scan.nextInt()));
		}
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).fasedavida().equals("Crianca")) {
				cont++;
				total += lista.get(i).idade;
			}
			if (lista.get(i).fasedavida().equals("Jovem")) {
				cont1++;
				total1 += lista.get(i).idade;
			}
			if (lista.get(i).fasedavida().equals("Adulto")) {
				cont2++;
				total2 += lista.get(i).idade;
			}
			if (lista.get(i).fasedavida().equals("Idoso")) {
				cont3++;
				total3 += lista.get(i).idade;
			}
			totalmedia += lista.get(i).idade;
		}

		System.out.println("Nome\t\tSobrenome\tIdade\t\tFaseDaVida\n");
		for (int i = 0; i < lista.size(); i++) {
			System.out.printf("%s     \t%s    \t%d\t\t%s\n", lista.get(i).nome, lista.get(i).sobrenome,
					lista.get(i).idade, lista.get(i).fasedavida());
		}
		System.out.printf("\nCriancas: %d\nJovens: %d\nAdultos: %d\nIdosos: %d\n", cont, cont1, cont2, cont3);

		System.out.println("\nA media de idade e: " + totalmedia / lista.size() + " anos");

		System.out.println("\nMEDIA RELATIVA DE IDADE");
		System.out.printf("\nCriancas: %d\nJovens: %d\nAdultos: %d\nIdosos: %d", (total / cont), (total1 / cont1),
				(total2 / cont2), (total3 / cont3));

	}

}
