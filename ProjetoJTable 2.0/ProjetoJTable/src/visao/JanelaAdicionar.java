package visao;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Produto;
import visao.Janela;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class JanelaAdicionar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNomeProduto;
	private JTextField txtDescricao;
	private JTextField txtMarca;
	private JTextField txtPreco;
	private JTextField txtQuantidade;
	private JTextField txtDatadevalidade;
	private JTextField txtCategoria;
	private JTextField txtPeso;
	private JTextField txtFornecedor;
	private JTextField txtCodigo;
	private JTextField txtIngredientes;
	private JTextField txtAlergenicos;
	private JTextField txtCalorias;
	ArrayList<Produto> lista = new ArrayList<Produto>();
	private JLabel lblNewLabel_3;
	Janela mostrar = new Janela (null);
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaAdicionar frame = new JanelaAdicionar(null);
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
	public JanelaAdicionar(Produto listar) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Cadastrar Produto");
		lblNewLabel.setFont(new Font("Yu Gothic", Font.PLAIN, 30));
		
		txtNomeProduto = new JTextField();
		txtNomeProduto.setColumns(10);
		
		txtDescricao = new JTextField();
		txtDescricao.setColumns(10);
		
		txtMarca = new JTextField();
		txtMarca.setColumns(10);
		
		txtPreco = new JTextField();
		txtPreco.setColumns(10);
		
		txtQuantidade = new JTextField();
		txtQuantidade.setColumns(10);
		
		txtDatadevalidade = new JTextField();
		txtDatadevalidade.setColumns(10);
		
		txtCategoria = new JTextField();
		txtCategoria.setColumns(10);
		
		txtPeso = new JTextField();
		txtPeso.setColumns(10);
		
		txtFornecedor = new JTextField();
		txtFornecedor.setColumns(10);
		
		txtCodigo = new JTextField();
		txtCodigo.setColumns(10);
		
		txtIngredientes = new JTextField();
		txtIngredientes.setColumns(10);
		
		txtAlergenicos = new JTextField();
		txtAlergenicos.setColumns(10);
		
		txtCalorias = new JTextField();
		txtCalorias.setColumns(10);
		
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
		
		JButton btnCadastrar = new JButton("New button");
		btnCadastrar.setIcon(new ImageIcon("C:\\Users\\Usuário\\Downloads\\Cadastrar.png"));
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Produto puxa = new Produto ();
				
				puxa.setNomedoproduto(txtNomeProduto.getText());
				puxa.setDescricao(txtDescricao.getText());
				puxa.setMarca(txtMarca.getText());
				puxa.setPreco (Float.parseFloat(txtPreco.getText()));
				puxa.setQuantidade(Integer.parseInt(txtQuantidade.getText()));
				puxa.setDatadevalidade(Integer.parseInt(txtDatadevalidade.getText()));
				puxa.setCategoria(txtCategoria.getText());
				puxa.setPeso(Float.parseFloat(txtPeso.getText()));
				puxa.setFornecedor(txtFornecedor.getText());
				puxa.setCodigo(Integer.parseInt(txtCodigo.getText()));
				puxa.setIngredientes(txtIngredientes.getText());
				puxa.setAlergenicos(txtAlergenicos.getText());
				puxa.setCaloria(Integer.parseInt(txtCalorias.getText()));
				
				lista.add(puxa);
				
				mostrar.ExportarVariaveis(puxa);
				mostrar.setVisible(true);
				 //listar.(puxa);
				dispose();
			}
		});
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(404)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE))
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
							.addGap(67)
							.addComponent(txtCategoria, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addGap(68)
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
							.addGap(117)
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addGap(67)
							.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addGap(68)
							.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addGap(54)
							.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addGap(42)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnCadastrar, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addGap(57)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addGap(23)
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
					.addGap(11)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(txtDatadevalidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtCategoria, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtPeso, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtFornecedor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtCodigo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
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
					.addComponent(btnCadastrar, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(68))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
