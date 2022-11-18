package eleicao;

public class Eleicao {

	private int numerop;
	private int numerog;

	public void setNumerop(int numerop) {
		this.numerop = numerop;
	}

	public void setNumerog(int numerog) {
		this.numerog = numerog;
	}

	public String getGovernador() {
		return governador();
	}

	public String getPresidente() {
		return presidente();
	}

	public String governador() {
		if (numerog == 10) {
			return "CANDIDATO; TARCISIO GOMES DE FREITAS";
		} else if (numerog == 13) {
			return "CANDIDATO; FERNANDO HADDAD";
		} else if (numerog == 0 || numerog == 00) {
			return "CANDIDATO; VOTO BRANCO PARA GOVERNADOR";
		} else {
			return "CANDIDATO; VOTO NULO PARA GOVERNADOR";
		}
	}

	public String presidente() {
		if (numerop == 13) {
			return "CANDIDATO; LUIZ INACIO DA SILVA";
		} else if (numerop == 22) {
			return "CANDIDATO; JAIR MESSIAS BOLSONARO";
		} else if (numerop == 0 || numerop == 00) {
			return "CANDIDATO; VOTO BRANCO PARA PRESIDENTE";
		} else {
			return "CANDIDATO; VOTO NULO PARA PRESIDENTE";
		}
	}

	public String toString() {
		return String.format("%s;%d\r\n%s;%d\r\n", governador(), numerog, presidente(), numerop);
	}

}
