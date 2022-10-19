package padrao;

public class Operacao {

	String produto;
	int qtdcomprada, qtdvendida;
	float precocompra, precovenda;

	float investimento() {
		return precocompra * qtdcomprada;
	}

	float faturamento() {
		return precovenda * qtdvendida;
	}

	float lucrodinheiro() {
		return faturamento() - investimento();
	}

	float lucroporcentagem() {
		return lucrodinheiro() / faturamento() * 100;
	}

	String relacao() {
		if (lucrodinheiro() < 0) {
			return "PREJUIZO";
		} else {
			return "LUCRO";
		}
	}

	public Operacao(String produto, int qtdcomprada, int qtdvendida, float precocompra, float precovenda) {
		super();
		this.produto = produto;
		this.qtdcomprada = qtdcomprada;
		this.qtdvendida = qtdvendida;
		this.precocompra = precocompra;
		this.precovenda = precovenda;
	}

	public String toString() {
		return "Operacao {produto=" + produto + ", qtdcomprada=" + qtdcomprada + ", qtdvendida=" + qtdvendida
				+ ", precocompra=" + precocompra + ", precovenda=" + precovenda + ", investimento()=" + investimento()
				+ ", faturamento()=" + faturamento() + ", lucrodinheiro()=" + lucrodinheiro() + ", lucroporcentagem()="
				+ lucroporcentagem() + ", relacao()=" + relacao() + "}\n";
	}

}
