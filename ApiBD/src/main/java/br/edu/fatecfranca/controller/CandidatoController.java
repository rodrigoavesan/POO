package br.edu.fatecfranca.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fatecfranca.model.CandidatoEntity;
import br.edu.fatecfranca.model.CandidatoRepository;

@RestController //Informa que a classe  controla Rest
@RequestMapping("/api/candidato") //responde nesta rota

public class CandidatoController {

	//Java Spring tem como principal característica a injeção de dependência, que permite um objeto que possa executar métodos sem ser instanciado
	//Consulta
	CandidatoRepository injecao;
	
	@GetMapping
	public List<CandidatoEntity> getCandidatos(){
		return injecao.findAll(); // faz o select
	}
	
	//Inserção
	//Remoção
	//Atualização
}
