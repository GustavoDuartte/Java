package exercicios2.dados2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main2 {

	static BufferedReader br;
	static BufferedWriter bw;

	static float media = 0f, preco = 0f, ano = 0f;
	static float barato = 1000000f, velho = 10000000f;
	static float caro = 0f, novo = 0f, total = 0f;
	static int i = 0;
	static String nomeCaro = null, nomeBarato = null, nomeVelho = null, nomeNovo = null;

	public static String toTxt() {
		return String.format("%.2f\t%s\t%s\t%s\t%s\r\n", media, nomeCaro, nomeBarato, nomeVelho, nomeNovo);			
	}
	
	public static void main(String[] args) {
		

		try {
			br = new BufferedReader(new FileReader("./src/exercicios2/dados2/bd/dados2.csv"));
			String s = br.readLine();

			while (s != null) {
				String palavras[] = s.split(";");
				System.out.print(palavras[0] + "\t" + palavras[1] + "\t" + palavras[2] + "\n");
				
				if (i != 0) {
					preco = Float.parseFloat(palavras[2]);
					ano = Float.parseFloat(palavras[1]);
					if (caro < preco) {
						caro = preco;
						nomeCaro = s;
					}
					if (barato > preco) {

						barato = preco;
						nomeBarato = s;
					}
					if (velho > ano) {
						velho = ano;
						nomeVelho = s;
					}
					if (novo < ano) {
						novo = ano;
						nomeNovo = s;
					}
					total += preco;
				}
				i++;
				s = br.readLine();
			}
			br.close();
			
			media = total / i;
			
			bw = new BufferedWriter(new FileWriter("./src/exercicios2/dados2/bd/relatorio.txt",true));
			bw.write(toTxt());
			bw.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado, erro: " + e);
		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo, erro: " + e);
		}

		
		System.out.println("A media de precos dos carros e: " + media);
		System.out.println("O carro mais barato e: " + nomeBarato);
		System.out.println("O carro mais caro e: " + nomeCaro);
		System.out.println("O carro mais velho e : " + nomeVelho);
		System.out.println("O carro mais novo e : " + nomeNovo);

	}

}
