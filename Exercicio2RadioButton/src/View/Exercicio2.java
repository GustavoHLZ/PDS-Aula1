package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Calculo;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Exercicio2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPrimeiro;
	private JTextField txtSegundo;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio2 frame = new Exercicio2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Exercicio2() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPrimeiroNum = new JLabel("Primeiro Numero Inteiro:");
		lblPrimeiroNum.setBounds(10, 21, 144, 14);
		contentPane.add(lblPrimeiroNum);
		
		JLabel lblSegundoNum = new JLabel("Segundo Numero Inteiro:");
		lblSegundoNum.setBounds(10, 56, 144, 14);
		contentPane.add(lblSegundoNum);
		
		txtPrimeiro = new JTextField();
		txtPrimeiro.setBounds(162, 11, 262, 27);
		contentPane.add(txtPrimeiro);
		txtPrimeiro.setColumns(10);
		
		txtSegundo = new JTextField();
		txtSegundo.setBounds(162, 49, 262, 27);
		contentPane.add(txtSegundo);
		txtSegundo.setColumns(10);
		
		JRadioButton rdbtnAdicao = new JRadioButton("+ Adição");
		buttonGroup.add(rdbtnAdicao);
		rdbtnAdicao.setBounds(10, 117, 109, 23);
		contentPane.add(rdbtnAdicao);
		
		JRadioButton rdbtnSubtracao = new JRadioButton("- Subtração");
		buttonGroup.add(rdbtnSubtracao);
		rdbtnSubtracao.setBounds(10, 143, 109, 23);
		contentPane.add(rdbtnSubtracao);
		
		JRadioButton rdbtnMultiplicacao = new JRadioButton("X Multiplicação");
		buttonGroup.add(rdbtnMultiplicacao);
		rdbtnMultiplicacao.setBounds(10, 169, 109, 23);
		contentPane.add(rdbtnMultiplicacao);
		
		JRadioButton rdbtnDivisao = new JRadioButton("/ Divisão");
		buttonGroup.add(rdbtnDivisao);
		rdbtnDivisao.setBounds(10, 195, 109, 23);
		contentPane.add(rdbtnDivisao);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setHorizontalAlignment(SwingConstants.LEFT);
		lblResultado.setBounds(279, 229, 130, 14);
		contentPane.add(lblResultado);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String PrimeiroDigitado = txtPrimeiro.getText();
				String SegundoDigitado = txtSegundo.getText();
				
				Integer PrimeiroI = Integer.valueOf(PrimeiroDigitado);
				Integer SegundoI = Integer.valueOf(SegundoDigitado);
				
				Calculo chama = new Calculo ();
				Calculo chama1 = new Calculo ();
				Calculo chama2 = new Calculo ();
				Calculo chama3 = new Calculo ();
				
				Integer Resultado = chama.CalculoSoma(PrimeiroI, SegundoI);
				Integer Resultado1 = chama1.CalculoSubtracao(PrimeiroI, SegundoI);
				Integer Resultado2 = chama2.CalculoMultiplicacao(PrimeiroI, SegundoI);
				Integer Resultado3 = chama3.CalculoDivisao(PrimeiroI, SegundoI);
				
				if(rdbtnAdicao.isSelected()) {
					lblResultado.setText("Resultado: " + Resultado);
					
				} else if (rdbtnSubtracao.isSelected()) {
					lblResultado.setText("Resultado: " + Resultado1); 
				
				} else if (rdbtnMultiplicacao.isSelected()) {
					lblResultado.setText("Resultado: " + Resultado2); 
					
				} else if (rdbtnDivisao.isSelected()) { 
				 lblResultado.setText("Resultado: " + Resultado3);
				}
		
			}
		});
		btnCalcular.setBounds(133, 223, 109, 27);
		contentPane.add(btnCalcular);
		

	}
}
