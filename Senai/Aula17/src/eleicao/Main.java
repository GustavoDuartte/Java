package eleicao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import inss.seguro;

public class Main {

	static Scanner scan = new Scanner(System.in);

	static int menug = 0, menup = 0, contGt = 0, contGh = 0, contPj = 0, contPl = 0, contGb = 0, contGn = 0, contPb = 0,
			contPn = 0;

	public static void main(String[] args) throws IOException {

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
			BufferedWriter bw = new BufferedWriter(new FileWriter("./src/eleicao/bd/eleicoes.csv", true));
			bw.write(eleicoes.toString());
			bw.close();
			System.out.println("Arquivo criado com sucesso!");
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			BufferedReader br = new BufferedReader(new FileReader("./src/eleicao/bd/eleicoes.csv"));
			String s;

			System.out.println("Apuracao dos votos.");
			
			while ((s = br.readLine()) != null) {
				if (s.equalsIgnoreCase("CANDIDATO: TARCISIO GOMES DE FREITAS")) {
					contGt += contGt;
				}
				if (s.equalsIgnoreCase("CANDIDATO: FERNANDO HADDAD")) {
					contGh++;
				}
				if (s.equalsIgnoreCase("CANDIDATO: JAIR MESSIAS BOLSONARO")) {
					contPj++;
				}
				if (s.equalsIgnoreCase("CANDIDATO: LUIZ INACIO DA SILVA")) {
					contPl++;
				}
				if (s.equalsIgnoreCase("VOTO NULO PARA GOVERNADOR")) {
					contGn++;
				}
				if (s.equalsIgnoreCase("VOTO BRANCO PARA GOVERNADOR")) {
					contGb++;
				}
				if (s.equalsIgnoreCase("VOTO BRANCO PARA PRESIDENTE")) {
					contPb++;
				}
				if (s.equalsIgnoreCase("VOTO NULO PARA PRESIDENTE")) {
					contPn++;
				}
			}
			System.out.println("JAIR MESSIAS BOLSONARO: "+contPj);
			System.out.println("LUIZ INACIO DA SILVA: "+contPl);
			System.out.println("TARCISIO GOMES DE FREITAS: "+contGt);
			System.out.println("FERNANDO HADDAD: "+contGh);
			System.out.println("VOTOS BRANCOS PARA PRESIDENTE: "+contPb);
			System.out.println("VOTOS NULOS PARA PRESIDENTE: "+contPn);
			System.out.println("VOTOS BRANCOS PARA GOVERNADOR: "+contGb);
			System.out.println("VOTOS NULOS PARA GOVERNADOR: "+contGn);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
