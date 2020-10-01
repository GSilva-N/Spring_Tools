package com.servico.global;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping
public class Controller {
	
	@Autowired
	private ServicoRepository repository;
	
	@GetMapping("/servicos")
	public List<ServicoModel> listaServico(){
		
		return repository.findAll();
	}
	
	@PostMapping("/servicos")
	public ServicoModel criar(@RequestBody ServicoModel model) {
		return repository.save(model);
	}
 	

}