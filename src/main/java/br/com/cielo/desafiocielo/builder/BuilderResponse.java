package br.com.cielo.desafiocielo.builder;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.cielo.desafiocielo.model.ListaControleLancamento;
import br.com.cielo.desafiocielo.model.response.LancamentoContaResponse;

public class BuilderResponse {
	
	private static final Logger log = LoggerFactory.getLogger(BuilderResponse.class);

	public static List<LancamentoContaResponse> formataResponse(List<ListaControleLancamento> listaControleLancamento) {
		
		log.info(" ::formataResponse::");
		
		List<LancamentoContaResponse> listaLancamentoContaResponse = new ArrayList<>();
		
		listaControleLancamento.forEach(lancamento -> {
			LancamentoContaResponse lancamentoContaResponse = new LancamentoContaResponse();
			lancamentoContaResponse.setDadosBancarios(formataDadosBancarios(lancamento));
			lancamentoContaResponse.setDataConfirmacao(lancamento.getDataEfetivaLancamento());
			lancamentoContaResponse.setDataLancamento(lancamento.getDataLancamentoContaCorrenteCliente());
			lancamentoContaResponse.setDescricao(lancamento.getLancamentoContaCorrenteCliente().getNomeTipoOperacao());
			lancamentoContaResponse.setNumero(lancamento.getLancamentoContaCorrenteCliente().getNumeroRemessaBanco());
			lancamentoContaResponse.setSituacao(lancamento.getLancamentoContaCorrenteCliente().getNomeSituacaoRemessa());
			lancamentoContaResponse.setValorFinal(Double.valueOf(lancamento.getValorLancamentoRemessa()));
			
			listaLancamentoContaResponse.add(lancamentoContaResponse);
		});
		
		log.info("Resultado do formataResponse: " + listaLancamentoContaResponse);
		
		return listaLancamentoContaResponse;
	}

	private static String formataDadosBancarios(ListaControleLancamento lancamento) {
		
		log.info("::formataDadosBancarios::");
		StringBuilder dadosBancarios = new StringBuilder();
		
		dadosBancarios.append(lancamento.getNomeBanco().trim());
		dadosBancarios.append(" Ag ");
		
		if(lancamento.getLancamentoContaCorrenteCliente() != null && lancamento.getLancamentoContaCorrenteCliente().getDadosDomicilioBancario() != null) {
			dadosBancarios.append(lancamento.getLancamentoContaCorrenteCliente().getDadosDomicilioBancario().getNumeroAgencia());
			dadosBancarios.append(" CC ");
			dadosBancarios.append(lancamento.getLancamentoContaCorrenteCliente().getDadosDomicilioBancario().getNumeroContaCorrente());
		}
		
		log.info("Resultado do formataDadosBancarios: " + dadosBancarios.toString());
		
		return dadosBancarios.toString();
	}

}
