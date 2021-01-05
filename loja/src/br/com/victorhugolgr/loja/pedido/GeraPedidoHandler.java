package br.com.victorhugolgr.loja.pedido;

import java.time.LocalDateTime;
import java.util.List;

import br.com.victorhugolgr.loja.orcamento.ItemOrcamento;
import br.com.victorhugolgr.loja.orcamento.Orcamento;
import br.com.victorhugolgr.loja.pedido.acao.AcaoAposGerarPedido;

public class GeraPedidoHandler {

	private List<AcaoAposGerarPedido> acoes;
	
	public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
		this.acoes = acoes;
	}

	public void execute(GeraPedido dados) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(dados.getValorOrcamento()));
		Pedido pedido =  new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
		
		acoes.forEach(acao-> acao.executar(pedido));
	}
}
