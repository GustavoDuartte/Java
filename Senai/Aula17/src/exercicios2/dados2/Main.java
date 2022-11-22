package exercicios2.dados2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	static BufferedReader br;

	static int contlinha, colunas;

	public static void main(String[] args) {

		try {
			br = new BufferedReader(new FileReader("./src/exercicios2/dados2/bd/dados2.csv"));
			String s = br.readLine();

			while (s != null) {
				String palavras[] = s.split(";");
				System.out.print(palavras[0] + "\t" + palavras[1] + "\t" + palavras[2] + "\n");
				s = br.readLine();
				colunas = palavras.length;
				contlinha++;
			}
			System.out.println("\nHa " + colunas + " colunas");
			System.out.println("\nHa " + contlinha + " linhas");
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado, erro: " + e);
		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo, erro: " + e);
		}

	}

}
