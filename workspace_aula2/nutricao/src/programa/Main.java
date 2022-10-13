package programa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Paciente[] n = new Paciente[10];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < n.length; i++) {
			System.out.println("Digite o nome, peso(kg), altura do paciente respectivamente: ");
			n[i] = new Paciente(scan.next(), scan.nextFloat(), scan.nextFloat());
		}

		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i].toString());
		}

	}

}
