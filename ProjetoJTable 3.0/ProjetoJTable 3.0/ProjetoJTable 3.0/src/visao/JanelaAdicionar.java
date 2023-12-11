package visao;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Categoria;
import modelo.Produto;
import visao.Janela;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Frame;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class JanelaAdicionar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNomeProduto;
	private JTextField txtDescricao;
	private JTextField txtMarca;
	private JTextField txtPreco;
	private JTextField txtQuantidade;
	private JTextField txtDatadevalidade;
	private JTextField txtPeso;
	private JTextField txtFornecedor;
	private JTextField txtCodigo;
	private JTextField txtIngredientes;
	private JTextField txtAlergenicos;
	private JTextField txtCalorias;
	private JLabel lblNewLabel_3;
	private JButton btnFechar;
	private JComboBox comboBox;
	
	/**
	 * Launch the application.
	 */
				
	
	
	/**
	 * Create the frame.
	 */
	public JanelaAdicionar (Janela listar ) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 720);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(229, 236, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Cadastrar Produto");
		lblNewLabel.setBounds(409, 76, 258, 52);
		lblNewLabel.setFont(new Font("Yu Gothic", Font.PLAIN, 30));
		
		txtNomeProduto = new JTextField();
		txtNomeProduto.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
			}
		});

		
		
		txtNomeProduto.setBounds(122, 190, 100, 20);
		txtNomeProduto.setColumns(10);
		
		txtDescricao = new JTextField();
		txtDescricao.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				

			}

		});
		txtDescricao.setBounds(289, 190, 100, 20);
		txtDescricao.setColumns(10);
		
		txtMarca = new JTextField();
		txtMarca.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
			}

		});
		txtMarca.setBounds(457, 190, 100, 20);
		txtMarca.setColumns(10);
		
		txtPreco = new JTextField();
		txtPreco.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {

			}
		});
		txtPreco.setBounds(611, 190, 100, 20);
		txtPreco.setColumns(10);
		
		txtQuantidade = new JTextField();
		txtQuantidade.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {

			}
			
		});
		txtQuantidade.setBounds(764, 190, 100, 20);
		txtQuantidade.setColumns(10);
		
		txtDatadevalidade = new JTextField();
		txtDatadevalidade.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				/*LocalDate localdate = LocalDate.now();
				String dataF = localdate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				 txtDatadevalidade.setText(dataF);
				 */
			}
		});
		txtDatadevalidade.setBounds(122, 315, 100, 20);
		txtDatadevalidade.setColumns(10);
		
		txtPeso = new JTextField();
		txtPeso.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
			}
			
		});
		txtPeso.setBounds(457, 315, 100, 20);
		txtPeso.setColumns(10);
		
		txtFornecedor = new JTextField();
		txtFornecedor.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
			}
	
		});
		txtFornecedor.setBounds(611, 315, 100, 20);
		txtFornecedor.setColumns(10);
		
		txtCodigo = new JTextField();
		txtCodigo.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
			}
			
		});
		txtCodigo.setBounds(764, 315, 100, 20);
		txtCodigo.setColumns(10);
		
		txtIngredientes = new JTextField();
		txtIngredientes.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
		
			}
		});
		txtIngredientes.setBounds(289, 424, 100, 20);
		txtIngredientes.setColumns(10);
		
		txtAlergenicos = new JTextField();
		txtAlergenicos.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
			}
			
		});
		txtAlergenicos.setBounds(457, 424, 100, 20);
		txtAlergenicos.setColumns(10);
		
		txtCalorias = new JTextField();
		txtCalorias.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
			}
		});
		txtCalorias.setBounds(611, 424, 100, 20);
		txtCalorias.setColumns(10);
		
		comboBox = new JComboBox();
		comboBox.setBackground(new Color(229, 236, 238));
		comboBox.setModel(new DefaultComboBoxModel(Categoria.values()));
		comboBox.setSelectedIndex(-1);
		comboBox.setBounds(299, 314, 90, 22);
		contentPane.add(comboBox);
		
		JLabel lblNomedoProduto = new JLabel("Nome do Produto");
		lblNomedoProduto.setBounds(122, 153, 100, 26);
		lblNomedoProduto.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomedoProduto.setFont(new Font("Yu Gothic", Font.PLAIN, 12));
		
		JLabel lblNewLabel_1 = new JLabel("Descrição");
		lblNewLabel_1.setBounds(289, 153, 100, 26);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Yu Gothic", Font.PLAIN, 12));
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(5, 5, 46, 14);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setBounds(482, 155, 46, 23);
		lblMarca.setFont(new Font("Yu Gothic", Font.PLAIN, 12));
		lblMarca.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblPreco = new JLabel("Preço");
		lblPreco.setBounds(641, 155, 46, 22);
		lblPreco.setFont(new Font("Yu Gothic", Font.PLAIN, 12));
		lblPreco.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblQuantidade = new JLabel("Quantidade em Estoque");
		lblQuantidade.setBounds(728, 151, 165, 31);
		lblQuantidade.setFont(new Font("Yu Gothic", Font.PLAIN, 12));
		lblQuantidade.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_2 = new JLabel("Data de Validade");
		lblNewLabel_2.setBounds(122, 284, 100, 20);
		lblNewLabel_2.setFont(new Font("Yu Gothic", Font.PLAIN, 12));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_4 = new JLabel("Categoria");
		lblNewLabel_4.setBounds(289, 284, 100, 20);
		lblNewLabel_4.setFont(new Font("Yu Gothic", Font.PLAIN, 12));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_5 = new JLabel("Peso");
		lblNewLabel_5.setBounds(457, 284, 100, 20);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Yu Gothic", Font.PLAIN, 12));
		
		JLabel lblNewLabel_6 = new JLabel("Fornecedor");
		lblNewLabel_6.setBounds(611, 284, 100, 20);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Yu Gothic", Font.PLAIN, 12));
		
		JLabel lblNewLabel_7 = new JLabel("Codigo do Produto");
		lblNewLabel_7.setBounds(753, 284, 125, 20);
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Yu Gothic", Font.PLAIN, 12));
		
		JLabel lblNewLabel_8 = new JLabel("Ingredientes");
		lblNewLabel_8.setBounds(289, 393, 100, 20);
		lblNewLabel_8.setFont(new Font("Yu Gothic", Font.PLAIN, 12));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_9 = new JLabel("Alergênicos");
		lblNewLabel_9.setBounds(457, 393, 100, 20);
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setFont(new Font("Yu Gothic", Font.PLAIN, 12));
		
		JLabel lblNewLabel_10 = new JLabel("Calorias");
		lblNewLabel_10.setBounds(611, 390, 100, 26);
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setFont(new Font("Yu Gothic", Font.PLAIN, 12));
		
		JButton btnCadastrar = new JButton("Salvar");
		btnCadastrar.setBounds(715, 566, 181, 31);
		btnCadastrar.setBackground(new Color(255, 255, 255));
		btnCadastrar.setIcon(new ImageIcon(JanelaAdicionar.class.getResource("/Icones/Salvar.png")));
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Produto ch = new Produto ();
				DateTimeFormatter dataformatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				Object itemselecionado = comboBox.getSelectedItem();
				String categoria;
				LocalDate data;
				try {
				     data = LocalDate.parse(txtDatadevalidade.getText(), dataformatada);
				} catch (DateTimeParseException ex) {
				    JOptionPane.showMessageDialog(null, "Data inválida! Digite no formato dd/MM/yyyy");
				    return;
				}
				
				float preco = 0;
				try {
				    preco = Float.parseFloat(txtPreco.getText());
				} catch (NumberFormatException ex) {
				    JOptionPane.showMessageDialog(null, "Digite apenas números para o preço");
				    return;
				}
				Integer quantidade = 0;
				try {
				    quantidade = Integer.parseInt(txtQuantidade.getText());
				} catch (NumberFormatException ex) {
				    JOptionPane.showMessageDialog(null, "Digite apenas números para a quantidade");
				    return;
				}
				float peso = 0;
				try {
				    peso = Float.parseFloat(txtPeso.getText());
				} catch (NumberFormatException ex) {
				    JOptionPane.showMessageDialog(null, "Digite apenas números para o peso");
				    return;
				}
				Integer codigo = 0;
				try {
				    codigo = Integer.parseInt(txtCodigo.getText());
				} catch (NumberFormatException ex) {
				    JOptionPane.showMessageDialog(null, "Digite apenas números para o Codigo");
				    return;
				}
				float calorias = 0;
				try {
				    calorias = Float.parseFloat(txtCalorias.getText());
				} catch (NumberFormatException ex) {
				    JOptionPane.showMessageDialog(null, "Digite apenas números para as Calorias");
				    return;
				}
				
				String nome = txtNomeProduto.getText();
				if (nome.isEmpty() || !verificacao(nome)) {
				    JOptionPane.showMessageDialog(null, "Digite um nome válido.");
				    return;
				}
				ch.setNomedoproduto(nome);

				String descricao = txtDescricao.getText();
				if (descricao.isEmpty() || !verificacao(descricao)) {
				    JOptionPane.showMessageDialog(null, "Digite uma descrição válida.");
				    return;
				}
				ch.setDescricao(descricao);

				String marca = txtMarca.getText();
				if (marca.isEmpty() || !verificacao(marca)) {
				    JOptionPane.showMessageDialog(null, "Digite uma marca válida.");
				    return;
				}
				ch.setMarca(marca);

				String fornecedor = txtFornecedor.getText();
				if (fornecedor.isEmpty() || !verificacao(fornecedor)) {
				    JOptionPane.showMessageDialog(null, "Digite um fornecedor válido.");
				    return;
				}
				ch.setFornecedor(fornecedor);

				String ingredientes = txtIngredientes.getText();
				ch.setIngredientes(ingredientes);

				String alergenicos = txtAlergenicos.getText();
				if (alergenicos.isEmpty() || !verificacao(alergenicos)) {
				    JOptionPane.showMessageDialog(null, "Digite alergênicos válidos.");
				    return;
				}
				ch.setAlergenicos(alergenicos);

	
				
				if (itemselecionado != null) {
				    categoria = itemselecionado.toString();
				    if (!categoria.isEmpty()) {
				        ch.setNomedoproduto(nome);
				        ch.setDescricao(descricao);
				        ch.setMarca(marca);
				        ch.setPreco(preco);
				        ch.setQuantidade(quantidade);
				        ch.setDatadevalidade(data);
				        ch.setCategoria(categoria);
				        ch.setPeso(peso);
				        ch.setFornecedor(fornecedor);
				        ch.setCodigo(codigo);
				        ch.setIngredientes(ingredientes);
				        ch.setAlergenicos(alergenicos);
				        ch.setCaloria(calorias);

				        listar.ExportarVariaveis(ch);
				        JOptionPane.showInternalMessageDialog(btnCadastrar, "Produto Cadastrado");
				        dispose();
				    }
				} else {
				    JOptionPane.showMessageDialog(null, "O combo box está vazio, selecione um item");
				}
	
				
				
			}
		});
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel_3);
		contentPane.add(lblNewLabel);
		contentPane.add(lblNomedoProduto);
		contentPane.add(lblNewLabel_1);
		contentPane.add(lblMarca);
		contentPane.add(lblPreco);
		contentPane.add(lblQuantidade);
		contentPane.add(txtNomeProduto);
		contentPane.add(txtDescricao);
		contentPane.add(txtMarca);
		contentPane.add(txtPreco);
		contentPane.add(txtQuantidade);
		contentPane.add(txtDatadevalidade);
		contentPane.add(txtPeso);
		contentPane.add(txtFornecedor);
		contentPane.add(txtCodigo);
		contentPane.add(lblNewLabel_8);
		contentPane.add(lblNewLabel_9);
		contentPane.add(lblNewLabel_10);
		contentPane.add(txtIngredientes);
		contentPane.add(txtAlergenicos);
		contentPane.add(txtCalorias);
		contentPane.add(lblNewLabel_2);
		contentPane.add(lblNewLabel_4);
		contentPane.add(lblNewLabel_5);
		contentPane.add(lblNewLabel_6);
		contentPane.add(btnCadastrar);
		contentPane.add(lblNewLabel_7);
		
		btnFechar = new JButton("Fechar");
		btnFechar.setIcon(new ImageIcon(JanelaAdicionar.class.getResource("/Icones/Fechar.png")));
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnFechar.setBackground(new Color(255, 255, 255));
		btnFechar.setBounds(122, 566, 152, 31);
		contentPane.add(btnFechar);
		
		JButton btnLimpar = new JButton("New button");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnLimpar.setIcon(new ImageIcon(JanelaAdicionar.class.getResource("/Icones/Group 187.png")));
		btnLimpar.setBounds(397, 566, 181, 31);
		contentPane.add(btnLimpar);
		
		
	}
	public void alteracao(String nome, String descricao) {
		 txtNomeProduto.setText(nome);
		 txtDescricao.setText(descricao);
	}
	public boolean verificacao (String string) {
		return string.matches("[a -z A - Zçãéóò/]+");
	}
	public void limpar() {
		 txtNomeProduto.setText("");
		    txtDescricao.setText("");
		    txtMarca.setText("");
		    txtPreco.setText("");
		    txtQuantidade.setText("");
		    txtPeso.setText("");
		    txtDatadevalidade.setText("");
		    txtFornecedor.setText("");
		    txtCodigo.setText("");
		    txtIngredientes.setText("");
		    txtAlergenicos.setText("");
		    txtCalorias.setText("");
	}
    }
	

