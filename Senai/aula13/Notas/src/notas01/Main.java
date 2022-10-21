package notas01;

public class Main {

	public static void main(String[] args) {

		Boletim n[] = new Boletim[4];

		n[0] = new Boletim("Jair", 1f, 1f, 5f);
		n[1] = new Boletim("Jose", 8f, 7f, 3f);
		n[2] = new Boletim("Jesus", 6f, 5.5f, 7f);
		n[3] = new Boletim("Joel", 8.8f, 10f, 10f);

		System.out.println("Aluno\tPort.\tMat.\tCien.");
		for (int i = 0; i < 4; i++) {
			System.out.println(n[i].toString());
		}

	}

}
