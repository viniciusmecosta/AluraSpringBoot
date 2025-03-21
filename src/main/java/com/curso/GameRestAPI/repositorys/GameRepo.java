package com.curso.GameRestAPI.repositorys;

import com.curso.GameRestAPI.models.Game;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepo extends CrudRepository<Game, Integer> {


}
