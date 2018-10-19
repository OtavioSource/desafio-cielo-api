package br.com.cielo.desafiocielo.service;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.cielo.desafiocielo.builder.BuilderResponse;
import br.com.cielo.desafiocielo.model.LancamentoContaLegado;
import br.com.cielo.desafiocielo.model.response.LancamentoContaResponse;
import br.com.cielo.desafiocielo.util.FileUtil;

@Service
public class LancamentoContaService {
	
	private static final Logger log = LoggerFactory.getLogger(LancamentoContaService.class);
	
	public List<LancamentoContaResponse> getInformacoesLancamento() {
		
		FileUtil fileUtil = new FileUtil();
		String dados = fileUtil.getDadosArquivo();
		
		if(dados == null) {
			log.info("Problema ao retornar os dados da leitura do arquivo.");
			return null;
		}
		
		ObjectMapper objectMapper = new ObjectMapper();
		LancamentoContaLegado lancamentoConta = new LancamentoContaLegado();
		
		try {
			
			lancamentoConta = objectMapper.readValue(dados, LancamentoContaLegado.class);
			
		} catch (JsonParseException e) {
			log.error("JsonParseException ", e);
		} catch (JsonMappingException e) {
			log.error("JsonMappingException ", e);
		} catch (IOException e) {
			log.error("IOException ", e);
		}
		
		List<LancamentoContaResponse> lancamentosContaResponse = BuilderResponse.formataResponse(lancamentoConta.getListaControleLancamento());
		
		return lancamentosContaResponse;
		
		
	}

}
