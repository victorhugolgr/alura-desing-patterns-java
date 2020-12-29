package br.com.victorhugolgr.loja;

import java.math.BigDecimal;

import br.com.victorhugolgr.loja.imposto.CalculadoraDeImpostos;
import br.com.victorhugolgr.loja.imposto.TipoImposto;
import br.com.victorhugolgr.loja.orcamento.Orcamento;

public class TesteImpostos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("100"));
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		
		System.out.println(calculadora.calcular(orcamento, TipoImposto.ISS));

	}

}
