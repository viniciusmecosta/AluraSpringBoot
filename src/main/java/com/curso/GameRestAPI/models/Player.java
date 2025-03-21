package com.curso.GameRestAPI.models;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.*;

@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "players")
@ToString
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPlayer;

    @Nonnull
    @Column(nullable = false)
    private String name;


    @NonNull
    @ManyToOne @JoinColumn
    private Game favoriteGame;

}
