package br.com.victorhugolgr.loja;

import java.math.BigDecimal;

import br.com.victorhugolgr.loja.desconto.CalculadoraDeDescontos;
import br.com.victorhugolgr.loja.orcamento.Orcamento;

public class TesteDescontos {

	public static void main(String[] args) {
		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();

		Orcamento orcamentoComDesconto = new Orcamento(new BigDecimal("100"), 6);
		System.out.println(calculadora.calcular(orcamentoComDesconto));

		Orcamento orcamentoSemDesconto = new Orcamento(new BigDecimal("100"), 2);
		System.out.println(calculadora.calcular(orcamentoSemDesconto));
		
		Orcamento orcamentoComDescontoDeValor = new Orcamento(new BigDecimal("700"), 1);
		System.out.println(calculadora.calcular(orcamentoComDescontoDeValor));

	}

}
