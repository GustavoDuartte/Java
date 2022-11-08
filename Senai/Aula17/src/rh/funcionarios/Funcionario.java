package rh.funcionarios;

import java.util.Calendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Funcionario {

	private int matricula;
	private String nome;
	private Calendar nascimento = Calendar.getInstance();

	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Funcionario(int matricula, String nome, String nascimento) throws ParseException {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.nascimento.setTime(sdf.parse(nascimento));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Calendar getNascimento() {
		return nascimento;
	}

	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}

	public String toString() {
		return String.format("%d\t%s\t%s", matricula, nome, sdf.format(nascimento.getTime()));
	}

}
