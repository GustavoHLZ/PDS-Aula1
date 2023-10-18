package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Retangulo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAltura;
	private JTextField txtBase;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio3 frame = new Exercicio3();
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
	public Exercicio3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Altura");
		lblNewLabel.setBounds(107, 60, 46, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnCalcula = new JButton("Calcular");
		btnCalcula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Alturadigitada = txtAltura.getText();
				String Basedigitada = txtBase.getText();
				
				float ConversaoAltura = Float.valueOf(Alturadigitada);
				float ConversaoBase = Float.valueOf(Basedigitada);
				
				Retangulo chama = new Retangulo();
				Retangulo chama1 = new Retangulo();
				
				float tudo = chama.Calculaperimetro(ConversaoAltura,ConversaoBase);
				float tudo1 =chama1.CalculaArea(ConversaoAltura,ConversaoBase);
				
				JOptionPane.showMessageDialog(null,"Resultado Perimetro = " + tudo + "\n" + "Resultado Area = " + tudo1);
				
			}
		});
		btnCalcula.setBounds(167, 161, 89, 23);
		contentPane.add(btnCalcula);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(90, 86, 86, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);
		
		txtBase = new JTextField();
		txtBase.setBounds(261, 86, 86, 20);
		contentPane.add(txtBase);
		txtBase.setColumns(10);
		
		JLabel lblBase = new JLabel("Base");
		lblBase.setBounds(282, 60, 46, 14);
		contentPane.add(lblBase);
	}
}
