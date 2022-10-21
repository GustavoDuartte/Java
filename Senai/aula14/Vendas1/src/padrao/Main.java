package padrao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		float subtotal[] = new float[10];

		float total = 0, aux;
		String auxn;

		Venda[] produto = new Venda[3];

		System.out
				.println("Digite o nome do produto, a quantidade, e o preço do produto(em unidade) respectivamente: ");
		for (int i = 0; i < produto.length; i++) {

			produto[i] = new Venda(scan.next(), scan.nextFloat(), scan.nextFloat());
		}

		for (int i = 0; i < produto.length; i++) {
			subtotal[i] = produto[i].subtotal();
			total += subtotal[i];
		}

		System.out.println("Produto\t\tQuantidade\tPreço\t\tSubTotal");
		for (int i = 0; i < produto.length; i++) {
			System.out.printf("%s\t\t%.0f\t\t%.2f\t\t%.2f\n", produto[i].nome, produto[i].preco, produto[i].quantidade,
					subtotal[i]);
		}
		for (int i = 0; i < produto.length; i++) {
			for (int j = 0; j < (produto.length - 1); j++) {
				if (produto[i].preco < produto[j].preco) {

					aux = produto[i].preco;
					produto[i].preco = produto[j].preco;
					produto[j].preco = aux;

					auxn = produto[i].nome;
					produto[i].nome = produto[j].nome;
					produto[j].nome = auxn;
				}
			}
		}

		System.out.println("\nMedia de preços= " + (total / produto.length));
		System.out.println("O Produto mais barato é: " + produto[(produto.length - 1)].nome);
		System.out.println("O Produto mais caro é: " + produto[0].nome);

		for (int i = 0; i < produto.length; i++) {
			for (int j = 0; j < (produto.length - 1); j++) {
				if (produto[i].quantidade < produto[j].quantidade) {

					aux = produto[i].quantidade;
					produto[i].quantidade = produto[j].quantidade;
					produto[j].quantidade = aux;

					auxn = produto[i].nome;
					produto[i].nome = produto[j].nome;
					produto[j].nome = auxn;
				}
			}
		}

		System.out.println("O produto mais vendido é: " + produto[(produto.length - 1)].nome);

	}

}
