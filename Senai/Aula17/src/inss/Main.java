package inss;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		seguro inss = new seguro();

		System.out.println("Digite o nome e o salario: ");
		inss.setNome(scan.next());
		inss.setSalario(scan.nextFloat());

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("./src/inss/bd/inss.csv", true));
			bw.write(inss.toString());
			bw.close();
			System.out.println("Arquivo criado com sucesso!");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
