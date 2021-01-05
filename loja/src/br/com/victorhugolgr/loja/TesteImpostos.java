package br.com.victorhugolgr.loja;

import java.math.BigDecimal;

import br.com.victorhugolgr.loja.imposto.CalculadoraDeImpostos;
import br.com.victorhugolgr.loja.imposto.ICMS;
import br.com.victorhugolgr.loja.imposto.ISS;
import br.com.victorhugolgr.loja.orcamento.ItemOrcamento;
import br.com.victorhugolgr.loja.orcamento.Orcamento;

public class TesteImpostos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		
		System.out.println(calculadora.calcular(orcamento, new ICMS(null)));
		System.out.println(calculadora.calcular(orcamento, new ISS(null)));

	}

}
