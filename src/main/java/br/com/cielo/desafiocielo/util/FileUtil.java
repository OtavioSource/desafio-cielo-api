package br.com.cielo.desafiocielo.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileUtil {
	
	private static final Logger log = LoggerFactory.getLogger(FileUtil.class);
	
	private static String pathFile = "lancamento-conta-legado.json";
	
	public String getDadosArquivo() {
		
		log.info(" ::getDadosArquivo:: ");
		
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
	    InputStream inputStream = classLoader.getResourceAsStream(pathFile);
	    String data = leituraDoInputStream(inputStream);
	    if(data == null) {
	    	log.error("Não foi possível fazer a leitura do arquivo ou o arquivo não foi encontrado.");
	    	return null;
	    }
	    
	    log.info("Resultado da leitura do arquivo: " + data);
	    
	    return data;
		
	}
	
	private String leituraDoInputStream(InputStream inputStream){
		
		StringBuilder resultStringBuilder = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
			String line;
			while ((line = br.readLine()) != null) {
				resultStringBuilder.append(line).append("\n");
			}
		} catch (IOException e) {
			log.error("Não foi possível ler os dados do arquivo.", e);
		}
		return resultStringBuilder.toString();
	}

}
