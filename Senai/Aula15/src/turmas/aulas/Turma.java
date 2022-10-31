package turmas.aulas;

public class Turma {

	String nomeTurma;
	String periodo;
	String diaSemana;
	int numAlunos;
	int horasSemanais;
	float mensalidade;

	public Turma(String nomeTurma, String periodo, String diaSemana, int numAlunos, int horasSemanais,
			float mensalidade) {
		super();
		this.nomeTurma = nomeTurma;
		this.periodo = periodo;
		this.diaSemana = diaSemana;
		this.numAlunos = numAlunos;
		this.horasSemanais = horasSemanais;
		this.mensalidade = mensalidade;
	}

	float faturamentoMensal() {
		return mensalidade * numAlunos;
	}

	double faturamentoPorHora() {
		return (faturamentoMensal() / (horasSemanais * 4));
	}

}
