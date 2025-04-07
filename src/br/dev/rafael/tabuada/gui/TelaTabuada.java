package br.dev.rafael.tabuada.gui;

import java.awt.Dimension;

import java.awt.TextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class TelaTabuada {
	
	private JLabel labelMultiplicando;
	private JTextField txtMultiplicando;
	private JLabel labelMinMultiplicador;
	private JTextField txtMinMultiplicador;
	private JLabel labelMaxMultiplicador;
	private JTextField txtMaxMultiplicador;
	private JButton btnCalcular;
	private JButton btnLimpar;
	private JLabel labelResultado;
	private JScrollPane scrollTabuada;
	private JList listaTabuada;
	
	public void criarTela() {
		
		
		JFrame tela = new JFrame();
		
		//Definir o tamanho da tela
		// através de um objeto Dimension
		Dimension tamanho = new Dimension();
		tamanho.setSize(335, 700);
		
		tela.setSize(tamanho);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Tabuada");
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		tela.setResizable(false);
		
		
		// Criar um JLabel e um JTextField para o multiplicando
		labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Valor do multiplicando:");
		labelMultiplicando.setBounds(50, 40, 150, 30);
		
		// Criar um TextField 
		txtMultiplicando = new JTextField();
		txtMultiplicando.setBounds(210, 40, 60, 30);
		
		labelMaxMultiplicador = new JLabel();
		labelMaxMultiplicador.setText("Multiplicador maior");
		labelMaxMultiplicador.setBounds(50, 125, 150, 30);
		
		txtMaxMultiplicador = new JTextField();
		txtMaxMultiplicador.setBounds(210, 130, 70, 30);
		
		
		
		// Criar um JLabel e um JTextField para o multiplicando
		labelMinMultiplicador = new JLabel();
		labelMinMultiplicador.setText("Mínimo multiplicador");
		labelMinMultiplicador.setBounds(50, 80,150,30);
		
		txtMinMultiplicador = new JTextField();
		txtMinMultiplicador.setBounds(210,80,60,30);
		
		// Criar um JLabel e um JTextField para o máximo multiplicador
		labelMaxMultiplicador = new JLabel();
		labelMaxMultiplicador.setText("Máximo multiplicador");
		labelMaxMultiplicador.setBounds(50, 125, 150, 30);
		
		
		//Criando os botões na tela
		btnCalcular = new JButton();
		btnCalcular.setText("Calcular");
		btnCalcular.setBounds(50, 180, 105, 30);
		
		btnLimpar = new JButton();
		btnLimpar.setText("Limpar");
		btnLimpar.setBounds(175, 180, 105, 30);
		
		// Label Resultado
		labelResultado = new JLabel();
		labelResultado.setText("Resultado");
		labelResultado.setBounds(50, 220, 200, 30);
		
		// Criando o painel de rolagem para a lista
		scrollTabuada = new JScrollPane();
		scrollTabuada.setBounds(50, 260, 230, 100);
		
		// Criando a lista que exibirá a tabuada
		listaTabuada = new JList();
		
		
		//Criando o painel de rolagem para a lista
		scrollTabuada = new JScrollPane(listaTabuada);
		scrollTabuada.setBounds(50, 240, 220, 380);
		
		
		
		// Adicionando os componentes ao painel de conteúdo
		tela.getContentPane().add(labelMultiplicando);
		tela.getContentPane().add(txtMultiplicando);
		tela.getContentPane().add(labelMinMultiplicador);
		tela.getContentPane().add(txtMinMultiplicador);
		tela.getContentPane().add(labelMaxMultiplicador);
		tela.getContentPane().add(txtMaxMultiplicador);
		tela.getContentPane().add(btnCalcular);
		tela.getContentPane().add(btnLimpar);
		tela.getContentPane().add(labelResultado);
		tela.getContentPane().add(scrollTabuada);
		
		
		// Tornar a tela visível deverá ser a última linha deste método
		tela.setVisible(true);
	}

}
