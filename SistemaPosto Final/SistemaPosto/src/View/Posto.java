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

import Model.CalculoPosto;
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
import javax.swing.ButtonGroup;

public class Posto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtOleoDiesel;
	private JTextField txtGasComum;
	private JTextField txtGasAditivada;
	private JTextField txtEtanol;
	private JTextField txtFrasco500Preco;
	private JTextField txtFrasco1Preco;
	private JTextField txtDias;
	private JTextField txtQuantidadeLitros;
	private JTextField txtFrasco500Oleo;
	private JTextField txtFrasco1Oleo;
	private final ButtonGroup buttonGroup = new ButtonGroup();
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
		
		Calculos chama = new Calculos ();
		
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
		
		JLabel lblOleoDiesel = new JLabel("Oleo Diesel:");
		lblOleoDiesel.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lblOleoDiesel);
		
		txtOleoDiesel = new JTextField();
		txtOleoDiesel.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				chama.Diesel = Float.valueOf(txtOleoDiesel.getText());
			}
		});
		panel.add(txtOleoDiesel);
		txtOleoDiesel.setColumns(10);
		
		JLabel lblGasComum = new JLabel("Gas.Comum:");
		panel.add(lblGasComum);
		
		txtGasComum = new JTextField();
		txtGasComum.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				chama.Comum = Float.valueOf(txtGasComum.getText());
			}
		});
		panel.add(txtGasComum);
		txtGasComum.setColumns(10);
		
		JLabel lblGasAditivada = new JLabel("Gas.Aditivada:");
		panel.add(lblGasAditivada);
		
		txtGasAditivada = new JTextField();
		txtGasAditivada.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				chama.Aditivada = Float.valueOf(txtGasAditivada.getText()); 
			}
		});
		panel.add(txtGasAditivada);
		txtGasAditivada.setColumns(10);
		
		JLabel lblEtanol = new JLabel("Etanol:");
		panel.add(lblEtanol);
		
		txtEtanol = new JTextField();
		txtEtanol.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				chama.Etanol = Float.valueOf(txtEtanol.getText());
			}
			
		});
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
		txtFrasco500Preco.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				chama.FrascoPreco500=Float.valueOf(txtFrasco500Preco.getText());
			}
		});
		panel_1.add(txtFrasco500Preco);
		txtFrasco500Preco.setColumns(10);
		
		JLabel lblFrasco1Oleo = new JLabel("Frasco 1L ");
		panel_1.add(lblFrasco1Oleo);
		
		txtFrasco1Preco = new JTextField();
		txtFrasco1Preco.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				chama.FrascoPreco1l=Float.valueOf(txtFrasco1Preco.getText());
			}
		});
		panel_1.add(txtFrasco1Preco);
		txtFrasco1Preco.setColumns(10);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.addFocusListener(new FocusAdapter() {
		});
		
		panel_2.setBorder(new TitledBorder(null, "Oleo Motor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(21, 143, 538, 109);
		contentPane.add(panel_2);
		panel_2.setLayout(new MigLayout("", "[][][grow][][][][][][][][][][][]", "[][][]"));
		
		JLabel lblTotalOleo = new JLabel("-");
		panel_2.add(lblTotalOleo, "cell 13 1");
		
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
		
		JLabel lblFrascoPagar1 = new JLabel("-");
		panel_2.add(lblFrascoPagar1, "cell 9 2");
		
		
		
		txtFrasco500Oleo = new JTextField();
		txtFrasco500Oleo.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				//float ValorF=0;
				//try {
				//ValorF = Float.parseFloat(txtFrasco500Preco.getText());
					//} catch(Exception e2) {
				//JOptionPane.showMessageDialog(null, "O valor inserido é preciso ser em Float ");
				//return;
				//}
				
				//float Valor1f=0;
				//try {
					
				//Valor1f = Float.parseFloat(txtFrasco500Oleo.getText());
				//} catch(Exception e2) {
				//JOptionPane.showMessageDialog(null, "O valor inserido é preciso ser em Float ");
					//return;
					//}
				
				
				//float puxa = chama.CalculoFrasco500(ValorF,Valor1f);
				
				//resultadofrasco = puxa;

				//lblFrascoPagar.setText(String.valueOf(puxa));
				
				//float resultadofrascos = resultadofrasco + resultadofrasco1;
				
				//lblTotalOleo.setText(String.valueOf(resultadofrascos));
				
				chama.FrascoQuantidade500 =Float.valueOf(txtFrasco500Oleo.getText());
				lblFrascoPagar.setText(""+chama.Frasco500ml());		
				lblTotalOleo.setText(""+chama.ValorTotalOleo());
				
				
		
			}
		});
		panel_2.add(txtFrasco500Oleo, "cell 2 1,growx");
		txtFrasco500Oleo.setColumns(10);
		

		
		JLabel lblNewLabel_1 = new JLabel("Frasco de 1L");
		panel_2.add(lblNewLabel_1, "cell 1 2,alignx trailing");
		
		txtFrasco1Oleo = new JTextField();
		txtFrasco1Oleo.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				//float Valor = 0;
				//try {
					//Valor=Float.parseFloat(txtFrasco1Preco.getText());
					//}  //catch(Exception e2) {
					//JOptionPane.showMessageDialog(null, "O valor inserido é preciso ser em Float ");
					//return;
				//}
				//float Valor1f=0;
				//try {
					
					//Valor1f = Float.parseFloat(txtFrasco1Oleo.getText());
					//} catch(Exception e2) {
					//JOptionPane.showMessageDialog(null, "O valor inserido é preciso ser em Float ");
					//return;
					//}
				
				//resultadofrasco1 = puxa1;
				
				//lblFrascoPagar1.setText(String.valueOf(puxa1));
				
				
				//float resultadofrascos = resultadofrasco + resultadofrasco1;
				
				//lblTotalOleo.setText(String.valueOf(resultadofrascos));
				chama.FrascoQuantidade1l =Float.valueOf(txtFrasco1Oleo.getText());
				lblFrascoPagar1.setText(""+chama.Frasco1l());		
				lblTotalOleo.setText(""+chama.ValorTotalOleo());
				
			}
		});
		panel_2.add(txtFrasco1Oleo, "cell 2 2,growx");
		txtFrasco1Oleo.setColumns(10);
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Abastecimento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(21, 284, 248, 109);
		contentPane.add(panel_3);
		panel_3.setLayout(new MigLayout("", "[][][][grow]", "[][][]"));
		
		JLabel lblCombustivel = new JLabel("Combustivel:");
		panel_3.add(lblCombustivel, "cell 1 0");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(CalculoPosto.values()));
		comboBox.setSelectedIndex(-1);
		panel_3.add(comboBox, "cell 3 0,growx");
		
		JLabel lblQuantidadeLitros = new JLabel("Quantidade Litros:");
		panel_3.add(lblQuantidadeLitros, "cell 1 1");
		
		JLabel lblTotalResCombustivel = new JLabel("");
		panel_3.add(lblTotalResCombustivel, "cell 3 2");
		
		
		txtQuantidadeLitros = new JTextField();
		txtQuantidadeLitros.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				//Item do comboBox
				int linha =comboBox.getSelectedIndex();
				//pegando quantidade 
				float quantidade =Float.valueOf(txtQuantidadeLitros.getText());
				if(linha==0)
				{
					lblTotalResCombustivel.setText(""+chama.CalculoOleo(quantidade));
				}
				else if(linha==1)
				{
					lblTotalResCombustivel.setText(""+chama.CalculoGasC(quantidade));
				}
				else if(linha==2)
				{
					lblTotalResCombustivel.setText(""+chama.CalculoGasA(quantidade));
				}
				else if(linha==3)
				{
					lblTotalResCombustivel.setText(""+chama.CalculoEtanol(quantidade));
				}
				
				
				
			}
		});
		panel_3.add(txtQuantidadeLitros, "cell 3 1,growx");
		txtQuantidadeLitros.setColumns(10);
		
		JLabel lblTotalCombustivel = new JLabel("Total Combustivel");
		panel_3.add(lblTotalCombustivel, "cell 1 2");
	
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "Formas De Pagamento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(305, 284, 254, 109);
		contentPane.add(panel_4);
		panel_4.setLayout(new MigLayout("", "[][][][grow]", "[][][][]"));
		
		JRadioButton rdbtnVista = new JRadioButton("À vista");
		buttonGroup.add(rdbtnVista);
		panel_4.add(rdbtnVista, "cell 0 0");
		
		JRadioButton rdbtnPrazo = new JRadioButton("À prazo");
		buttonGroup.add(rdbtnPrazo);
		panel_4.add(rdbtnPrazo, "cell 0 1");
		
		JLabel lblDias = new JLabel("Dias:");
		panel_4.add(lblDias, "cell 2 1,alignx trailing");
		
		txtDias = new JTextField();
		panel_4.add(txtDias, "cell 3 1,growx");
		txtDias.setColumns(10);
		
		JLabel lblTotalAPagar = new JLabel("Total a Pagar:  ");
		lblTotalAPagar.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_4.add(lblTotalAPagar, "cell 0 3");
		
		JLabel lblTotalForma = new JLabel("");
		panel_4.add(lblTotalForma, "cell 3 3");
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				if(rdbtnVista.isSelected())
				{
					String resultadovista = chama.ValorVista();
					lblTotalForma.setText("=  "+ resultadovista);
				}
				else if(rdbtnPrazo.isSelected())
				{
					Integer Dias =Integer.valueOf(txtDias.getText());
					if(Dias<=30)
					{
					String resultadoprazo = chama.ValorPrazo();
					lblTotalForma.setText("=  "+ resultadoprazo);
					}
					else if(Dias>30)
					{
						String resultadoacima = chama.Valor30();
						lblTotalForma.setText("=  "+ resultadoacima);
					}
				}
				
				
		
				
					
			
			}
		});
		btnCalcular.setBounds(78, 416, 89, 23);
		contentPane.add(btnCalcular);
		
		JButton btnNovaCalculo = new JButton("Novo Calculo");
		btnNovaCalculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtOleoDiesel.setText("");
				txtGasComum.setText("");;
				txtGasAditivada.setText("");	
				txtEtanol.setText("");
				txtFrasco500Preco.setText("");
				txtFrasco1Preco.setText("");
				txtFrasco500Oleo.setText("");
				txtFrasco1Oleo.setText("");
				txtQuantidadeLitros.setText("");
				txtDias.setText("");
				lblTotalResCombustivel.setText("");
				lblTotalOleo.setText("");
				lblFrascoPagar.setText("");
				lblFrascoPagar1.setText("");
				
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
