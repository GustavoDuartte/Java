package irrf;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		Imposto irrf = new Imposto();

		System.out.println("Digite o nome e o salario: ");
		irrf.setNome(scan.next());
		irrf.setSalario(scan.nextFloat());

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("./src/irrf/bd/irrf.csv", true));
			bw.write(irrf.toString());
			bw.close();
			System.out.println("Arquivo criado com sucesso!");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
