package com.dojo.example.service;

import com.dojo.example.model.Ability;
import com.dojo.example.model.HeroEntity;
import com.dojo.example.repository.AbilityRepository;
import com.dojo.example.repository.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeroService
{
    @Autowired
    private HeroRepository heroRepository;

    @Autowired
    private AbilityRepository abilityRepository;

    public HeroEntity findOne(Long id)
    {
        return heroRepository.findOne(id);
    }

    public List<Ability> findAllAbilities()
    {
        return abilityRepository.findAll();
    }

    public HeroEntity findHeroAbilities(Long id)
    {
        return heroRepository.findOne(id);
    }

    public Ability findAbility(Long id)
    {
        return abilityRepository.findOne(id);
    }
}
