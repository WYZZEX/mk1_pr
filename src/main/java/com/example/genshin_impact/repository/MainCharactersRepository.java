package com.example.genshin_impact.repository;

import com.example.genshin_impact.entity.MainCharacters;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MainCharactersRepository extends JpaRepository<MainCharacters, Long> {

}
