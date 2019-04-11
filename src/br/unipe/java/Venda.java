package br.unipe.java;

public class Venda {
	
	private Produto produto;
	private Vendedor vendedor;
	private float desconto;
	private int quantidadeItens;
	private float valor;
	
	//Getters and Setters
	public Produto getProduto() {
		return produto;
	}
	public Vendedor getVendedor() {
		return vendedor;
	}
	public float getDesconto() {
		return desconto;
	}
	public int getQuantidadeItens() {
		return quantidadeItens;
	}
	public float getValor() {
		return valor;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}
	public void setQuantidadeItens(int quantidadeItens) {
		this.quantidadeItens = quantidadeItens;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public float calcularValor(int quantidadeItens, Produto produto, float desconto) {
		this.valor = (produto.getValorVenda() * quantidadeItens) * (desconto/(float)(100));
		return this.valor;
	}
	
	public float calcularComissao(Vendedor vendedor, Produto produto, int quantidade) {
		float resultado = (vendedor.getComissao()/100) * (produto.getValorVenda() * quantidade);
		if (produto.isPromocao() == true) {
			resultado = resultado / 2;
		}
		return resultado;
	}
	
	public float efetuarDesconto(float desconto, Produto produto) {
		float valorDescontado = produto.getValorVenda() * (desconto/(float)(100));
		if (valorDescontado < produto.getValorCusto()) {
			System.out.println("Desconto no produto maior que o permitido pelo sistema.");
			valorDescontado = produto.getValorCusto();
		}
		return valorDescontado;
	}
	
	// Construindo
	public void imprimir(Venda venda) {
		System.out.println("Dados do vendedor:");
		System.out.println();
		System.out.println("Codigo: " + venda.getVendedor().getCodigo());
		System.out.println("Nome: " + venda.getVendedor().getNome());
		System.out.println("Commisao da venda: " + venda.calcularComissao(getVendedor(), getProduto(), getQuantidadeItens()));
		System.out.println("Quantidade de itens vendidos: " + venda.getQuantidadeItens());
		System.out.println();
		System.out.println("Dados do produto: ");
		System.out.println();
		System.out.println("Codigo: " + venda.getProduto().getCodigo());
		System.out.println("Descricao: " + venda.getProduto().getDescricao());
		System.out.println("Valor da venda do produto: " + venda.getProduto().getValorVenda());
		System.out.println("Promocao? " + venda.getProduto().isPromocao());
		System.out.println("Desconto sobre produto: " + venda.efetuarDesconto(getDesconto(), getProduto()));
		System.out.println();
		System.out.println("Dados da venda: ");
		System.out.println();
		System.out.println("Valor da venda: " + venda.calcularValor(getQuantidadeItens(), getProduto(), getDesconto()));
	}
}
