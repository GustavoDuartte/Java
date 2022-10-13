package programa;

public class Paciente {

	String nome;
	float peso;
	float altura;

	float imc() {
		return peso / (altura * altura);
	}

	public Paciente(String nome, float peso, float altura) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
	}

	String diagnostico() {
		if (imc() < 16) {
			return "Subpeso Severo";
		}
		if (imc() >= 16 && imc() <= 19.9) {
			return "Subpeso";
		}
		if (imc() >= 20 && imc() <= 24.9) {
			return "Normal";
		}
		if (imc() >= 25 && imc() <= 29.9) {
			return "Sobrepeso";
		}
		if (imc() >= 30 && imc() <= 39.9) {
			return "Obeso";
		} else {
			return "Obeso Mórbido";
		}
	}

	@Override
	public String toString() {
		return "Paciente [nome=" + nome + ", peso=" + peso + ", altura=" + altura + ", imc=" + imc() + ", diagnostico="
				+ diagnostico() + "]";
	}

}
