package br.unipe.java;

public class Vendedor {
	
	private String nome;
	private int codigo;
	private float comissao; // Em porcentagem
	private String endereco;
	
	//Constructor
	public Vendedor(String nome, int codigo, String endereco) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.endereco = endereco;
	}
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public float getComissao() {
		return comissao;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
