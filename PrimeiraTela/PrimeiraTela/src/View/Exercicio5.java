package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Comida;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio5 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPeso;
	private JTextField txtValor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio5 frame = new Exercicio5();
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
	public Exercicio5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPesoPrato = new JLabel("Peso do Prato");
		lblPesoPrato.setBounds(86, 52, 86, 14);
		contentPane.add(lblPesoPrato);
		
		JLabel lblValorDoQuilo = new JLabel("Valor do Quilo");
		lblValorDoQuilo.setBounds(278, 52, 103, 14);
		contentPane.add(lblValorDoQuilo);
		
		txtPeso = new JTextField();
		txtPeso.setBounds(86, 111, 86, 20);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);
		
		txtValor = new JTextField();
		txtValor.setBounds(269, 111, 86, 20);
		contentPane.add(txtValor);
		txtValor.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String PesoDigitado = txtPeso.getText();
				String ValorDigitado = txtValor.getText();
				
				float Pesof = Float.valueOf(PesoDigitado);
				float Valorf = Float.valueOf(ValorDigitado);
				
				Comida res = new Comida();
				
				
				float puxa = res.calculo(Pesof, Valorf);
				
				 JOptionPane.showMessageDialog(null, "O valor final = " + String.format("%.2f", puxa));
				
			}
		});
		btnCalcular.setBounds(161, 181, 89, 23);
		contentPane.add(btnCalcular);
	}

}
