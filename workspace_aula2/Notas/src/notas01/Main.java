package notas01;

public class Main {

	public static void main(String[] args) {

		Boletim n[] = new Boletim[4];

		n[0] = new Boletim();
		n[1] = new Boletim();
		n[2] = new Boletim();
		n[3] = new Boletim();

		n[0].aluno = "Jair";
		n[0].portugues = 10;
		n[0].matematica = 5;
		n[0].ciencias = 10;

		n[1].aluno = "Jose";
		n[1].portugues = 8;
		n[1].matematica = 7;
		n[1].ciencias = 3;

		n[2].aluno = "Humberto";
		n[2].portugues = 6;
		n[2].matematica = (double) 5.5;
		n[2].ciencias = 7;

		n[3].aluno = "Zerobelo";
		n[3].portugues = (double) 8.8;
		n[3].matematica = 10;
		n[3].ciencias = 10;

	}

}
