package eleicao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import inss.seguro;

public class Main {

	static Scanner scan = new Scanner(System.in);

	static int menug = 0, menup = 0;

	public static void main(String[] args) {

		Eleicao eleicoes = new Eleicao();

		while (menug != 1) {
			System.out.println("Digite o numero do candidato a governador: ");
			eleicoes.setNumerog(scan.nextInt());

			System.out.println(eleicoes.getGovernador());

			System.out.println("Deseja continuar?\n1-Sim\n2-Nao");
			menug = scan.nextInt();
		}

		while (menup != 1) {

			System.out.println("Digite o numero do candidato a presidente: ");
			eleicoes.setNumerop(scan.nextInt());

			System.out.println(eleicoes.getPresidente());

			System.out.println("Tem certeza?\n1-Sim\n2-Nao");
			menup = scan.nextInt();

		}

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("./src/eleicao/bd/eleicoes.csv",true));
			bw.write(eleicoes.toString());
			bw.close();
			System.out.println("Arquivo criado com sucesso!");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
