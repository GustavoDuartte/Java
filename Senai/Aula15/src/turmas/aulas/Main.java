package turmas.aulas;

import java.util.ArrayList;
import java.util.Scanner;

import alunos.pesquisa.Pessoa;

public class Main {

	public static void main(String[] args) {

		int qtd;
		float total = 0;

		ArrayList<Turma> turmas = new ArrayList<Turma>();

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a quantidade de turmas para o cadastro: ");
		qtd = scan.nextInt();

		System.out.println(
				"Digite o nome da turma, o periodo, o dia da semana, o numero de alunos, as horas semanais, e a mensalidade: ");
		for (int i = 0; i < qtd; i++) {
			turmas.add(
					new Turma(scan.next(), scan.next(), scan.next(), scan.nextInt(), scan.nextInt(), scan.nextFloat()));
		}

		for (int i = 0; i < turmas.size(); i++) {
			total += turmas.get(i).faturamentoMensal();
		}

		System.out.println(
				"NomeTurma\t\tPeriodo\t\tDiaDaSemana\tNum.Alunos\tHorasSemanais\tMensalidade\tFaturamentoMensal\tFaturamentoHora");
		for (int i = 0; i < turmas.size(); i++) {
			System.out.printf("%s\t\t%s\t\t%s\t\t%d\t\t%d\t\t%.2f\t\t%.2f\t\t\t%.2f\n", turmas.get(i).nomeTurma,
					turmas.get(i).periodo, turmas.get(i).diaSemana, turmas.get(i).numAlunos,
					turmas.get(i).horasSemanais, turmas.get(i).mensalidade, turmas.get(i).faturamentoMensal(),
					turmas.get(i).faturamentoPorHora());
		}

		System.out.printf("\nO faturamento total e: %.2f", total);
	}

}
