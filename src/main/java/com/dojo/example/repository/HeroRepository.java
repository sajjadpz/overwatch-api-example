package com.dojo.example.repository;


import com.dojo.example.model.HeroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface HeroRepository extends JpaRepository<HeroEntity, Long>
{
    @Transactional
    @Query(value = "select h.id, h.armour, h.health, h.name, h.real_name, h.shield from heros h",nativeQuery = true)
    List<HeroEntity> findHeroAbilities();
}
