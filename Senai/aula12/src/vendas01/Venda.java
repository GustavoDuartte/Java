package vendas01;

public class Venda {

	String produto;
	float preco;
	int quantidade;

	public float subtotal() {
		return (preco * quantidade);
	}

}
