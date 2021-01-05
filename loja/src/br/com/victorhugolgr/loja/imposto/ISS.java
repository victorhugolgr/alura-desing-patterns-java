package br.com.victorhugolgr.loja.imposto;

import java.math.BigDecimal;

import br.com.victorhugolgr.loja.orcamento.Orcamento;

public class ISS extends Imposto {

	public ISS(Imposto outro) {
		super(outro);
	}

	public BigDecimal realizarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.06"));
	}

}
