package com.curso.GameRestAPI.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.Year;

@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity (name = "games")
public class Game {
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idGame;

    @Column(nullable = false)
    @NonNull
    private String title;

    @Column(nullable = false)
    @NonNull
    private String publisher;

    @Column(nullable = false)
    @NonNull
    private String gender;

    @Column(nullable = false)
    @NonNull
    private Year year;

}
