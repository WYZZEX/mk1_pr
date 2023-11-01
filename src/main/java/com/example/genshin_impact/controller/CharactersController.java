//package com.example.genshin_impact.controller;
//
//import com.example.genshin_impact.entity.MainCharacters;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import org.springframework.web.bind.annotation.*;
//import java.util.ArrayList;
//import java.util.List;
//
//@RestController
//@RequestMapping("/mortal-kombat/characters")
//public class CharactersController {
//
//    private final List<MainCharacters> characterList = new ArrayList<>();
//
//    // Получение списка всех персонажей
//    @GetMapping
//    public List<MainCharacters> getAllCharacters() {
//        return characterList;
//    }
//
//    // Получение информации о конкретном персонаже по ID
//    @GetMapping("/{id}")
//    public MainCharacters getCharacterById(@PathVariable int id) {
//        // Найти персонажа по ID
//        // Вернуть информацию о персонаже
//        return characterList.stream()
//                .filter(character -> character.getId() == id)
//                .findFirst()
//                .orElse(null);
//    }
//
//    // Добавление нового персонажа
//    @PostMapping
//    public MainCharacters addCharacter(@RequestBody MainCharacters newCharacter) {
//        // Добавить нового персонажа в список
//        characterList.add(newCharacter);
//        return newCharacter;
//    }
//
//    // Обновление информации о персонаже по ID
//    @PutMapping("/{id}")
//    public MainCharacters updateCharacter(@PathVariable int id, @RequestBody MainCharacters updatedCharacter) {
//        // Найти персонажа по ID
//        // Обновить информацию о персонаже
//        return updatedCharacter;
//    }
//
//    // Удаление персонажа по ID
//    @DeleteMapping("/{id}")
//    public void deleteCharacter(@PathVariable int id) {
//        // Найти персонажа по ID и удалить его из списка
//    }
//}