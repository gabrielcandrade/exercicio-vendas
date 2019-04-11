package br.unipe.java;

import java.io.ObjectInputStream.GetField;

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
		
		Produto produto2 = new Produto(30, "Melhor descricao que ja existiu", 100, 80, true);
		Vendedor vendedor2 = new Vendedor("Fujioka", 2, "Vanja Viana Sales");
		Venda venda2 = new Venda();
		
		venda2.setProduto(produto2);
		venda2.setVendedor(vendedor2);
		venda2.setQuantidadeItens(3);
		venda2.efetuarDesconto(10, venda2.getProduto());
		venda2.calcularValor(venda2.getQuantidadeItens(), venda2.getProduto(), venda2.getDesconto());
		venda2.calcularComissao(venda2.getVendedor(), venda2.getProduto(), venda2.getQuantidadeItens());
		venda2.imprimir(venda2);
		
		Venda venda3 = new Venda();
		
		venda3.setProduto(produto2);
		venda3.setVendedor(vendedor2);
		venda3.setQuantidadeItens(2);
		venda3.setDesconto(30);
		venda3.calcularValor(venda3.getQuantidadeItens(), venda3.getProduto(), venda3.getDesconto());
		venda3.calcularComissao(venda3.getVendedor(), venda3.getProduto(), venda3.getQuantidadeItens());
		venda3.imprimir(venda3);
	}

}
