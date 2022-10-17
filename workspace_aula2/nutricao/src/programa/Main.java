package programa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite quantos pacientes deseja cadastrar: ");
		int qtd = scan.nextInt();

		Paciente[] n = new Paciente[qtd];

		float soma = 0, somap = 0, somaa = 0, menora, menorp, maiorp, maiora;

		for (int i = 0; i < qtd; i++) {
			System.out.println("Digite o nome, peso(kg), altura do paciente respectivamente: ");
			n[i] = new Paciente(scan.next(), scan.nextFloat(), scan.nextFloat());
		}

		for (int i = 0; i < qtd; i++) {
			soma += n[i].imc();
			somap += n[i].peso;
			somaa += n[i].altura;
			if (n[i].altura < n[i + 1].altura) {
				menora = n[i].altura;
			} else if (n[i].altura > n[i + 1].altura) {
				maiora = n[i].altura;
			} else if (n[i].peso < n[i + 1].peso) {
				menorp = n[i].peso;
			} else if (n[i].peso > n[i + 1].peso) {
				maiorp = n[i].peso;
			}
		}

		for (int i = 0; i < qtd; i++) {
			System.out.println(n[i].toString());
		}
		System.out.println(
				"Media IMC= " + (soma / qtd) + "\nMedia Peso= " + (somap / qtd) + "\nMedia Altura= " + (somaa / qtd));
		System.out.println("Ha " + qtd + " pacientes neste diagnostico.");
		System.out.println("A menor altura é= ");

	}

}
