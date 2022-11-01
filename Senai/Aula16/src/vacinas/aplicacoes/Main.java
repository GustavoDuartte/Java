package vacinas.aplicacoes;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

	static ArrayList<Vacina> vacinas = new ArrayList<Vacina>();

	static Scanner scan = new Scanner(System.in);

	static int menu = 0, qtd, anoAtual, mesAtual, diaAtual;

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		anoAtual = c.get(Calendar.YEAR);
		mesAtual = c.get(Calendar.MONTH);
		diaAtual = c.get(Calendar.DAY_OF_MONTH);

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
//				System.out.printf("%d/%d/%d",diaAtual,mesAtual,anoAtual);
				System.out.println("Digite quantas vezes deseja realizar o cadastro: ");
				qtd = scan.nextInt();
				System.out.println(
						"Digite o nome do pet, do veterinario, da vacina, e a data separada por espaco, respectivamente: ");
				for (int i = 0; i < qtd; i++) {
					create();
				}
				break;
			case 2:
				System.out.println("NomePet\t\t\tVeterinario\t\tNomeVacina\t\tData");
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
				searchpet(scan.next());
				System.out.println("NomePet\t\t\tVeterinario\t\tNomeVacina\t\tData");
				break;
			case 6:
				System.out.println("Digite o nome do veterinario que voce quer encontrar: ");
				System.out.println("NomePet\t\t\tVeterinario\t\tNomeVacina\t\tData");
				searchvet(scan.next());
				break;
			case 7:
				System.out.println("Digite o nome da vacina que voce quer encontrar: ");
				searchvac(scan.next());
				System.out.println("NomePet\t\t\tVeterinario\t\tNomeVacina\t\tData");
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
		v.setDia(scan.nextInt());
		v.setMes(scan.nextInt());
		v.setAno(scan.nextInt());
		vacinas.add(v);
	}

	public static void read() {
		for (Vacina v : vacinas) {
			System.out.printf(v.toString());
			if (anoAtual > v.getAno()) {
				System.out.println("Vacinado a " + (anoAtual - v.getAno()) + " anos");
			} else if (anoAtual == v.getAno()) {
				if (mesAtual > v.getMes()) {
					System.out.println("Vacinado a " + (mesAtual - v.getMes() + 1) + " meses");
				} else if (mesAtual + 1 == v.getMes()) {
					if (diaAtual > v.getDia()) {
						System.out.println("Vacinado a " + (diaAtual - v.getDia()) + " dias");
					} else if (diaAtual == v.getDia()) {
						System.out.println("Vacinado hoje!");
					}
				}
			}
		}
	}

	public static void update(int indice) {
		if (indice >= 0 && indice < vacinas.size()) {
			System.out.println(vacinas.get(indice).toString());
			Vacina v = new Vacina();
			v.setNomePet(scan.next());
			v.setVeterinario(scan.next());
			v.setNomeVacina(scan.next());
			v.setDia(scan.nextInt());
			v.setMes(scan.nextInt());
			v.setAno(scan.nextInt());
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

	public static void searchpet(String nomepet) {
		for (Vacina v : vacinas) {
			if (nomepet.equalsIgnoreCase(v.getNomePet())) {
				System.out.println(v.toString());
			}
		}
	}

	public static void searchvet(String nomevet) {
		for (Vacina v : vacinas) {
			if (nomevet.equalsIgnoreCase(v.getVeterinario())) {
				System.out.println(v.toString());
			}
		}
	}

	public static void searchvac(String nomevac) {
		for (Vacina v : vacinas) {
			if (nomevac.equalsIgnoreCase(v.getNomeVacina())) {
				System.out.println(v.toString());
			}
		}
	}

}