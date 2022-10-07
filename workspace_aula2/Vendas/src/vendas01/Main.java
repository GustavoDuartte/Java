package vendas01;

public class Main {

	static Venda v1, v2, v3, v4;// instancias da classe venda

	public static void main(String[] args) {

		v1 = new Venda();
		v2 = new Venda();
		v3 = new Venda();
		v4 = new Venda();

		v1.produto = "Camiseta";
		v1.preco = 19.9f;
		v1.quantidade = 5;

		v2.produto = "Bermuda";
		v2.preco = 39.9f;
		v2.quantidade = 2;

		v3.produto = "Calca";
		v3.preco = 49.9f;
		v3.quantidade = 3;

		v4.produto = "Sapato";
		v4.preco = 59.9f;
		v4.quantidade = 1;

		System.out.println("[Produto][Preco][Qtd.][Subotal]");
		System.out.println("Venda1");
		System.out.printf("[%s][%.2f][%d][%.2f]\n", v1.produto, v1.preco, v1.quantidade, v1.subtotal());
		System.out.println("Venda2");
		System.out.printf("[%s][%.2f][%d][%.2f]\n", v2.produto, v2.preco, v2.quantidade, v2.subtotal());
		System.out.println("Venda3");
		System.out.printf("[%s][%.2f][%d][%.2f]\n", v3.produto, v3.preco, v3.quantidade, v3.subtotal());
		System.out.println("Venda4");
		System.out.printf("[%s][%.2f][%d][%.2f]\n", v4.produto, v4.preco, v4.quantidade, v4.subtotal());

		System.out.println("\nTotal: " + (v1.subtotal() + v2.subtotal() + v3.subtotal() + v4.subtotal()));

	}

}
