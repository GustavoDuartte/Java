package exercicios2.dados1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	static BufferedReader br;

	static int contlinha;

	public static void main(String[] args) {

		try {
			br = new BufferedReader(new FileReader("./src/exercicios2/dados1/bd/dados1.txt"));
			String s = br.readLine();

			while (s != null) {
				String palavras[] = s.split(" ");
				System.out.print(s);
				System.out.print("\tA linha possui " + s.length() + " letras");
				System.out.println("\t" + palavras.length + " palavras\n");
				s = br.readLine();
				contlinha++;
			}
			System.out.println("\nHa " + contlinha + " linhas");
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado, erro: " + e);
		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo, erro: " + e);
		}

	}

}
