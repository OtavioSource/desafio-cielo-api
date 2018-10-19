package br.com.cielo.desafiocielo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "numeroRemessaBanco", "nomeSituacaoRemessa", "dadosDomicilioBancario", "nomeTipoOperacao",
		"dadosAnaliticoLancamentoFinanceiroCliente" })
public class LancamentoContaCorrenteCliente {

	@JsonProperty("numeroRemessaBanco")
	private Long numeroRemessaBanco;
	@JsonProperty("nomeSituacaoRemessa")
	private String nomeSituacaoRemessa;
	@JsonProperty("dadosDomicilioBancario")
	private DadosDomicilioBancario dadosDomicilioBancario;
	@JsonProperty("nomeTipoOperacao")
	private String nomeTipoOperacao;
	@JsonProperty("dadosAnaliticoLancamentoFinanceiroCliente")
	private List<Object> dadosAnaliticoLancamentoFinanceiroCliente = null;

	@JsonProperty("numeroRemessaBanco")
	public Long getNumeroRemessaBanco() {
		return numeroRemessaBanco;
	}

	@JsonProperty("numeroRemessaBanco")
	public void setNumeroRemessaBanco(Long numeroRemessaBanco) {
		this.numeroRemessaBanco = numeroRemessaBanco;
	}

	@JsonProperty("nomeSituacaoRemessa")
	public String getNomeSituacaoRemessa() {
		return nomeSituacaoRemessa;
	}

	@JsonProperty("nomeSituacaoRemessa")
	public void setNomeSituacaoRemessa(String nomeSituacaoRemessa) {
		this.nomeSituacaoRemessa = nomeSituacaoRemessa;
	}

	@JsonProperty("dadosDomicilioBancario")
	public DadosDomicilioBancario getDadosDomicilioBancario() {
		return dadosDomicilioBancario;
	}

	@JsonProperty("dadosDomicilioBancario")
	public void setDadosDomicilioBancario(DadosDomicilioBancario dadosDomicilioBancario) {
		this.dadosDomicilioBancario = dadosDomicilioBancario;
	}

	@JsonProperty("nomeTipoOperacao")
	public String getNomeTipoOperacao() {
		return nomeTipoOperacao;
	}

	@JsonProperty("nomeTipoOperacao")
	public void setNomeTipoOperacao(String nomeTipoOperacao) {
		this.nomeTipoOperacao = nomeTipoOperacao;
	}

	@JsonProperty("dadosAnaliticoLancamentoFinanceiroCliente")
	public List<Object> getDadosAnaliticoLancamentoFinanceiroCliente() {
		return dadosAnaliticoLancamentoFinanceiroCliente;
	}

	@JsonProperty("dadosAnaliticoLancamentoFinanceiroCliente")
	public void setDadosAnaliticoLancamentoFinanceiroCliente(List<Object> dadosAnaliticoLancamentoFinanceiroCliente) {
		this.dadosAnaliticoLancamentoFinanceiroCliente = dadosAnaliticoLancamentoFinanceiroCliente;
	}

}