package vendas02;

public class Main {

	public static void main(String[] args) {

		Venda v[] = new Venda[10];

		v[0] = new Venda();
		v[1] = new Venda();
		v[2] = new Venda();
		v[3] = new Venda();
		v[4] = new Venda();
		v[5] = new Venda();
		v[6] = new Venda();
		v[7] = new Venda();
		v[8] = new Venda();
		v[9] = new Venda();

		v[0].produto = "Camiseta";
		v[0].preco = 19.9f;
		v[0].quantidade = 1;

		v[1].produto = "Bermuda";
		v[1].preco = 39.9f;
		v[1].quantidade = 2;

		v[2].produto = "Calca";
		v[2].preco = 49.9f;
		v[2].quantidade = 3;

		v[3].produto = "Sapato";
		v[3].preco = 59.9f;
		v[3].quantidade = 4;

		v[4].produto = "Bone";
		v[4].preco = 9.9f;
		v[4].quantidade = 1;

		v[5].produto = "Top";
		v[5].preco = 69.9f;
		v[5].quantidade = 6;

		v[6].produto = "Blusa";
		v[6].preco = 109.9f;
		v[6].quantidade = 1;

		v[7].produto = "Cinto";
		v[7].preco = 9.9f;
		v[7].quantidade = 10;

		v[8].produto = "Moletom";
		v[8].preco = 99.9f;
		v[8].quantidade = 3;

		v[9].produto = "Meia";
		v[9].preco = 19.9f;
		v[9].quantidade = 5;

		float t = 0.0f;

		System.out.println("[Produto][Preco][Qtd.][Subotal]");
		for (int i = 0; i < 9; i++) {
			System.out.printf("%s %.2f\t%d\t%.2f\n", v[i].produto, v[i].preco, v[i].quantidade, v[i].subtotal());
			t += v[i].subtotal();
		}
		System.out.println("\nTotal: "+t);

	}

}
