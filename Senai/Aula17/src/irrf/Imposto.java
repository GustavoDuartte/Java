package irrf;

public class Imposto {

	private String nome;
	private float salario;

	public double irrf() {
		if (salario <= 1903) {
			return 0;
		} else if (salario > 1903 && salario <= 2826) {
			return salario * 7.5 / 100;
		} else if (salario > 2826 && salario <= 3751) {
			return salario * 15 / 100;
		} else if (salario > 3751 && salario <= 4664) {
			return salario * 22.5 / 100;
		} else {
			return salario * 27.5 / 100;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String toString() {
		return String.format("%s;%.2f;%.2f\r\n", nome, salario, irrf());
	}

}
