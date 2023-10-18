package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Gasolina;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtValorDesejado;
	private JTextField txtGasolina;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio4 frame = new Exercicio4();
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
	public Exercicio4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblValorDesejado = new JLabel("Valor Desejado");
		lblValorDesejado.setBounds(73, 65, 96, 14);
		contentPane.add(lblValorDesejado);
		
		txtValorDesejado = new JTextField();
		txtValorDesejado.setBounds(67, 112, 86, 20);
		contentPane.add(txtValorDesejado);
		txtValorDesejado.setColumns(10);
		
		JButton btnCalcula = new JButton("Calcular");
		btnCalcula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ValorDesejadoDigitado = txtValorDesejado.getText();
				String GasolinaDigitado = txtGasolina.getText();
				
				float ConversaoValor = Float.valueOf(ValorDesejadoDigitado);
				float ConversaoGasolina = Float.valueOf(GasolinaDigitado);
				
				Gasolina res= new Gasolina();
				
				float puxa = res.CalculoGasolina(ConversaoValor, ConversaoGasolina);
				
			 JOptionPane.showMessageDialog(null, "Resultado = " + String.format("%.2f", puxa));
			}
		});
		btnCalcula.setBounds(151, 176, 89, 23); 
		contentPane.add(btnCalcula);
		
		JLabel lblGasolina = new JLabel("Gasolina");
		lblGasolina.setBounds(274, 65, 64, 14);
		contentPane.add(lblGasolina);
		
		txtGasolina = new JTextField();
		txtGasolina.setBounds(252, 112, 86, 20);
		contentPane.add(txtGasolina);
		txtGasolina.setColumns(10);
	}

}
