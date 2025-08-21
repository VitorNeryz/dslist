package br.com.nery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.nery.entities.Game;

public interface GameRepository extends JpaRepository<Game,Long>{
	
}
