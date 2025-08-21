package br.com.nery.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.nery.DTO.GameMinDTO;
import br.com.nery.entities.Game;
import br.com.nery.repositories.GameRepository;

@Service
public class GameService {
	
	private GameRepository repository;
	
	public GameService(GameRepository repository) {
		this.repository = repository;
	}
	
	public List<GameMinDTO> findAll(){
		List<Game> result = repository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
	
}
