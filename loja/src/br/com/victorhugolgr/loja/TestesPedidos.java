package br.com.victorhugolgr.loja;

import java.math.BigDecimal;

import br.com.victorhugolgr.loja.pedido.GeraPedido;
import br.com.victorhugolgr.loja.pedido.GeraPedidoHandler;

public class TestesPedidos {

	public static void main(String[] args) {
		String cliente = "Victor Hugo";
		BigDecimal valorOrcamento = new BigDecimal("600");
		int quantidadeItens = 4;
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(/*depencias*/);
		handler.execute(gerador);
	}

}
