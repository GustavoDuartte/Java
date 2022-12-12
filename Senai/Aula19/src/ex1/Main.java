package ex1;

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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	static BufferedReader br;
	JPanel painel;
	JLabel rotuloNome, rotuloPeso, rotuloAltura, rotuloResultado;
	JTextField campoNome, campoPeso, campoAltura;
	JTextArea areaResultado;
	JButton botao, limpar;
	JTable tabela;
	JScrollPane barraRolagem;
	int i = 0;

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

		rotuloPeso = new JLabel("Peso(kg): ");
		rotuloPeso.setBounds(20, 60, 200, 30);
		painel.add(rotuloPeso);

		campoPeso = new JTextField();
		campoPeso.setBounds(100, 60, 400, 30);
		painel.add(campoPeso);

		rotuloAltura = new JLabel("Altura(m): ");
		rotuloAltura.setBounds(20, 100, 200, 30);
		painel.add(rotuloAltura);

		campoAltura = new JTextField();
		campoAltura.setBounds(100, 100, 400, 30);
		painel.add(campoAltura);

		rotuloResultado = new JLabel("Resultado: ");
		rotuloResultado.setBounds(60, 150, 200, 30);
		painel.add(rotuloResultado);

		areaResultado = new JTextArea();
		areaResultado.setBounds(40, 180, 460, 200);
		painel.add(areaResultado);

		botao = new JButton("Calcular");
		botao.setBounds(250, 140, 120, 30);
		painel.add(botao);
		botao.addActionListener(this);

		limpar = new JButton("Limpar");
		limpar.setBounds(380, 140, 120, 30);
		painel.add(limpar);
		limpar.addActionListener(this);

		painel.setBackground(Color.lightGray);

//		try {
//			br = new BufferedReader(new FileReader("./src/ex1/bd/pacientes.csv"));
//			String dados = br.readLine();
//			while (dados != null) {
//				String [] colunas = {"Nome", "IMC", "Diagnostico"};
//				String v[] = dados.split(";");
//				dados = br.readLine();
//				JTable tabela = new JTable(dados, colunas);
//			}
//			br.close();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		
		

	}

	public static void main(String[] args) throws IOException  {

		new Main().setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == botao) {
			Paciente p = new Paciente(campoNome.getText(), campoPeso.getText(), campoAltura.getText());
			areaResultado.setText(p.toString());

			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter("./src/ex1/bd/pacientes.csv", true));
				bw.write(p.toCSV());
				bw.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}

		}
		if (e.getSource() == limpar) {
			campoNome.setText("");
			campoPeso.setText("");
			campoAltura.setText("");
			areaResultado.setText("");
		}

	}

}
