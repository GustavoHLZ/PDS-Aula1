package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPrimeiroNome;
	private JTextField txtSobrenome;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PrimeiroNome");
		lblNewLabel.setBounds(82, 48, 65, 14);
		contentPane.add(lblNewLabel);
		
		txtPrimeiroNome = new JTextField();
		txtPrimeiroNome.setBounds(70, 90, 86, 20);
		contentPane.add(txtPrimeiroNome);
		txtPrimeiroNome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Sobrenome");
		lblNewLabel_1.setBounds(259, 48, 67, 14);
		contentPane.add(lblNewLabel_1);
		
		txtSobrenome = new JTextField();
		txtSobrenome.setBounds(252, 90, 86, 20);
		contentPane.add(txtSobrenome);
		txtSobrenome.setColumns(10);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String  nome = txtPrimeiroNome.getText();
				String sobrenome = txtSobrenome.getText();
				JOptionPane.showMessageDialog(null,"Cadastro: " + nome  + " " + sobrenome);
			}
		});
		btnNewButton.setBounds(82, 167, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			txtPrimeiroNome.setText("");
			txtSobrenome.setText("");
			}
		});
		btnLimpar.setBounds(252, 167, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnNewButton_1 = new JButton("Fechar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_1.setBounds(162, 216, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
