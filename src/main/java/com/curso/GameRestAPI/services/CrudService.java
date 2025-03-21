package com.curso.GameRestAPI.services;

import com.curso.GameRestAPI.models.Game;
import com.curso.GameRestAPI.repositorys.GameRepo;
import com.curso.GameRestAPI.repositorys.PlayerRepo;
import lombok.RequiredArgsConstructor;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CrudService {

    private final GameRepo gameRepo;
    private final PlayerRepo playerRepo;

    public void insertGame(Game newGame) {
        try {

            gameRepo.save(newGame);
            System.out.println("=== Novo Game +++");
            System.out.println(newGame.toString());
            System.out.println("Salvo com Sucesso!");
            System.out.println("====================");

        } catch (ConstraintViolationException e) {

            System.out.println(e.getMessage());

        }
    }

    public void insertPlayer(Game newPlayer){
            try {

                gameRepo.save(newPlayer);
                System.out.println("=== Novo Player +++");
                System.out.println(newPlayer.toString());
                System.out.println("Salvo com Sucesso!");
                System.out.println("====================");

            } catch (ConstraintViolationException e) {

                System.out.println(e.getMessage());

            }

        }
}
