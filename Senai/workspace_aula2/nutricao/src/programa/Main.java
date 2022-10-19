package programa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite quantos pacientes deseja cadastrar: ");
		int qtd = scan.nextInt();

		Paciente[] n = new Paciente[qtd];

		float soma = 0, somap = 0, somaa = 0, aux;
		String auxn;

		for (int i = 0; i < qtd; i++) {
			System.out.println("Digite o nome, peso(kg), altura do paciente respectivamente: ");
			n[i] = new Paciente(scan.next(), scan.nextFloat(), scan.nextFloat());
		}

		for (int i = 0; i < qtd; i++) {

			soma += n[i].imc();
			somap += n[i].peso;
			somaa += n[i].altura;
		}

		for (int i = 0; i < qtd; i++) {
			System.out.println(n[i].toString());
		}
		for (int i = 0; i < qtd; i++) {
			for (int j = 0; j < (qtd - 1); j++) {
				if (n[i].peso < n[j].peso) {

					aux = n[i].peso;
					n[i].peso = n[j].peso;
					n[j].peso = aux;

					auxn = n[i].nome;
					n[i].nome = n[j].nome;
					n[j].nome = auxn;
				}
			}
		}
		System.out.println(
				"Media IMC= " + (soma / qtd) + "\nMedia Peso= " + (somap / qtd) + "\nMedia Altura= " + (somaa / qtd));
		System.out.println("Ha " + qtd + " pacientes neste diagnostico.");
		System.out.println("O Paciente mais magro é: " + n[0].nome);
		System.out.println("O Paciente mais obeso é: " + n[(qtd - 1)].nome);

		for (int i = 0; i < qtd; i++) {
			for (int j = 0; j < (qtd - 1); j++) {

				if (n[i].altura < n[j].altura) {

					aux = n[i].altura;
					n[i].altura = n[j].altura;
					n[j].altura = aux;

					auxn = n[i].nome;
					n[i].nome = n[j].nome;
					n[j].nome = auxn;

				}

			}

		}
		System.out.println("O Paciente mais baixo é: " + n[0].nome);
		System.out.println("O Paciente mais alto é: " + n[(qtd - 1)].nome);

	}

}
