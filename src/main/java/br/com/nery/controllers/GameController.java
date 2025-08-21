package br.com.nery.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.nery.DTO.GameMinDTO;
import br.com.nery.services.GameService;
import lombok.NoArgsConstructor;

@RestController
@RequestMapping(path = "/games")
@NoArgsConstructor
public class GameController {
	
	private GameService service;
	
	@Autowired
	public GameController(GameService service) {
		this.service = service;
	}
	
	@GetMapping
	List<GameMinDTO> findAll(){
		return service.findAll();
	}
}
