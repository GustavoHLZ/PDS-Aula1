import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import java.awt.Color;

public class Janela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
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
	public Janela() {
		setForeground(new Color(128, 255, 255));
		setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		setTitle("Tela do Java");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblOlaMundo = new JLabel("Olá mundo");
		lblOlaMundo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null,"O foco está JLabel");
			}
		});
		lblOlaMundo.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 12));
		lblOlaMundo.setBounds(186, 57, 68, 14);
		contentPane.add(lblOlaMundo);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFechar.setBounds(295, 161, 89, 23);
		contentPane.add(btnFechar);
		
		txtNome = new JTextField();
		txtNome.setBounds(179, 107, 86, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(82, 110, 46, 14);
		contentPane.add(lblNome);
		
		JButton btnNewButton = new JButton("Validar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//pegar o texto digatado no JTextField(txtNome)
				 String  nome = txtNome.getText();
				// Mostrar o nome digitado na tela usando JOptionPane
				 JOptionPane.showMessageDialog(null, "O nome digitado é: " + nome);
				
			}
		});
		btnNewButton.setBounds(176, 161, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNome.setText("");
			}
		});
		btnNewButton_1.setBounds(26, 161, 121, 23);
		contentPane.add(btnNewButton_1);
	}
}
