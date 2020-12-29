package br.com.victorhugolgr.loja.orcamento;

import java.math.BigDecimal;

public class Orcamento {

	private BigDecimal valor;
	
	private int quantidadeIntens;

	public Orcamento(BigDecimal valor, int quantidadeIntens) {
		this.valor = valor;
		this.quantidadeIntens = quantidadeIntens;
	}

	public BigDecimal getValor() {
		return valor;
	}
	
	public int getQuantidadeIntens() {
		return quantidadeIntens;
	}

}
