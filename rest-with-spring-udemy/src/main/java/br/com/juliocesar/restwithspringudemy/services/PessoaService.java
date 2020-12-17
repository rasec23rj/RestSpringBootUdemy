package br.com.juliocesar.restwithspringudemy.services;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.com.juliocesar.restwithspringudemy.model.PessoaModel;

@Service
public class PessoaService {

	
	private final AtomicLong counter = new AtomicLong();
	
	public PessoaModel findById(String id) {
		
		PessoaModel pessoaModel = new PessoaModel(counter.incrementAndGet(), "Julio", "Cesar", "Rio de Jnaeiro", "M");
	    return pessoaModel;
	}
	
	
}
