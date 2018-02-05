package com.dojo.example.controller;

import com.dojo.example.model.Ability;
import com.dojo.example.model.HeroEntity;
import com.dojo.example.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.List;

@Component
@Path("/api")
public class OverWatchController
{
    @Autowired
    private HeroService heroService;

    @GET
    @Path("/heros/{hero_id}")
    @Produces(MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<HeroEntity> findOneHero(@PathParam("hero_id") Long id)
    {
        HeroEntity heroEntity = heroService.findOne(id);
        if (heroEntity == null)
        {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(heroEntity);
    }

    @GET
    @Path("/abilities")
    @Produces(MediaType.APPLICATION_JSON_VALUE)
    public List<Ability> findAllAbilities()
    {
        return heroService.findAllAbilities();
    }

    @GET
    @Path("/{hero_id}/abilities")
    @Produces(MediaType.APPLICATION_JSON_VALUE)
    public HeroEntity findHeroAbilities(@PathParam("hero_id") Long id)
    {
        return heroService.findHeroAbilities(id);
    }

    @GET
    @Path("/abilities/{hero_id}")
    @Produces(MediaType.APPLICATION_JSON_VALUE)
    public Ability findAbility(@PathParam("hero_id") Long id)
    {
        return heroService.findAbility(id);
    }
}
