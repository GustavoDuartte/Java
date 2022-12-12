package ex2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	static BufferedReader br;
	JPanel painel;
	JLabel rotuloNome, rotuloIdade, rotuloPeso, rotuloSexo, rotuloResultado, rotuloCPF;
	JTextField campoNome, campoPeso, campoIdade, campoCPF;
	JTextArea areaResultado;
	JComboBox<String> cbSexo;
	JButton botao, limpar, salvar;
	JScrollPane barraRolagem;
	String saida = "";
	String saidaArquivo = "";
	String saidavf = "";
	int i;
	DoadorDAO dd = new DoadorDAO();

	Main() throws IOException {
		setTitle("Avaliação de Saúde ");
		setBounds(300, 300, 560, 460);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		painel = new JPanel();
		setContentPane(painel);
		setLayout(null);

		rotuloNome = new JLabel("Nome: ");
		rotuloNome.setBounds(20, 20, 200, 30);
		painel.add(rotuloNome);

		campoNome = new JTextField();
		campoNome.setBounds(100, 20, 400, 30);
		painel.add(campoNome);

		rotuloIdade = new JLabel("Idade: ");
		rotuloIdade.setBounds(20, 60, 200, 30);
		painel.add(rotuloIdade);

		campoIdade = new JTextField();
		campoIdade.setBounds(100, 60, 400, 30);
		painel.add(campoIdade);

		rotuloSexo = new JLabel("Sexo: ");
		rotuloSexo.setBounds(20, 100, 200, 30);
		painel.add(rotuloSexo);

		cbSexo = new JComboBox(new String[] { "M", "F" });
		cbSexo.setBounds(100, 100, 100, 30);
		painel.add(cbSexo);

		rotuloPeso = new JLabel("Peso(kg): ");
		rotuloPeso.setBounds(345, 100, 200, 30);
		painel.add(rotuloPeso);

		campoPeso = new JTextField();
		campoPeso.setBounds(400, 100, 100, 30);
		painel.add(campoPeso);

		rotuloCPF = new JLabel("CPF: ");
		rotuloCPF.setBounds(210, 100, 200, 30);
		painel.add(rotuloCPF);

		campoCPF = new JTextField();
		campoCPF.setBounds(238, 100, 100, 30);
		painel.add(campoCPF);

		rotuloResultado = new JLabel("Resultado: ");
		rotuloResultado.setBounds(60, 150, 200, 30);
		painel.add(rotuloResultado);

		areaResultado = new JTextArea();
		areaResultado.setBounds(40, 180, 460, 200);
		painel.add(areaResultado);

		botao = new JButton("Calcular");
		botao.setBounds(130, 140, 120, 30);
		painel.add(botao);
		botao.addActionListener(this);

		limpar = new JButton("Limpar");
		limpar.setBounds(255, 140, 120, 30);
		painel.add(limpar);
		limpar.addActionListener(this);

		salvar = new JButton("Salvar");
		salvar.setBounds(380, 140, 120, 30);
		painel.add(salvar);
		salvar.addActionListener(this);

		painel.setBackground(Color.lightGray);

	}

	public static void main(String[] args) throws IOException {

		new Main().setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == botao) {
			if (campoNome.getText().length() > 0 && campoIdade.getText().length() > 0
					&& campoPeso.getText().length() > 0) {
				Doador d = new Doador(campoNome.getText(), campoIdade.getText(), cbSexo.getSelectedItem().toString(),
						campoPeso.getText(), campoCPF.getText());
				saidaArquivo = d.toCSV();
				saida += d + "\n";
				areaResultado.setText(saida);
			} else {
				JOptionPane.showMessageDialog(this, "Favor preencher todos os campos");
			}

			Doador d = new Doador(campoNome.getText(), campoIdade.getText(), cbSexo.getSelectedItem().toString(),
					campoPeso.getText(), campoCPF.getText());

			areaResultado.setText(d.toString());

			dd.salvar(saidaArquivo);

		}
		if (e.getSource() == limpar) {
			campoNome.setText("");
			campoIdade.setText("");
			campoPeso.setText("");
			campoCPF.setText("");
			areaResultado.setText("");
		}

	}

}
