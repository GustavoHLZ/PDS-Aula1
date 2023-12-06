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
public class Janela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	ArrayList<Produto> lista = new ArrayList<Produto>();
	private JButton btnNewButton_2;
	

	public void ExportarVariaveis (Produto puxa ) {
		lista.add(puxa);	
		atualizarJTableModel();
	}
	
		
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela(null);
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
	public Janela(Produto Janela) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		JScrollPane scrollPane = new JScrollPane();

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				int linha = table.getSelectedRow();
				Produto linhaSelecionada = lista.get(linha);
				
			}
		});
		atualizarJTableModel();
		scrollPane.setViewportView(table);


		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				JanelaAdicionar abrircadastrarproduto = new JanelaAdicionar(Janela);
				
				abrircadastrarproduto.setVisible(true);
				
		
			}
		});

		JButton btnNewButton_1 = new JButton("Excluir");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				int idx_linha = table.getSelectedRow();
				if(idx_linha < 0) {
					JOptionPane.showMessageDialog(null, "Selecione a pessoa para excluir!");
					return;
				}
				
				lista.remove(idx_linha);
				atualizarJTableModel();
			
			}
		}
					
		
		);

		btnNewButton_2 = new JButton("Alterar");
				Janela abrir = this;
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int linha = table.getSelectedRow();
				Produto c = lista.get(linha);
				
				JanelaAlterar janelaAlterar = new JanelaAlterar(c, abrir);
				janelaAlterar.setVisible(true);
				
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(85)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
					.addGap(126)
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
					.addGap(184)
					.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 964, GroupLayout.PREFERRED_SIZE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(38)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
					.addGap(35)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE))
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

}
