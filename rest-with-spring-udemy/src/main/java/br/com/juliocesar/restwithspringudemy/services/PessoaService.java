package br.com.juliocesar.restwithspringudemy.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.juliocesar.restwithspringudemy.exeption.ResourceNotFoundException;
import br.com.juliocesar.restwithspringudemy.model.PessoaModel;
import br.com.juliocesar.restwithspringudemy.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	PessoaRepository pessoaRepository;

	public PessoaModel findbyId(Long id) {
	
		return pessoaRepository.findById(id).orElseThrow( () -> new ResourceNotFoundException("sem id"));
		
	}

	public List<PessoaModel> findAll() {
		return pessoaRepository.findAll();
	}

	public PessoaModel create(PessoaModel pessoaModel) {
		
		return pessoaRepository.save(pessoaModel);
	}
	
	public PessoaModel update(PessoaModel pessoaModel) {
		PessoaModel entity = pessoaRepository.findById(pessoaModel.getId()).orElseThrow( () -> new ResourceNotFoundException("sem id"));
		return pessoaRepository.save(entity);
	}

	// public PessoaModel delete(Long id) {
	// 	return pessoaRepository.deleteById(id).orElseThrow();
	// }
}
