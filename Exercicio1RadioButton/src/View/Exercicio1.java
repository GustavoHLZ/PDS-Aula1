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
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Exercicio1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAltura;
	private JTextField txtBase;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	protected JLabel lblResultado;

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
		setTitle("Retangulo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Altura");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(189, 57, 46, 14);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnArea = new JRadioButton("Área");
		buttonGroup.add(rdbtnArea);
		rdbtnArea.setBounds(45, 161, 109, 23);
		contentPane.add(rdbtnArea);
		
		JRadioButton rdbtnPerimetro = new JRadioButton("Perimetro");
		buttonGroup.add(rdbtnPerimetro);
		rdbtnPerimetro.setBounds(189, 161, 109, 23);
		contentPane.add(rdbtnPerimetro);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setBounds(45, 191, 46, 14);
		contentPane.add(lblResultado);
		
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
				
				if(rdbtnArea.isSelected()) {
					lblResultado.setText("" + tudo1);
				}else if(rdbtnPerimetro.isSelected()) {
					lblResultado.setText("" + tudo);
				
				}
					
				}
			
		});
		btnCalcula.setBounds(24, 216, 89, 23);
		contentPane.add(btnCalcula);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(189, 74, 86, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);
		
		txtBase = new JTextField();
		txtBase.setBounds(45, 74, 86, 20);
		contentPane.add(txtBase);
		txtBase.setColumns(10);
		
		JLabel lblBase = new JLabel("Base");
		lblBase.setHorizontalAlignment(SwingConstants.CENTER);
		lblBase.setBounds(45, 57, 46, 14);
		contentPane.add(lblBase);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			txtAltura.setText("");
			txtBase.setText("");
			
			}
		});
		btnLimpar.setBounds(123, 216, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					setVisible(false);
			
			}
		});
		btnFechar.setBounds(217, 216, 89, 23);
		contentPane.add(btnFechar);
		
		
		
	}
}
