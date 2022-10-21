package padrao;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList<Operacao> opera = new ArrayList<Operacao>();

		int quantos;

		try (Scanner scan = new Scanner(System.in)) {

			System.out.println("Digite quantos produtos deseja cadastrar : ");
			quantos = scan.nextInt();

			System.out.println(
					"Digíte o nome, quantidade comprada, quantidade vendida, preco da compra e o preco de venda dos produtos respectivamente: ");
			for (int i = 0; i < quantos; i++) {
				opera.add(
						new Operacao(scan.next(), scan.nextInt(), scan.nextInt(), scan.nextFloat(), scan.nextFloat()));

			}
			System.out.println(
					"\nProduto\t\t\tqtdComprada\tqtdVendida\tprecoCompra\t\tprecoVenda\t\tinvestimento()\t\tfaturamento()\t\tlucro(R$)\t\tlucro(%)\t\trelacao");
			System.out.println(
					"----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			for (int i = 0; i < opera.size(); i++) {
				System.out.printf(
						"%s  \t\t%d\t\t%d\t\t%.2f R$  \t\t%.2f R$  \t\t%.2f R$  \t\t%.2f R$  \t\t%.2f R$  \t\t%.2f %%  \t\t%s  \t\t\n",
						opera.get(i).produto, opera.get(i).qtdComprada, opera.get(i).qtdVendida,
						opera.get(i).precoCompra, opera.get(i).precoVenda, opera.get(i).investimento(),
						opera.get(i).faturamento(), opera.get(i).lucroDinheiro(), opera.get(i).lucroPorcentagem(),
						opera.get(i).relacaoLucro());
			}
		}
//
//		System.out.println();
//		for (int i = 0; i < opera.size(); i++) {
//			System.out.println(opera.get(i).toString());
//		}

	}

}