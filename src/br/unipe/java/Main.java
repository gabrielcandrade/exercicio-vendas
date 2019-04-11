package br.unipe.java;

public class Main {
	
	public static void main(String[] args) {
		Produto produto = new Produto(10, "Limpo demais", 100, 75, false);
		Vendedor vendedor = new Vendedor("Gabriel", 1, "Rua Vigolvino Wanderley");
		Venda venda = new Venda();
		
		venda.setProduto(produto);
		venda.setVendedor(vendedor);
		venda.setQuantidadeItens(2);
		venda.calcularValor(venda.getQuantidadeItens(), venda.getProduto(), venda.getDesconto());
		venda.calcularComissao(venda.getVendedor(), venda.getProduto(), venda.getQuantidadeItens());
		venda.imprimir(venda);
	}

}
