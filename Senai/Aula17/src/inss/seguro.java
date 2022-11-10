package inss;

public class seguro {

	private String nome;
	private float salario;

	public double inss() {
		if (salario <= 1212) {
			return salario * 7.5 / 100;
		} else if (salario > 1212 && salario <= 2427) {
			return salario * 9 / 100;
		} else if (salario > 2427 && salario <= 3614) {
			return salario * 12 / 100;
		} else if (salario > 3614 && salario <= 7087) {
			return salario * 14 / 100;
		} else {
			return salario * 14 / 100;
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
		return String.format("%s;%.2f;%.2f\r\n", nome, salario, inss());
	}

}
