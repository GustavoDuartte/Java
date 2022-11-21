package exercicios2.eleicao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	static BufferedReader br;
	static BufferedWriter bw;
	static int i = 0;
	static int contLula = 0, contBolsonaro = 0, contBranco = 0, contNulo = 0, contTotal = 0;
	static double porcentLula = 0, porcentBolsonaro = 0, porcentBranco = 0, porcentNulo = 0, porcentEleito = 0;
	static String eleito = null;

	public static void porcentVotos() {

		porcentLula = (contLula * 100 / contTotal);
		porcentBolsonaro = (contBolsonaro * 100 / contTotal);
		porcentBranco = (contBranco * 100 / contTotal);
		porcentNulo = (contNulo * 100 / contTotal);

		if (porcentLula > porcentBolsonaro) {
			eleito = "LULA";
			porcentEleito = porcentLula;

		} else {
			eleito = "BOLSONARO";
			porcentEleito = porcentBolsonaro;

		}
	}

	public static String toTxt() {
		return "LULA: " + contLula + " = " + porcentLula + "%\n" + "BOLSONARO: " + contBolsonaro + " = "
				+ porcentBolsonaro + "%\n" + "BRANCOS: " + contBranco + " = " + porcentBranco + "%\n" + "NULOS: "
				+ contNulo + " = " + porcentNulo + "%\n" + "O candidato " + eleito + " foi eleito em segundo turno com "
				+ porcentEleito + "% dos votos";
	}

	public static void main(String[] args) {

		try {
			br = new BufferedReader(new FileReader("./src/exercicios2/eleicao/bd/eleicao.csv"));
			String s = br.readLine();

			while (s != null) {
				String v[] = s.split(";");

				if (i != 0) {
					if (v[1].equals("Lula")) {
						contLula++;
					}
					if (v[1].equals("Bolsonaro")) {
						contBolsonaro++;
					}
					if (v[1].equals("Branco")) {
						contBranco++;
					}
					if (v[1].equals("Nulo")) {
						contNulo++;
					}
					contTotal++;
				}
				i++;
				s = br.readLine();

			}
			porcentVotos();
			br.close();

			bw = new BufferedWriter(new FileWriter("./src/exercicios2/eleicao/bd/apuracao.txt"));
			bw.write(toTxt());
			bw.close();

		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado, erro: " + e);

		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo, erro: " + e);

		}

		System.out.println("Votos para o LULA: " + contLula + " = " + porcentLula + "%");
		System.out.println("Votos para o BOLSONARO: " + contBolsonaro + " = " + porcentBolsonaro + "%");
		System.out.println("Votos BRANCOS: " + contBranco + " = " + porcentBranco + "%");
		System.out.println("Votos NULOS: " + contNulo + " = " + porcentNulo + "%");
		System.out
				.println("O candidato " + eleito + " foi eleito em segundo turno com " + porcentEleito + "% dos votos");

	}

}
