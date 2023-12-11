	package visao;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import modelo.Produto;
import visao.JanelaAdicionar;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import java.awt.Font;
public class Janela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	ArrayList<Produto> lista = new ArrayList<Produto>();
	private JButton btnNewButton_2;
	
		
	
	
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 1000, 1000);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(229, 236, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		JScrollPane scrollPane = new JScrollPane();

		table = new JTable();
		Janela estajanela = this;
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				int linha = table.getSelectedRow();
				Produto linhaSelecionada = lista.get(linha);
				
			}
		});
		atualizarJTableModel();
		scrollPane.setViewportView(table);


		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Usuário\\eclipse-workspace\\ProjetoJTable 2.0\\ProjetoJTable 2.0\\ProjetoJTable\\Icones\\Adicionar.png"));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				JanelaAdicionar abrircadastrarproduto = new JanelaAdicionar(estajanela);
				
				abrircadastrarproduto.setVisible(true);
				
		
			}
		});

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Usuário\\eclipse-workspace\\ProjetoJTable 2.0\\ProjetoJTable 2.0\\ProjetoJTable\\Icones\\Excluir.png"));
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				int idx_linha = table.getSelectedRow();
				if(idx_linha < 0) {
					return;
				}
				
				lista.remove(idx_linha);
				atualizarJTableModel();
			
			}
		}
					
		
		);

		btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Usuário\\eclipse-workspace\\ProjetoJTable 2.0\\ProjetoJTable 2.0\\ProjetoJTable\\Icones\\Alterar.png"));
		btnNewButton_2.setBackground(new Color(255, 255, 255));
				Janela abrir = this;
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int linha = table.getSelectedRow();
				Produto c = lista.get(linha);
				
				JanelaAlterar janelaAlterar = new JanelaAlterar(c, abrir);
				janelaAlterar.setVisible(true);
				
			}
		});
		
		JLabel lblNewLabel = new JLabel("Produtos");
		lblNewLabel.setFont(new Font("Yu Gothic", Font.PLAIN, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 954, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(90)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(11)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
							.addGap(112)
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
							.addGap(120)
							.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 21, Short.MAX_VALUE)))
					.addGap(65))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(44)
					.addComponent(lblNewLabel)
					.addGap(138)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 33, Short.MAX_VALUE)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 33, Short.MAX_VALUE)
						.addComponent(btnNewButton_2, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 33, Short.MAX_VALUE))
					.addGap(66)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
					.addGap(221))
		);
		contentPane.setLayout(gl_contentPane);


	}

	public void atualizarJTableModel() {
		table.setModel(new ProdutoJTableModel(lista));

	}
	public void atualizardados(Produto p) {
		int linhaSelecionada = table.getSelectedRow();
		lista.set(linhaSelecionada, p); 
		atualizarJTableModel();
	}
	public void ExportarVariaveis (Produto puxa ) {
		lista.add(puxa);	
		atualizarJTableModel();
	}
}
