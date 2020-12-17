package br.com.juliocesar.restwithspringudemy.services;

import java.util.ArrayList;
import java.util.List;
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
	
	public List<PessoaModel> findAll(){
		List<PessoaModel> pessoaModel = new ArrayList<PessoaModel>();
		for (int i = 0; i < 8; i++) {
			PessoaModel pessoaModel2 = mockPessoa(i);
			pessoaModel.add(pessoaModel2);
			
		}
		
		return pessoaModel;
	}

	private PessoaModel mockPessoa(int i) {
		PessoaModel pessoaModel = new PessoaModel(counter.incrementAndGet(), "Frist name " + i, "Last name "  + i, "Some Addrres" + i, "M" + i);
		return pessoaModel;
	}
	
	
}
