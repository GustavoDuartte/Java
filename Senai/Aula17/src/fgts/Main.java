package fgts;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		FundoGarantia fundo = new FundoGarantia();

		System.out.println("Digite o nome e o salario: ");
		fundo.setNome(scan.next());
		fundo.setSalario(scan.nextFloat());

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("./src/fgts/bd/fgts.csv", true));
			bw.write(fundo.toString());
			bw.close();
			System.out.println("Arquivo criado com sucesso!");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
