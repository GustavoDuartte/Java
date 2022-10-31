package vacinas.aplicacoes;

import java.util.Date;

public class Vacina {

	private String nomePet;
	private String veterinario;
	private String nomeVacina;
	private Date data;

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

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Vacina() {
	}

	@Override
	public String toString() {
		return String.format("%s\t\t%s\t\t%s", nomePet, veterinario, nomeVacina);
	}

}
