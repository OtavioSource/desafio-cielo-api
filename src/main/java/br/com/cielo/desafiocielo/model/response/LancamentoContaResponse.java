package br.com.cielo.desafiocielo.model.response;

public class LancamentoContaResponse {
	
	private String dataLancamento;
	private String descricao;
	private Long numero;
	private String situacao;
	private String dataConfirmacao;
	private String dadosBancarios;
	private Double valorFinal;
	
	public String getDataLancamento() {
		return dataLancamento;
	}
	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public String getDataConfirmacao() {
		return dataConfirmacao;
	}
	public void setDataConfirmacao(String dataConfirmacao) {
		this.dataConfirmacao = dataConfirmacao;
	}
	public String getDadosBancarios() {
		return dadosBancarios;
	}
	public void setDadosBancarios(String dadosBancarios) {
		this.dadosBancarios = dadosBancarios;
	}
	public Double getValorFinal() {
		return valorFinal;
	}
	public void setValorFinal(Double valorFinal) {
		this.valorFinal = valorFinal;
	}
	
	@Override
	public String toString() {
		return "LancamentoContaResponse [dataLancamento=" + dataLancamento + ", descricao=" + descricao + ", numero="
				+ numero + ", situacao=" + situacao + ", dataConfirmacao=" + dataConfirmacao + ", dadosBancarios="
				+ dadosBancarios + ", valorFinal=" + valorFinal + "]";
	}
	
	

}
