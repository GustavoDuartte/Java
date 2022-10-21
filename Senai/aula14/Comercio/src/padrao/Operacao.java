package padrao;

public class Operacao {

	String produto;
	int qtdComprada;
	int qtdVendida;
	float precoCompra;
	float precoVenda;
	
	
	public Operacao(String produto, int qtdComprada, int qtdVendida, float precoCompra, float precoVenda) {
		super();
		this.produto = produto;
		this.qtdComprada = qtdComprada;
		this.qtdVendida = qtdVendida;
		this.precoCompra = precoCompra;
		this.precoVenda = precoVenda;
	}

	public float investimento() {

		return precoCompra * qtdComprada;
	}

	public float faturamento() {

		return precoVenda * qtdVendida;
	}

	public float lucroDinheiro() {

		return this.faturamento() - this.investimento();
	}

	public float lucroPorcentagem() {

		return this.lucroDinheiro() / this.faturamento() * 100;
	}

	public String relacaoLucro() {

		if (this.lucroDinheiro() < 0) {
			return "PREJUIZO";
		} else {
			return "LUCRO";
		}
	}

	@Override
	public String toString() {
		return "Operacao [produto=" + produto + ", qtdComprada=" + qtdComprada + ", qtdVendida=" + qtdVendida
				+ ", precoCompra=" + precoCompra + ", precoVenda=" + precoVenda + ", investimento()=" + investimento()
				+ ", faturamento()=" + faturamento() + ", lucroDinheiro()=" + lucroDinheiro() + ", lucroPorcentagem()="
				+ lucroPorcentagem() + ", relacaoLucro()=" + relacaoLucro() + "]\n";
	}

}