package br.com.cielo.desafiocielo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cielo.desafiocielo.model.response.LancamentoContaResponse;
import br.com.cielo.desafiocielo.service.LancamentoContaService;

@RestController
@RequestMapping("/api")
public class LancamentoContaController {
	
	private static final Logger log = LoggerFactory.getLogger(LancamentoContaController.class);
	
	@Autowired
	private LancamentoContaService lancamentoContaService;
	
	
	@RequestMapping("/lista-lancamentos")
    public ResponseEntity<List<LancamentoContaResponse>> montarInformacoesLancamento() {
		
		List<LancamentoContaResponse> listaLancamentoContaResponse = lancamentoContaService.getInformacoesLancamento();
		
		if(listaLancamentoContaResponse == null) {
			return new ResponseEntity<List<LancamentoContaResponse>>(listaLancamentoContaResponse, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		log.info("Resultado da API: " + listaLancamentoContaResponse);
		return new ResponseEntity<List<LancamentoContaResponse>>(listaLancamentoContaResponse, HttpStatus.OK);
    }
}
