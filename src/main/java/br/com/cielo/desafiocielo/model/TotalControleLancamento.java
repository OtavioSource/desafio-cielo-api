package br.com.cielo.desafiocielo.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "quantidadeLancamentos", "quantidadeRemessas", "valorLancamentos" })
public class TotalControleLancamento {

	@JsonProperty("quantidadeLancamentos")
	private Integer quantidadeLancamentos;
	@JsonProperty("quantidadeRemessas")
	private Integer quantidadeRemessas;
	@JsonProperty("valorLancamentos")
	private Double valorLancamentos;

	@JsonProperty("quantidadeLancamentos")
	public Integer getQuantidadeLancamentos() {
		return quantidadeLancamentos;
	}

	@JsonProperty("quantidadeLancamentos")
	public void setQuantidadeLancamentos(Integer quantidadeLancamentos) {
		this.quantidadeLancamentos = quantidadeLancamentos;
	}

	@JsonProperty("quantidadeRemessas")
	public Integer getQuantidadeRemessas() {
		return quantidadeRemessas;
	}

	@JsonProperty("quantidadeRemessas")
	public void setQuantidadeRemessas(Integer quantidadeRemessas) {
		this.quantidadeRemessas = quantidadeRemessas;
	}

	@JsonProperty("valorLancamentos")
	public Double getValorLancamentos() {
		return valorLancamentos;
	}

	@JsonProperty("valorLancamentos")
	public void setValorLancamentos(Double valorLancamentos) {
		this.valorLancamentos = valorLancamentos;
	}

}