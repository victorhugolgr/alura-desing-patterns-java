package br.com.victorhugolgr.loja.imposto;

import java.math.BigDecimal;

import br.com.victorhugolgr.loja.orcamento.Orcamento;

public class CalculadoraDeImpostos {

	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
	}
}
