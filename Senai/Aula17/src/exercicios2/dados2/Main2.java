package exercicios2.dados2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main2 {

	static BufferedReader br;

	static float media, preco = 0, contlinhas;
	static int i = 0;

	public static void main(String[] args) {

		float total = 0;
		float caro = 0;
		float barato = 1000000;
		String nomeCaro = null, nomeBarato = null;

		try {
			br = new BufferedReader(new FileReader("./src/exercicios2/dados2/bd/dados2.csv"));
			String s = br.readLine();

			while (s != null) {
				String palavras[] = s.split(";");
				System.out.print(palavras[0] + "\t" + palavras[1] + "\t" + palavras[2] + "\n");
				s = br.readLine();
				if (i != 0) {
					preco = Float.parseFloat(palavras[2]);
					if (caro < preco) {
						caro = preco;
						nomeCaro = palavras[0] + "\t" + palavras[1] + "\t" + palavras[2] + "\n";
					}
					if (barato > preco) {

						barato = preco;
						nomeBarato = palavras[0] + "\t" + palavras[1] + "\t" + palavras[2] + "\n";
					}
					total += preco;
				}
				i++;
				contlinhas++;
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado, erro: " + e);
		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo, erro: " + e);
		}

		total = total / contlinhas;
		System.out.println("A media de precos dos carros é: " + total);
		System.out.println("O carro mais barato e: "+nomeBarato);
		System.out.println("O carro mais caro e: "+nomeCaro);

	}

}
