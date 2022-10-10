package padrao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String nome;
		int idade;
		float peso;

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nome = scan.next();
		System.out.println("Digite sua idade: ");
		idade = scan.nextInt();
		System.out.println("Digite seu peso: ");
		peso = scan.nextFloat();
		
		System.out.println("Nome: "+nome+" idade: "+idade+" peso: "+peso);

	}
}
