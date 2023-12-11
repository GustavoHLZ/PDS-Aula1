package modelo;

import java.time.LocalDate;

public class Produto {
	
	private String Nomedoproduto;
	private String Descricao;
	private String Marca;
	private float Preco;
	private int Quantidade;
	private LocalDate Datadevalidade;
	private String Categoria;
	private float Peso;
	private String Fornecedor;
	private int Codigo;
	private String Ingredientes;
	private String Alergenicos;
	private float Caloria;
	public String getNomedoproduto() {
		return Nomedoproduto;
	}
	public void setNomedoproduto(String nomedoproduto) {
		Nomedoproduto = nomedoproduto;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public float getPreco() {
		return Preco;
	}
	public void setPreco(float preco) {
		Preco = preco;
	}
	public int getQuantidade() {
		return Quantidade;
	}
	public void setQuantidade(int quantidade) {
		Quantidade = quantidade;
	}
	
	public LocalDate getDatadevalidade() {
		return Datadevalidade;
	}
	public void setDatadevalidade(LocalDate datadevalidade) {
		Datadevalidade = datadevalidade;
	}
	public String getCategoria() {
		return Categoria;
	}
	public void setCategoria(String categoria) {
		Categoria = categoria;
	}
	public float getPeso() {
		return Peso;
	}
	public void setPeso(float peso) {
		Peso = peso;
	}
	public String getFornecedor() {
		return Fornecedor;
	}
	public void setFornecedor(String fornecedor) {
		Fornecedor = fornecedor;
	}
	public int getCodigo() {
		return Codigo;
	}
	public void setCodigo(int codigo) {
		Codigo = codigo;
	}
	public String getIngredientes() {
		return Ingredientes;
	}
	public void setIngredientes(String ingredientes) {
		Ingredientes = ingredientes;
	}
	public String getAlergenicos() {
		return Alergenicos;
	}
	public void setAlergenicos(String alergenicos) {
		Alergenicos = alergenicos;
	}
	public float getCaloria() {
		return Caloria;
	}
	public void setCaloria(Float calorias) {
		Caloria = calorias;
	}


	

}
