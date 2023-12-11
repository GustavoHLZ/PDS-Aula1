package visao;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Categoria;
import modelo.Produto;
import visao.Janela;
import visao.JanelaAdicionar;

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
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class JanelaAlterar extends JFrame {

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
	ArrayList<Produto> lista = new ArrayList<Produto>();
	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 * @param abrir 
	 */
	public JanelaAlterar(Produto p, Janela abrir) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 1000);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(229, 236, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Alterar");
		lblNewLabel.setFont(new Font("Yu Gothic", Font.PLAIN, 30));
		
		txtNomeProduto = new JTextField();
		txtNomeProduto.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
			
				
			}
		});
		txtNomeProduto.setColumns(10);
		
		txtDescricao = new JTextField();
		txtDescricao.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
		
			}
		});
		txtDescricao.setColumns(10);
		
		txtMarca = new JTextField();
		txtMarca.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
			
			}
		});
		txtMarca.setColumns(10);
		
		txtPreco = new JTextField();
		txtPreco.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
			
			}
		});
		txtPreco.setColumns(10);
		
		txtQuantidade = new JTextField();
		txtQuantidade.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
			
			
			}
		});
		txtQuantidade.setColumns(10);
		
		txtDatadevalidade = new JTextField();
		txtDatadevalidade.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
			}
		});
		txtDatadevalidade.setColumns(10);
		
		txtPeso = new JTextField();
		txtPeso.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
			
			}
			
		});
		txtPeso.setColumns(10);
		
		txtFornecedor = new JTextField();
		txtFornecedor.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
			}
		});
		txtFornecedor.setColumns(10);
		
		txtCodigo = new JTextField();
		txtCodigo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
			
			}
		});
		txtCodigo.setColumns(10);
		
		txtIngredientes = new JTextField();
		txtIngredientes.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
			
			}
		});
		txtIngredientes.setColumns(10);
		
		txtAlergenicos = new JTextField();
		txtAlergenicos.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
			
			}
		});
		txtAlergenicos.setColumns(10);
		
		txtCalorias = new JTextField();
		txtCalorias.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
			}
		});
		txtCalorias.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(Categoria.values()));
		comboBox.setSelectedItem(p.getCategoria());
		comboBox.setBounds(299, 314, 90, 22);
		contentPane.add(comboBox);
		
		JLabel lblNomedoProduto = new JLabel("Nome do Produto");
		lblNomedoProduto.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomedoProduto.setFont(new Font("Yu Gothic", Font.PLAIN, 12));
		
		JLabel lblNewLabel_1 = new JLabel("Descrição");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Yu Gothic", Font.PLAIN, 12));
		
		lblNewLabel_3 = new JLabel("");
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setFont(new Font("Yu Gothic", Font.PLAIN, 12));
		lblMarca.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblPreco = new JLabel("Preço");
		lblPreco.setFont(new Font("Yu Gothic", Font.PLAIN, 12));
		lblPreco.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblQuantidade = new JLabel("Quantidade em Estoque");
		lblQuantidade.setFont(new Font("Yu Gothic", Font.PLAIN, 12));
		lblQuantidade.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_2 = new JLabel("Data de Validade");
		lblNewLabel_2.setFont(new Font("Yu Gothic", Font.PLAIN, 12));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_4 = new JLabel("Categoria");
		lblNewLabel_4.setFont(new Font("Yu Gothic", Font.PLAIN, 12));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_5 = new JLabel("Peso");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Yu Gothic", Font.PLAIN, 12));
		
		JLabel lblNewLabel_6 = new JLabel("Fornecedor");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Yu Gothic", Font.PLAIN, 12));
		
		JLabel lblNewLabel_7 = new JLabel("Codigo do Produto");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Yu Gothic", Font.PLAIN, 12));
		
		JLabel lblNewLabel_8 = new JLabel("Ingredientes");
		lblNewLabel_8.setFont(new Font("Yu Gothic", Font.PLAIN, 12));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_9 = new JLabel("Alergênicos");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setFont(new Font("Yu Gothic", Font.PLAIN, 12));
		
		JLabel lblNewLabel_10 = new JLabel("Calorias");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setFont(new Font("Yu Gothic", Font.PLAIN, 12));
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setIcon(new ImageIcon(JanelaAlterar.class.getResource("/Icones/Salvar.png")));
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Produto p = new Produto();
				DateTimeFormatter dataformatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				Object item = comboBox.getSelectedItem();
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
				    JOptionPane.showMessageDialog(null, "Digite apenas números para o Código");
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
		

				String descricao = txtDescricao.getText();
				if (descricao.isEmpty() || !verificacao(descricao)) {
				    JOptionPane.showMessageDialog(null, "Digite uma descrição válida.");
				    return;
				}
		

				String marca = txtMarca.getText();
				if (marca.isEmpty() || !verificacao(marca)) {
				    JOptionPane.showMessageDialog(null, "Digite uma marca válida.");
				    return;
				}
	

				String fornecedor = txtFornecedor.getText();
				if (fornecedor.isEmpty() || !verificacao(fornecedor)) {
				    JOptionPane.showMessageDialog(null, "Digite um fornecedor válido.");
				    return;
				}
			

				String alergenicos = txtAlergenicos.getText();
				if (alergenicos.isEmpty() || !verificacao(alergenicos)) {
				    JOptionPane.showMessageDialog(null, "Digite alergênicos válidos.");
				    return;
				}

				if (item != null) {
				    categoria = item.toString();
				    if (!categoria.isEmpty()) {
				    	p.setNomedoproduto(nome);
				    	p.setDescricao(descricao);
				    	p.setMarca(marca);
				    	p.setFornecedor(fornecedor);
				        p.setDatadevalidade(data);
				        p.setPreco(preco);
				        p.setQuantidade(quantidade);
				        p.setPeso(peso);
				        p.setCodigo(codigo);
				        p.setCaloria(calorias);
				        p.setCategoria(categoria);
				        p.setAlergenicos(alergenicos);
				        abrir.atualizardados(p);
				        JOptionPane.showInternalMessageDialog(btnSalvar, "Produto Alterado");
				        dispose();
				    } else {
				        JOptionPane.showMessageDialog(null, "Por favor, selecione uma categoria para o produto.");
				    }
				} else {
				    JOptionPane.showMessageDialog(null, "O combo box está vazio, selecione um item");
				}

			}
		});
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setIcon(new ImageIcon(JanelaAlterar.class.getResource("/Icones/Fechar.png")));
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		JButton btnLimpar = new JButton("");
		btnLimpar.setIcon(new ImageIcon(JanelaAlterar.class.getResource("/Icones/Group 187.png")));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(117)
							.addComponent(lblNomedoProduto, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addGap(67)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addGap(93)
							.addComponent(lblMarca, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
							.addGap(113)
							.addComponent(lblPreco, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
							.addGap(41)
							.addComponent(lblQuantidade, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(117)
							.addComponent(txtNomeProduto, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addGap(67)
							.addComponent(txtDescricao, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addGap(68)
							.addComponent(txtMarca, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addGap(54)
							.addComponent(txtPreco, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addGap(53)
							.addComponent(txtQuantidade, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(117)
							.addComponent(txtDatadevalidade, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addGap(235)
							.addComponent(txtPeso, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addGap(54)
							.addComponent(txtFornecedor, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addGap(53)
							.addComponent(txtCodigo, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(284)
							.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addGap(68)
							.addComponent(lblNewLabel_9, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addGap(54)
							.addComponent(lblNewLabel_10, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(284)
							.addComponent(txtIngredientes, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addGap(68)
							.addComponent(txtAlergenicos, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addGap(54)
							.addComponent(txtCalorias, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(117)
									.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
									.addGap(67)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(10)
											.addComponent(comboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
									.addGap(68)
									.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
									.addGap(54)
									.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(164)
									.addComponent(btnFechar, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
									.addGap(138)
									.addComponent(btnLimpar, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)))
							.addGap(42)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnSalvar, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(36)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(45, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addGap(62)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(2)
							.addComponent(lblNomedoProduto, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(2)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(4)
							.addComponent(lblMarca, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(4)
							.addComponent(lblPreco, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblQuantidade, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(8)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(txtNomeProduto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtDescricao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtMarca, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtPreco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtQuantidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(74)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2)
						.addComponent(lblNewLabel_4)
						.addComponent(lblNewLabel_5)
						.addComponent(lblNewLabel_6)
						.addComponent(lblNewLabel_7))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(11)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(txtDatadevalidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtPeso, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtFornecedor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtCodigo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(55)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNewLabel_8))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNewLabel_9))
						.addComponent(lblNewLabel_10, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addGap(8)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(txtIngredientes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtAlergenicos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtCalorias, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(127)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSalvar, GroupLayout.PREFERRED_SIZE, 37, Short.MAX_VALUE)
						.addComponent(btnFechar, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnLimpar, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
					.addGap(68))
		);
		contentPane.setLayout(gl_contentPane);
		String nome = String.valueOf(p.getNomedoproduto());
		txtNomeProduto.setText(nome);
		String descricao = String.valueOf(p.getDescricao());
		txtDescricao.setText(descricao);
		String marca = String.valueOf(p.getMarca());
		txtMarca.setText(marca);
		Float preco = p.getPreco();
		txtPreco.setText(String.valueOf(preco));
		LocalDate data = p.getDatadevalidade();
		Integer quantidade = p.getQuantidade();
		txtQuantidade.setText(String.valueOf(quantidade));
		Float peso = p.getPeso();
		txtPeso.setText(String.valueOf(peso));
		String fornecedor = String.valueOf(p.getFornecedor());
		txtFornecedor.setText(fornecedor);
		Integer codigo = p.getCodigo();
		txtCodigo.setText(String.valueOf(codigo));
		String Ingredientes = String.valueOf(p.getIngredientes());
		txtIngredientes.setText(Ingredientes);
		String alergenicos = String.valueOf(p.getAlergenicos());
		txtAlergenicos.setText(alergenicos);
		Float calorias = p.getCaloria();
		txtCalorias.setText(String.valueOf(calorias));
		DateTimeFormatter dataformatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dataB = p.getDatadevalidade().format(dataformatada);
		txtDatadevalidade.setText(dataB);
		
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
