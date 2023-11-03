package com.example.genshin_impact.service;

import com.example.genshin_impact.entity.MK1Character;
import com.example.genshin_impact.repository.MK1CharacterRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class MK1CharacterService {

    private final MK1CharacterRepository mk1CharacterRepository;

    public MK1CharacterService(MK1CharacterRepository mk1CharacterRepository) {
        this.mk1CharacterRepository = mk1CharacterRepository;
    }
    // Метод для получения информации о персонаже Scorpion
    public MK1Character getScorpionDetails() {
        // Предположим, что у персонажа с именем "Scorpion" id = 1
        return mk1CharacterRepository.findById(1L).orElse(null);
    }

    // Метод для получения информации о персонаже Scorpion
    public MK1Character getSubZeroDetails() {
        // Предположим, что у персонажа с именем "Scorpion" id = 1
        return mk1CharacterRepository.findById(1L).orElse(null);
    }

    public MK1Character getJohnnyCageDetails(){
        return mk1CharacterRepository.findById(1L).orElse(null);
    }

    public MK1Character getLiuKangDetails(){
        return mk1CharacterRepository.findById(1L).orElse(null);
    }

    public List<MK1Character> getAllCharacters() {
        return mk1CharacterRepository.findAll();
    }

    public MK1Character getCharacterById(Long id) {
        return mk1CharacterRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Character not found"));
    }

    // Метод для получения всех персонажей
    public List<MK1Character> getAllMK1Characters() {
        return mk1CharacterRepository.findAll(); // Предполагается, что используется JPA и репозиторий
    }
}

