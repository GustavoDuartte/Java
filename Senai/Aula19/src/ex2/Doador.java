package ex2;

import javax.swing.JOptionPane;

public class Doador {

	String nome;
	int idade;
	char sexo;
	float peso;
	String cpf;

	String obterDiagnostico() {
		if (peso >= 50) {
			if (idade >= 18 && idade <= 69) {
				return "Apto a doar";
			} else {
				return "Inapto a doar";
			}
		} else {
			return "Inapto a doar";
		}
	}

	public Doador(String nome, String idade, String sexo, String peso, String cpf) {
		this.nome = nome;
		this.sexo = sexo.charAt(0);
		this.cpf = cpf;
		try {
			this.idade = Integer.parseInt(idade);
			this.peso = Float.parseFloat(peso);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}

	public String toCSV() {
		return String.format("%s;%d;%s;%.1f;%s;%s\r\n", nome, idade, sexo, peso, cpf, obterDiagnostico());
	}

	@Override
	public String toString() {
		return "Doador [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", peso=" + peso + ", cpf=" + cpf + "]";
	}

}
