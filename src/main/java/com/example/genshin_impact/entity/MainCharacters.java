package com.example.genshin_impact.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "characters")
public class MainCharacters {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String bio;
    private String[] combo;
    private String[] skills;
}
