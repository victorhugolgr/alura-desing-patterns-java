package br.com.victorhugolgr.loja;

import java.math.BigDecimal;

import br.com.victorhugolgr.loja.desconto.CalculadoraDeDescontos;
import br.com.victorhugolgr.loja.orcamento.ItemOrcamento;
import br.com.victorhugolgr.loja.orcamento.Orcamento;

public class TesteDescontos {

	public static void main(String[] args) {
		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();

		Orcamento orcamentoComDesconto = new Orcamento();
		orcamentoComDesconto.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
		System.out.println(calculadora.calcular(orcamentoComDesconto));

		Orcamento orcamentoSemDesconto = new Orcamento();
		orcamentoSemDesconto.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
		System.out.println(calculadora.calcular(orcamentoSemDesconto));
		
		Orcamento orcamentoComDescontoDeValor = new Orcamento();
		orcamentoComDescontoDeValor.adicionarItem(new ItemOrcamento(new BigDecimal("700")));
		System.out.println(calculadora.calcular(orcamentoComDescontoDeValor));

	}

}
