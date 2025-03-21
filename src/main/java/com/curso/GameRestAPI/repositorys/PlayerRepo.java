package com.curso.GameRestAPI.repositorys;

import com.curso.GameRestAPI.models.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepo extends CrudRepository<Player, Integer> {
}
