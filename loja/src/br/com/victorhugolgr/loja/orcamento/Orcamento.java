package br.com.victorhugolgr.loja.orcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.victorhugolgr.loja.orcamento.situacao.EmAnalise;
import br.com.victorhugolgr.loja.orcamento.situacao.Finalizado;
import br.com.victorhugolgr.loja.orcamento.situacao.SituacaoOrcamento;

public class Orcamento {

	private BigDecimal valor;
	private SituacaoOrcamento situacao;
	private List<ItemOrcamento> itens;
	
	public Orcamento() {
		this.valor =  BigDecimal.ZERO;
		this.itens = new ArrayList<ItemOrcamento>();
		this.situacao = new EmAnalise();
	}
	
	public void aplicarDescontoExtra() {
		BigDecimal valorDoDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
		this.valor = this.valor.subtract(valorDoDescontoExtra);
	}
	
	public void aprovar() {
		this.situacao.aprovar(this);
	}
	
	public void reprovar() {
		this.situacao.reprovar(this);
	}
	
	public void finalizar() {
		this.situacao.finalizar(this);
	}

	public BigDecimal getValor() {
		return valor;
	}
	
	public int getQuantidadeItens() {
		return itens.size();
	}
	
	public SituacaoOrcamento getSituacao() {
		return situacao;
	}
	
	public void setSituacao(SituacaoOrcamento situacao) {
		this.situacao = situacao;
	}

	public boolean isFinalizado() {
		return situacao instanceof Finalizado;
	}
	
	public void adicionarItem(ItemOrcamento item) {
		this.valor = valor.add(item.getValor());
		this.itens.add(item);
	}
}
