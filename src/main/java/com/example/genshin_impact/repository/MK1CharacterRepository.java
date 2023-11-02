package com.example.genshin_impact.repository;

import com.example.genshin_impact.entity.MK1Character;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MK1CharacterRepository extends JpaRepository<MK1Character, Long> {
}
