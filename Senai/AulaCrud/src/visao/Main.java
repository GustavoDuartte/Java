package visao;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.Venda;

public class Main {

	static ArrayList<Venda> vendas = new ArrayList<Venda>();

	static Scanner scan = new Scanner(System.in);

	static int menu = 0, qtd;

	public static void main(String[] args) {

		while (menu != 5) {
			System.out.println("1.Cadastrar Produto");
			System.out.println("2.Listar Todas");
			System.out.println("3.Alterar Dados");
			System.out.println("4.Excluir Registro");
			System.out.println("5.Sair");

			menu = scan.nextInt();

			switch (menu) {
			case 1:
				System.out.println("Digite quantas vezes deseja realizar o cadastro: ");
				qtd = scan.nextInt();
				System.out.println("Produto/Quantidade/Preco");
				for (int i = 0; i < qtd; i++) {
					create();
				}
				break;
			case 2:
				System.out.println("Produto\t\tQuantidade\t\tPreco\t\tSubTotal");
				read();
				break;
			case 3:
				System.out.println("Digite qual item deseja alterar: ");
				update(scan.nextInt());
				break;
			case 4:
				System.out.println("Digite qual item quer excluir: ");
				delete(scan.nextInt());
				break;
			case 5:
				System.out.println("Tchau!");
				break;
			default:
				System.out.println("Opcao Invalida!");
				break;
			}
		}

	}

	public static void create() {
		Venda v = new Venda();
		v.setProduto(scan.next());
		v.setQuantidade(scan.nextInt());
		v.setPreco(scan.nextFloat());
		vendas.add(v);
	}

	public static void read() {
		float total = 0;
		int i = 1;
		for (Venda v : vendas) {
			System.out.println(i + "-" + v.toString());
			total += v.subTotal();
			i++;
		}
		System.out.printf("Total = %.2f\n", total);
	}

	public static void update(int indice) {
		if (indice >= 0 && indice < vendas.size()) {
			System.out.println(vendas.get(indice).toString());
			Venda v = new Venda();
			v.setProduto(scan.next());
			v.setQuantidade(scan.nextInt());
			v.setPreco(scan.nextFloat());
			vendas.set(indice, v);
			System.out.println("Venda alterada!");
		} else {
			System.out.println("Item Invalido!");
		}
	}

	public static void delete(int indice) {
		if (indice >= 0 && indice <= vendas.size()) {
			vendas.remove(indice);
			System.out.println("Venda excluida!");
		} else {
			System.out.println("Item invalido! ");
		}
	}
}