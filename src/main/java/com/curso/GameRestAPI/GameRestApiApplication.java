package com.curso.GameRestAPI;

import com.curso.GameRestAPI.models.Game;
import com.curso.GameRestAPI.models.Player;
import com.curso.GameRestAPI.services.CrudService;
import jakarta.annotation.Nonnull;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Year;

@SpringBootApplication
@RequiredArgsConstructor
public class GameRestApiApplication {

	@Nonnull
	private static CrudService crudService;

	public static void main(String[] args) {

		SpringApplication.run(GameRestApiApplication.class, args);

		Game game1 = new Game("Super Mario Bros", "Nintendo", "Plataforma", Year.of(1985));
		crudService.insertGame(game1);

		Game game2 = new Game("Enduro", "Activision", "Corrida", Year.of(1983));
		crudService.insertGame(game2);


	}

}
