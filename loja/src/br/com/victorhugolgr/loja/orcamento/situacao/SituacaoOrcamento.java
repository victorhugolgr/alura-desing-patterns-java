package br.com.victorhugolgr.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.victorhugolgr.loja.DamainException;
import br.com.victorhugolgr.loja.orcamento.Orcamento;

public abstract class SituacaoOrcamento {
	
	public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

	public void aprovar(Orcamento orcamento) {
		throw new DamainException("Orçamento não pode ser aprovado!");
	}
	
	public void reprovar(Orcamento orcamento) {
		throw new DamainException("Orçamento não pode ser reprovado!");
	}
	
	public void finalizar(Orcamento orcamento) {
		throw new DamainException("Orçamento não pode ser finalizado!");
	}
}
