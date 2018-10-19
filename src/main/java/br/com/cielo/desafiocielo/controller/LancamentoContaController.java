package br.com.cielo.desafiocielo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
		
		log.info("Resultado da API: " + lancamentoContaService.getInformacoesLancamento());
		
        return ResponseEntity.ok(lancamentoContaService.getInformacoesLancamento());
    }
}
