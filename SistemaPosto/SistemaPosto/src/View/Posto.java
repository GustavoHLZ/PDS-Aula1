package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import Model.Calculos;
import net.miginfocom.swing.MigLayout;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Posto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtOleoDisel;
	private JTextField txtGasComum;
	private JTextField txtGasAditivada;
	private JTextField txtEtanol;
	private JTextField txtFrasco500Preco;
	private JTextField txtFrasco1Preco;
	private JTextField txtDias;
	private JTextField txtQuantidadeLitros;
	private JTextField txtFrasco500Oleo;
	private JTextField txtFrasco1Oleo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Posto frame = new Posto();
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
	public Posto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 585, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Tabela de Preco do Combustivel", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(21, 23, 267, 109);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(4, 2, 0, 0));
		
		JLabel lblOleoDisel = new JLabel("Oleo Disel:");
		panel.add(lblOleoDisel);
		
		txtOleoDisel = new JTextField();
		panel.add(txtOleoDisel);
		txtOleoDisel.setColumns(10);
		
		JLabel lblGasComum = new JLabel("Gas.Comum:");
		panel.add(lblGasComum);
		
		txtGasComum = new JTextField();
		panel.add(txtGasComum);
		txtGasComum.setColumns(10);
		
		JLabel lblGasAditivada = new JLabel("Gas.Aditivada:");
		panel.add(lblGasAditivada);
		
		txtGasAditivada = new JTextField();
		panel.add(txtGasAditivada);
		txtGasAditivada.setColumns(10);
		
		JLabel lblEtanol = new JLabel("Etanol:");
		panel.add(lblEtanol);
		
		txtEtanol = new JTextField();
		panel.add(txtEtanol);
		txtEtanol.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Tabela de Preco do Oleo Motor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(318, 23, 241, 109);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(2, 2, 0, 0));
		
		JLabel lblFrasco500 = new JLabel("Frasco 500ml");
		panel_1.add(lblFrasco500);
		
		txtFrasco500Preco = new JTextField();
		panel_1.add(txtFrasco500Preco);
		txtFrasco500Preco.setColumns(10);
		
		JLabel lblFrasco1Oleo = new JLabel("Frasco 1L ");
		panel_1.add(lblFrasco1Oleo);
		
		txtFrasco1Preco = new JTextField();
		panel_1.add(txtFrasco1Preco);
		txtFrasco1Preco.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Oleo Motor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(21, 143, 538, 109);
		contentPane.add(panel_2);
		panel_2.setLayout(new MigLayout("", "[][][grow][][][][][][][][][][][]", "[][][]"));
		
		JLabel lblNewLabel_2 = new JLabel("Quantidade");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_2, "cell 2 0");
		
		JLabel lblNewLabel_3 = new JLabel("Valor a Pagar");
		panel_2.add(lblNewLabel_3, "cell 9 0");
		
		JLabel lblNewLabel_4 = new JLabel("Total Oleo");
		panel_2.add(lblNewLabel_4, "cell 13 0");
		
		JLabel lblNewLabel = new JLabel("Frasco de 500ml");
		panel_2.add(lblNewLabel, "cell 1 1,alignx trailing");
		
		JLabel lblFrascoPagar = new JLabel("-");
		lblFrascoPagar.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblFrascoPagar, "cell 9 1");
		
		txtFrasco500Oleo = new JTextField();
		txtFrasco500Oleo.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				float ValorF=0;
				try {
					ValorF = Float.parseFloat(txtFrasco500Preco.getText());
				} catch(Exception e2) {
					JOptionPane.showMessageDialog(null, "O valor inserido é preciso ser em Float ");
					return;
				}
				
				float Valor1f=0;
				try {
					
					Valor1f = Float.parseFloat(txtFrasco500Oleo.getText());
				} catch(Exception e2) {
					JOptionPane.showMessageDialog(null, "O valor inserido é preciso ser em Float ");
					return;
				}
				
		
			float resultadofinal = ValorF*Valor1f;
			
			lblFrascoPagar.setText(String.valueOf(resultadofinal));
			
			}
		});
		panel_2.add(txtFrasco500Oleo, "cell 2 1,growx");
		txtFrasco500Oleo.setColumns(10);
		
		
		JLabel lblTotalOleo = new JLabel("-");
		panel_2.add(lblTotalOleo, "cell 13 1");
		
		JLabel lblNewLabel_1 = new JLabel("Frasco de 1L");
		panel_2.add(lblNewLabel_1, "cell 1 2,alignx trailing");
		
		txtFrasco1Oleo = new JTextField();
		txtFrasco1Oleo.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				float Valor = 0;
				try {
					Valor = Float.parseFloat(txtFrasco1Preco.getText());
				}  catch(Exception e2) {
					JOptionPane.showMessageDialog(null, "O valor inserido é preciso ser em Float ");
					return;
				}
				
			
				
			}
		});
		panel_2.add(txtFrasco1Oleo, "cell 2 2,growx");
		txtFrasco1Oleo.setColumns(10);
		
		JLabel lblFrascoPagar1 = new JLabel("-");
		panel_2.add(lblFrascoPagar1, "cell 9 2");
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Abastecimento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(21, 284, 248, 109);
		contentPane.add(panel_3);
		panel_3.setLayout(new MigLayout("", "[][][][grow]", "[][][]"));
		
		JLabel lblCombustivel = new JLabel("Combustivel:");
		panel_3.add(lblCombustivel, "cell 1 0");
		
		JComboBox<Object> comboBox = new JComboBox<Object>();
		comboBox.setModel(new DefaultComboBoxModel<Object>(new String[] {"Óleo Disel", "Gas.Comum", "Gas.Aditivada", "Etanol"}));
		panel_3.add(comboBox, "cell 3 0,growx");
		
		JLabel lblQuantidadeLitros = new JLabel("Quantidade Litros:");
		panel_3.add(lblQuantidadeLitros, "cell 1 1");
		
		txtQuantidadeLitros = new JTextField();
		panel_3.add(txtQuantidadeLitros, "cell 3 1,growx");
		txtQuantidadeLitros.setColumns(10);
		
		JLabel lblTotalCombustivel = new JLabel("Total Combustivel");
		panel_3.add(lblTotalCombustivel, "cell 1 2");
		
		JLabel lblTotalResCombustivel = new JLabel("");
		panel_3.add(lblTotalResCombustivel, "cell 3 2");
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "Formas De Pagamento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(305, 284, 254, 109);
		contentPane.add(panel_4);
		panel_4.setLayout(new MigLayout("", "[][][][grow]", "[][][][]"));
		
		JRadioButton rdbtnVista = new JRadioButton("À vista");
		panel_4.add(rdbtnVista, "cell 0 0");
		
		JRadioButton rdbtnPrazo = new JRadioButton("À prazo");
		panel_4.add(rdbtnPrazo, "cell 0 1");
		
		JLabel lblDias = new JLabel("Dias:");
		panel_4.add(lblDias, "cell 2 1,alignx trailing");
		
		txtDias = new JTextField();
		panel_4.add(txtDias, "cell 3 1,growx");
		txtDias.setColumns(10);
		
		JLabel lblTotalAPagar = new JLabel("Total a Pagar:  ");
		lblTotalAPagar.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_4.add(lblTotalAPagar, "cell 0 3");
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String QuantidadeDigitada = txtQuantidadeLitros.getText();
				String OleoDiselDigitado = txtOleoDisel.getText();
				String GasComumDigitado = txtGasComum.getText();
				String GasAditivadaDigitado = txtGasAditivada.getText();
				
				float QuantidadeF = Float.valueOf(QuantidadeDigitada);
				float OleoDiselF = Float.valueOf(OleoDiselDigitado);
				float GasComumF = Float.valueOf(GasComumDigitado);
				float GasAditivadaF = Float.valueOf(GasAditivadaDigitado);
				
				Calculos chama = new Calculos ();
				
				String Item = (String) comboBox.getSelectedItem();
				
				float ResultadoCalculoCombustivel = chama.CalculoCombustivel(OleoDiselF, QuantidadeF);
				
				
				
				if(Item.equals("Oleo Disel")) {
			}
				JOptionPane.showMessageDialog(null,"Resultado" + ResultadoCalculoCombustivel);		
			}
		});
		btnCalcular.setBounds(78, 416, 89, 23);
		contentPane.add(btnCalcular);
		
		JButton btnNovaCalculo = new JButton("Novo Calculo");
		btnNovaCalculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNovaCalculo.setBounds(232, 416, 111, 23);
		contentPane.add(btnNovaCalculo);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFechar.setBounds(402, 416, 89, 23);
		contentPane.add(btnFechar);
	}
}
