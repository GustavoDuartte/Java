package ex1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FormularioEstrutural extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	JPanel painel;
	JLabel rotuloNome, rotuloIdade, rotuloResultado;
	JTextField campoNome, campoIdade;
	JTextArea areaResultado;
	JButton botao, limpar;

	// Construtor dos eventos na tela
	FormularioEstrutural() {
		setTitle("Entrada processamento e Saida ");
		setBounds(300, 300, 800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		painel = new JPanel();
		setContentPane(painel);
		setLayout(null);

		rotuloNome = new JLabel("Nome: ");
		rotuloNome.setBounds(20, 20, 200, 30);
		painel.add(rotuloNome);

		campoNome = new JTextField();
		campoNome.setBounds(200, 20, 400, 30);
		painel.add(campoNome);

		rotuloIdade = new JLabel("Idade: ");
		rotuloIdade.setBounds(20, 60, 200, 30);
		painel.add(rotuloIdade);

		campoIdade = new JTextField();
		campoIdade.setBounds(200, 60, 400, 30);
		painel.add(campoIdade);

		rotuloResultado = new JLabel("Resultado: ");
		rotuloResultado.setBounds(20, 100, 200, 30);
		painel.add(rotuloResultado);

		areaResultado = new JTextArea();
		areaResultado.setBounds(200, 150, 400, 200);
		painel.add(areaResultado);

		botao = new JButton("Processar");
		botao.setBounds(200, 100, 200, 30);
		painel.add(botao);
		botao.addActionListener(this);

		limpar = new JButton("Limpar");
		limpar.setBounds(400, 100, 200, 30);
		painel.add(limpar);
		limpar.addActionListener(this);

		painel.setBackground(Color.lightGray);

	}

	// Execução eventos
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == botao) {
			Pessoa p = new Pessoa(campoNome.getText(), campoIdade.getText());
			areaResultado.setText(p.toString());
			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter("./src/ex1/bd/dados.csv",true));
				bw.write(p.toCSV());
				bw.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		if (e.getSource() == limpar) {
			campoNome.setText("");
			campoIdade.setText("");
			areaResultado.setText("");
		}
		
		
			
		
	}

	public static void main(String[] args) {

		System.out.println("Este programa esta funcionando");

		new FormularioEstrutural().setVisible(true);

	}
}
