package br.com.victorhugolgr.loja.imposto;

import java.math.BigDecimal;

import br.com.victorhugolgr.loja.orcamento.Orcamento;

public interface Imposto {
	BigDecimal calcular(Orcamento orcamento);
}
