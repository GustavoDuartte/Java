package ex2;

import java.io.BufferedWriter;
import java.io.FileWriter;

import javax.swing.JOptionPane;

public class DoadorDAO {

	BufferedWriter bw;
	String arquivo = "./src/ex2/bd/doadores.csv";

	public void salvar(String dados) {
		try {
			bw = new BufferedWriter(new FileWriter(arquivo,true));
			bw.write(dados);
			bw.close();
		} catch (Exception e) {
			JOptionPane.showConfirmDialog(null, "Erro ao salvar dados");
		}
	}

}
