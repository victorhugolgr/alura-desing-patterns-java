package br.com.victorhugolgr.loja.pedido;

import java.time.LocalDateTime;

import br.com.victorhugolgr.loja.orcamento.Orcamento;

public class GeraPedidoHandler {

	//contrutor com injecao de pependecias: repository, service, etc.
	
	public void execute(GeraPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
		Pedido pedido =  new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
		
		System.out.println("Minha lógica de negócio que se utiliza dos dados vindo via injecao, por exemplo.");
	}
}
