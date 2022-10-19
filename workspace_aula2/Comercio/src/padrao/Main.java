package padrao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Operacao opera[] = new Operacao[10];

		Scanner scan = new Scanner(System.in);

		System.out.println(
				"Digite o nome do produto, Quantidade comprada, Quantidade vendida, Preço da compra, e o Preço da venda respectivamente: ");
		for (int i = 0; i < opera.length; i++) {
			opera[i] = new Operacao(scan.next(), scan.nextInt(), scan.nextInt(), scan.nextFloat(), scan.nextFloat());
		}

		for (int i = 0; i < opera.length; i++) {
			System.out.println(opera[i].toString());
		}

	}

}
