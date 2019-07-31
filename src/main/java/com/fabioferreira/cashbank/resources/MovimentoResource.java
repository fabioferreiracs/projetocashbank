package com.fabioferreira.cashbank.resources;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fabioferreira.cashbank.models.Movimento;
import com.fabioferreira.cashbank.repository.MovimentoRepository;

@RestController
@RequestMapping("/movimento")
public class MovimentoResource {
	
	@Autowired
	private MovimentoRepository mr;
	
	
	@GetMapping(produces = "application/json")
	public @ResponseBody Iterable<Movimento> listaMovimentos() {
		Iterable<Movimento> listaMovimentos = mr.findAll();
		return listaMovimentos;
		
	}
	
	@PostMapping()
	public Movimento insereMovimento(@RequestBody @Valid Movimento movimento) {
		return mr.save(movimento);
		
	}
	
	@DeleteMapping()
	public Movimento deletaMovimento(@RequestBody Movimento movimento) {
		mr.delete(movimento);
		return  movimento;
	}

}
