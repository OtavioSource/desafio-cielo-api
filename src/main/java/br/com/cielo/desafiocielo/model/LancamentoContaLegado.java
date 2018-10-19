package br.com.cielo.desafiocielo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "totalControleLancamento", "listaControleLancamento", "indice", "tamanhoPagina", "totalElements" })
public class LancamentoContaLegado {

	@JsonProperty("totalControleLancamento")
	private TotalControleLancamento totalControleLancamento;
	@JsonProperty("listaControleLancamento")
	private List<ListaControleLancamento> listaControleLancamento = null;
	@JsonProperty("indice")
	private Integer indice;
	@JsonProperty("tamanhoPagina")
	private Integer tamanhoPagina;
	@JsonProperty("totalElements")
	private Integer totalElements;

	@JsonProperty("totalControleLancamento")
	public TotalControleLancamento getTotalControleLancamento() {
		return totalControleLancamento;
	}

	@JsonProperty("totalControleLancamento")
	public void setTotalControleLancamento(TotalControleLancamento totalControleLancamento) {
		this.totalControleLancamento = totalControleLancamento;
	}

	@JsonProperty("listaControleLancamento")
	public List<ListaControleLancamento> getListaControleLancamento() {
		return listaControleLancamento;
	}

	@JsonProperty("listaControleLancamento")
	public void setListaControleLancamento(List<ListaControleLancamento> listaControleLancamento) {
		this.listaControleLancamento = listaControleLancamento;
	}

	@JsonProperty("indice")
	public Integer getIndice() {
		return indice;
	}

	@JsonProperty("indice")
	public void setIndice(Integer indice) {
		this.indice = indice;
	}

	@JsonProperty("tamanhoPagina")
	public Integer getTamanhoPagina() {
		return tamanhoPagina;
	}

	@JsonProperty("tamanhoPagina")
	public void setTamanhoPagina(Integer tamanhoPagina) {
		this.tamanhoPagina = tamanhoPagina;
	}

	@JsonProperty("totalElements")
	public Integer getTotalElements() {
		return totalElements;
	}

	@JsonProperty("totalElements")
	public void setTotalElements(Integer totalElements) {
		this.totalElements = totalElements;
	}

}