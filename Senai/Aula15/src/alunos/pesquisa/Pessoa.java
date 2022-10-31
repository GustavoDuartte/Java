package alunos.pesquisa;

public class Pessoa {

	String nome, sobrenome;
	int idade;

	public Pessoa(String nome, String sobrenome, int idade) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
	}

	String fasedavida() {
		if (idade > 0 && idade < 12) {
			return "Crianca";
		}
		if (idade >= 12 && idade < 21) {
			return "Jovem";
		}
		if (idade >= 21 && idade < 60) {
			return "Adulto";
		} else {
			return "Idoso";
		}
	}

}
