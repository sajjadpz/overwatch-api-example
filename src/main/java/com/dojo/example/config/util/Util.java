package com.dojo.example.config.util;


import com.dojo.example.config.SystemConfig;
import com.dojo.example.controller.dto.Datum;
import com.dojo.example.controller.dto.Hero;
import com.dojo.example.model.Ability;
import com.dojo.example.model.HeroEntity;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class Util
{
    @Autowired
    private SystemConfig systemConfig;


    public HeroEntity convertToEntity(Datum datum) throws ParseException
    {
        Hero hero = datum.getHero();

        HeroEntity heroEntity = new HeroEntity();

        /**
         * set Hero's attributes
         */

        heroEntity.setId(hero.getId());
        heroEntity.setName(hero.getName());
        heroEntity.setReal_name(hero.getRealName());
        heroEntity.setHealth(hero.getHealth());
        heroEntity.setArmour(hero.getArmour());
        heroEntity.setShield(hero.getShield());


        /**
         * set Hero's abilities
         */
        Ability ability = new Ability();
        ability.setName(datum.getName());
        ability.setDescription(datum.getDescription());
        ability.setId(datum.getId());

        ability.setHero(heroEntity);

        heroEntity.getAbilities().add(ability);

//        return systemConfig.modelMapper().map(hero, HeroEntity.class);
        return heroEntity;
    }
}
