package rh.funcionarios;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

	static Scanner scan = new Scanner(System.in);

	static int menu = 0;

	static String opcoes[] = { "1.Cadastrar", "2.Listar todos", "3.Alterar", "4.excluir", "5.Buscar por nome",
			"6.Buscar por matricula", "7.Buscar por nascimento", "8.Sair" };

	public static void itens(String[] itens) {
		for (String i : itens)
			System.out.println(i);
	}

	public static void main(String[] args) throws ParseException {
		while (menu != 8) {
			itens(opcoes);
			menu = scan.nextInt();

			switch (menu) {
			case 1:
				create();
				break;
			case 2:
				read();
				break;
			case 3:
				update();
				break;
			case 4:
				delete();
				break;
			case 5:
				searchNome();
				break;
			case 6:
				searchMatricula();
				break;
			case 7:
				searchData();
				break;
			case 8:
				System.out.println("Tchal!");
				break;
			default:
				System.out.println("Opcao invalida!");
				break;
			}
		}
	}

	public static void create() throws ParseException {
		System.out.println("Digite quantos cadastros deseja realizar: ");
		int qtd = scan.nextInt();
		System.out.println("Matricula\tNome\tData de nascimento");
		for (int i = 0; i < qtd; i++) {
			funcionarios.add(new Funcionario(scan.nextInt(), scan.next(), scan.next()));
		}
	}

	public static void read() {
		System.out.println("Indice\tMatricula\tNome\tData de nascimento");
		for (int i = 0; i < funcionarios.size(); i++) {
			System.out.println(i + "\t" + funcionarios.get(i));
		}
	}

	public static void update() throws ParseException {
		System.out.println("Digite o indice da matricula: ");
		int indice = scan.nextInt();
		System.out.println("Indice\tMatricula\tNome\tData de nascimento");
		System.out.println(indice + "\t" + funcionarios.get(indice));
		funcionarios.set(indice, new Funcionario(scan.nextInt(), scan.next(), scan.next()));
		System.out.println("Registro alterado");
	}

	public static void delete() {
		System.out.println("Digite o indice da matricula: ");
		int indice = scan.nextInt();
		funcionarios.remove(indice);
		System.out.println("Registro excluido");
	}

	public static void searchNome() {
		System.out.println("Digite o nome: ");
		String nome = scan.next();
		System.out.println("Indice\tMatricula\tNome\tData de nascimento");
		for (int i = 0; i < funcionarios.size(); i++) {
			if (funcionarios.get(i).getNome().contains(nome)) {
				System.out.println(i + "\t" + funcionarios.get(i));
			}

		}
	}

	public static void searchMatricula() {
		System.out.println("Digite o numero da matricula: ");
		int matricula = scan.nextInt();
		System.out.println("Indice\tMatricula\tNome\tData de nascimento");
		for (int i = 0; i < funcionarios.size(); i++) {
			if (matricula == (funcionarios.get(i).getMatricula())) {
				System.out.println(i + "\t" + funcionarios.get(i));
			}

		}
	}

	public static void searchData() {
		System.out.println("Digite a data de nascimento: ");
		String data = scan.next();
		System.out.println("Indice\tMatricula\tNome\tData de nascimento");
		for (int i = 0; i < funcionarios.size(); i++) {
			if ( funcionarios.get(i).getNascimento().equals(data)) {
				System.out.println(i + "\t" + funcionarios.get(i));
			}
		}
	}

}
