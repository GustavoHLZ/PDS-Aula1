package View;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.ConversaoTemperatura;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTemperatura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio1 frame = new Exercicio1();
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
	public Exercicio1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTemperatura = new JLabel("Temperatura(F)");
		lblTemperatura.setBounds(70, 50, 94, 14);
		contentPane.add(lblTemperatura);
		
		txtTemperatura = new JTextField();
		txtTemperatura.setBounds(218, 47, 86, 20);
		contentPane.add(txtTemperatura);
		txtTemperatura.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			// pegar a temperatura digitada no componente de texto
				String tempDigitada = txtTemperatura.getText();
			// Converter Temp String -> Float
				float tempConvertidaF = Float.valueOf(tempDigitada);
			// Criar objeto da classe conversao temperatura
				ConversaoTemperatura conv = new ConversaoTemperatura();
			//Chamar metodo conversao
				float tempC = conv.converterFtoC(tempConvertidaF);
			// Mostrar tempratura convertida
				JOptionPane.showMessageDialog(null,"Temperatura Convertida:" + tempC);
				
			}
		});
		btnCalcular.setBounds(156, 132, 89, 23);
		contentPane.add(btnCalcular);
	}

}
