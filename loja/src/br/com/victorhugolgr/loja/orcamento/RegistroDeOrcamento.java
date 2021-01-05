
package br.com.victorhugolgr.loja.orcamento;

import java.util.HashMap;
import java.util.Map;

import br.com.victorhugolgr.loja.DomainException;
import br.com.victorhugolgr.loja.http.HttpAdapter;

public class RegistroDeOrcamento {
	
	public HttpAdapter http;

	public RegistroDeOrcamento(HttpAdapter http) {
		this.http = http;
	}

	public void registrar(Orcamento orcamento) {
		if(!orcamento.isFinalizado()) {
			throw new DomainException("Orcamento não finalizado!");
		}
		String url = "http://apt.externa/orcamento";
		Map<String, Object> dados = new HashMap<String, Object>();
		dados.put("valor", orcamento.getValor());
		dados.put("quantidade", orcamento.getQuantidadeItens());
		http.post(url, dados);
	}
}
