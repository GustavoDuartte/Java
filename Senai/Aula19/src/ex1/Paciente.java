package ex1;

public class Paciente {

	private String nome;
	private float peso;
	private float altura;

	float obterIMC() {
		return (peso / (altura * altura)) * 10000;
	}

	String obterDiagnostico() {
		if (obterIMC() < 18.5) {
			return "MAGREZA";
		} else if (obterIMC() < 24.9) {
			return "NORMAL";
		} else if (obterIMC() < 29.9) {
			return "SOBREPESO";
		} else if (obterIMC() < 39.9) {
			return "OBESIDADE";
		} else {
			return "OBESIDADE GRAVE";
		}
	}

	public Paciente(String nome, String peso, String altura) {
		this.nome = nome;
		try {
			this.peso = Float.parseFloat(peso);
			this.altura = Float.parseFloat(altura);
		} catch (Exception e) {
			this.peso = 0;
			this.altura = 0;
		}
	}

	public String toString() {
		return "Paciente: {Nome: " + nome + " Peso: " + peso + " Altura: " + altura + "}\nIMC: " + obterIMC()
				+ " Diagnostico: " + obterDiagnostico();
	}

	public String toCSV() {
		return String.format("%s;%.2f;%s\r\n", nome, obterIMC(), obterDiagnostico());
	}

}
