package vacinas.aplicacoes;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<Vacina> vacinas = new ArrayList<Vacina>();

	static Scanner scan = new Scanner(System.in);

	static int menu = 0, qtd;

	public static void main(String[] args) {

		while (menu != 8) {
			System.out.println("1.Cadastrar Vacina");
			System.out.println("2.Listar Todas");
			System.out.println("3.Alterar Dados");
			System.out.println("4.Excluir Registro");
			System.out.println("5.Buscar por pet");
			System.out.println("6.Buscar por Veterinario");
			System.out.println("7.Buscar por Vacina");
			System.out.println("8.Sair");

			menu = scan.nextInt();

			switch (menu) {
			case 1:
				System.out.println("Digite quantas vezes deseja realizar o cadastro: ");
				qtd = scan.nextInt();
				System.out.println("Nome do Pet/Veterinario/Nome da Vacina");
				for (int i = 0; i < qtd; i++) {
					create();
				}
				break;
			case 2:
				System.out.println("NomePet \t\tVeterinario \t\tNomeVacina");
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
				System.out.println("Digite o nome do Pet que voce quer encontrar: ");
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				System.out.println("Tchau!");
				break;
			default:
				System.out.println("Opcao Invalida!");
				break;
			}
			System.out.println("------------------------------------");
		}

	}

	public static void create() {
		Vacina v = new Vacina();
		v.setNomePet(scan.next());
		v.setVeterinario(scan.next());
		v.setNomeVacina(scan.next());
		vacinas.add(v);
	}

	public static void read() {
		int i = 1;
		for (Vacina v : vacinas) {
			System.out.println(i + "-" + v.toString());
			i++;
		}
	}

	public static void update(int indice) {
		if (indice >= 0 && indice < vacinas.size()) {
			System.out.println(vacinas.get(indice).toString());
			Vacina v = new Vacina();
			v.setNomePet(scan.next());
			v.setVeterinario(scan.next());
			v.setNomeVacina(scan.next());
			vacinas.set(indice, v);
			System.out.println("Item alterado!");
		} else {
			System.out.println("Item Invalido!");
		}
	}

	public static void delete(int indice) {
		if (indice >= 0 && indice <= vacinas.size()) {
			vacinas.remove(indice);
			System.out.println("Item excluido!");
		} else {
			System.out.println("Item invalido! ");
		}
	}
}