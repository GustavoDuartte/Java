package notas01;

public class Boletim {

	String aluno;
	double portugues;
	double matematica;
	double ciencias;

	public float media() {
		return (portugues + matematica + ciencias) / 3;

	}

}
