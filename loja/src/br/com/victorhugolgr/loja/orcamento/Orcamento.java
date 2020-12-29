package br.com.victorhugolgr.loja.orcamento;

import java.math.BigDecimal;

public class Orcamento {

	private BigDecimal valor;
	
	private int quantidadeItens;

	public Orcamento(BigDecimal valor, int quantidadeIntens) {
		this.valor = valor;
		this.quantidadeItens = quantidadeIntens;
	}

	public BigDecimal getValor() {
		return valor;
	}
	
	public int getQuantidadeItens() {
		return quantidadeItens;
	}

}
