package br.unipe.java;

public class Produto {
	
	private int codigo;
	private String descricao;
	private float valorVenda;
	private float valorCusto;
	private boolean promocao;
	
	//Constructor
	public Produto(int codigo, String descricao, int valorVenda, int valorCusto, boolean promocao) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.valorVenda = valorVenda;
		this.valorCusto = valorCusto;
		this.promocao = promocao;
	}

	public int getCodigo() {
		return codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public float getValorVenda() {
		return valorVenda;
	}
	public float getValorCusto() {
		return valorCusto;
	}
	public boolean isPromocao() {
		return promocao;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}
	public void setValorCusto(float valorCusto) {
		this.valorCusto = valorCusto;
	}
	public void setPromocao(boolean promocao) {
		this.promocao = promocao;
	}
}
