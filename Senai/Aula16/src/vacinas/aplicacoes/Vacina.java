package vacinas.aplicacoes;

import java.util.Calendar;
import java.util.Date;

public class Vacina {

	private String nomePet;
	private String veterinario;
	private String nomeVacina;
	private int dia, mes, ano;

	public int vacinadoAquantosDias() {
		return 0;
	}

	public String getNomePet() {
		return nomePet;
	}

	public void setNomePet(String nomePet) {
		this.nomePet = nomePet;
	}

	public String getVeterinario() {
		return veterinario;
	}

	public void setVeterinario(String veterinario) {
		this.veterinario = veterinario;
	}

	public String getNomeVacina() {
		return nomeVacina;
	}

	public void setNomeVacina(String nomeVacina) {
		this.nomeVacina = nomeVacina;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Vacina() {
	}

	@Override
	public String toString() {
		return String.format("%s   \t\t%s   \t\t%s   \t\t%d/%d/%d ", nomePet, veterinario, nomeVacina, dia, mes,
				ano);
	}

}
