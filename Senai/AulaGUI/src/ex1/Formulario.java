package ex1;

import javax.swing.JOptionPane;

public class Formulario {

	public static void main(String[] args) {

		System.out.println("Oi!");
		// Entrada
		String texto = JOptionPane.showInputDialog("Digite seu nome completo: ");
		// Processo
		String nomes[] = texto.split(" ");
		texto = "Seu primeiro nome possui " + nomes[0].length() + " letras\n";
		texto += "Seu ultimo nome possui " + nomes[nomes.length - 1].length() + " letras\n";
		if(nomes.length > 2) {
			texto += "Seu nome do meio possui " +nomes[1].length()+ " letras\n";
		}else {
			texto += "Voce nao possui nome do meio";
		}
		// Saida
		JOptionPane.showMessageDialog(null, texto);

	}

}
