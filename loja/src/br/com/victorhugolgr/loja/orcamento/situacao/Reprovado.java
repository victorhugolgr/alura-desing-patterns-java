package br.com.victorhugolgr.loja.orcamento.situacao;

import br.com.victorhugolgr.loja.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {

	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}

}
