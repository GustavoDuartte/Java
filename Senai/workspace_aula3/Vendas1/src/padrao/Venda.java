package padrao;

public class Venda {

	String nome;
	float preco;
	float quantidade;

	public Venda(String nome, float preco, float quantidade) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	float subtotal() {
		return preco * quantidade;
	}

	
}
