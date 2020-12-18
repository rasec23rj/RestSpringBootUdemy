package br.com.juliocesar.restwithspringudemy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.juliocesar.restwithspringudemy.model.PessoaModel;
import br.com.juliocesar.restwithspringudemy.services.PessoaService;

@RestController
@RequestMapping("/pessoa")
@ResponseBody
public class PessoaController {

	@Autowired
	private PessoaService pessoaService;

	@RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<PessoaModel> findAll() {
		return pessoaService.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public PessoaModel findById(@PathVariable("id") String id) {
		return pessoaService.findById(id);
	}
	
	
	@RequestMapping(value = "", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public PessoaModel create(@RequestBody PessoaModel pessoaModel) {
		return pessoaService.create(pessoaModel);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public PessoaModel update(@RequestBody PessoaModel pessoaModel) {
		return pessoaService.update(pessoaModel);
	}
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public int delete(@PathVariable("id") int id) {
		return pessoaService.delete(id);
	}
	
}
