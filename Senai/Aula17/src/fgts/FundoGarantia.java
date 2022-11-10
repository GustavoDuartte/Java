package fgts;

public class FundoGarantia {

	private String nome;
	private float salario;

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

	public float fgts() {
		return salario * 8 / 100;
	}

	@Override
	public String toString() {
		return String.format("%s;%.2f;%.2f\r\n", nome, salario, fgts());
	}

}
