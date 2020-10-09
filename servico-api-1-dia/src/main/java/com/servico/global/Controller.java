package com.servico.global;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
	
	@Autowired
	private ServicoRepository repository;
	
	@GetMapping("/servicos")
	public List<ServicoModel> listaServico(){
		
		return repository.findAll();
	}
	
	@GetMapping("/servicos/nome/{nome}")
	public List<ServicoModel> buscarPorNome(@PathVariable String nome){
		return repository.findByNome(nome);
	}
	
	@PutMapping("/servicos/{id}")
	public ServicoModel atualizar(@PathVariable Long id, @RequestBody ServicoModel model) {
		model.setId(id);
		return repository.save(model);
	}
	
	@PostMapping("/servicos")
	public ServicoModel criar(@RequestBody ServicoModel model) {
		return repository.save(model);
	}
	
	@DeleteMapping("/servicos/{id}")
	public String remover(@PathVariable Long id) {
		repository.deleteById(id);
		return "Deletado com sucesso!";
	}
 	
}
