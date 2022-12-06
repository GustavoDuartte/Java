package ex1;

public class Pessoa {

	private String nome;
	private int idade;

	String faseDaVida() {

		if (idade < 10) {
			return "Crianca";
		} else if (idade < 22) {
			return "Jovem";
		} else if (idade < 60) {
			return "Adulto";
		} else {
			return "Idoso";
		}
	}

	public Pessoa(String nome, String idade) {
		this.nome = nome;
		try {
			this.idade = Integer.parseInt(idade);
		} catch (Exception e) {
			this.idade = 0;
		}
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", faseDaVida()=" + faseDaVida() + "]";
	}

	public String toCSV() {
		return String.format("%s;%d;%s\r\n", nome, idade, faseDaVida());
	}

}
