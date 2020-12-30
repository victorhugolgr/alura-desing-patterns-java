package br.com.victorhugolgr.loja;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.victorhugolgr.loja.pedido.GeraPedido;
import br.com.victorhugolgr.loja.pedido.GeraPedidoHandler;
import br.com.victorhugolgr.loja.pedido.acao.EnviarEmailPedido;
import br.com.victorhugolgr.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

public class TestesPedidos {

	public static void main(String[] args) {
		String cliente = "Victor Hugo";
		BigDecimal valorOrcamento = new BigDecimal("600");
		int quantidadeItens = 4;

		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(
				Arrays.asList(new SalvarPedidoNoBancoDeDados(), new EnviarEmailPedido()));
		handler.execute(gerador);
	}

}
