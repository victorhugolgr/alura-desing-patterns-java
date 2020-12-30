package br.com.victorhugolgr.loja.pedido.acao;

import br.com.victorhugolgr.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {

	public void executar(Pedido pedido) {
		System.out.println("Enviando email com dados do pedido!");
	}
}
