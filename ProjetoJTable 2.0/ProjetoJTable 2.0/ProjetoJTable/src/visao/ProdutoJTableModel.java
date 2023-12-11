package visao;
import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import modelo.Produto;

public class ProdutoJTableModel extends AbstractTableModel{

	private ArrayList<Produto> lista;
	private String[] colunas ={"Nome do Produto", "Descrição ", "Marca","Preço","Quantidade em Estoque ","Data de Validade", "Categoria", "Peso","Fornecedor","Codigo do Produto", "Ingredientes", "Alergênicos", "Calorias" };
	
	public ProdutoJTableModel(ArrayList<Produto> lista) {
		this.lista=lista;
	}
	
	@Override
	public int getRowCount() {
		return this.lista.size();
	}

	@Override
	public int getColumnCount() {
		return colunas.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Produto p = lista.get(rowIndex);
		if(columnIndex == 0) {
			return p.getNomedoproduto();
		} else if(columnIndex == 1) {
			return p.getDescricao();
		} else if(columnIndex == 2) {
			return p.getMarca(); 
		}	else if(columnIndex == 3) {
			return p.getPreco(); 
		}	else if(columnIndex == 4) {
			return p.getQuantidade(); 
		}	else if(columnIndex == 5) {
			return p.getDatadevalidade(); 
		}	else if(columnIndex == 6) {
			return p.getCategoria(); 
		}	else if(columnIndex == 7) {
			return p.getPeso(); 
		}	else if(columnIndex == 8) {
			return p.getFornecedor(); 
		}	else if(columnIndex == 9) {
			return p.getCodigo(); 
		}	else if(columnIndex == 10) {	
			return p.getIngredientes(); 
		}	else if(columnIndex == 11) {
			return p.getAlergenicos(); 
		}	else if(columnIndex == 12) {
			return p.getCaloria(); 
		}	else if(columnIndex == 13) {
		}
		return null;
	}
	
	@Override
	public String getColumnName(int column) {
		return colunas[column];
	}


}
