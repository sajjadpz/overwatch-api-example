package com.dojo.example;

import com.dojo.example.config.OverWatchApiService;
import com.dojo.example.config.util.Util;
import com.dojo.example.controller.dto.Datum;
import com.dojo.example.controller.dto.OverWatchResponse;
import com.dojo.example.model.HeroEntity;
import com.dojo.example.repository.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner
{
    @Autowired
    private OverWatchApiService overWatchApiService;

    @Autowired
    private Util util;

    @Autowired
    private HeroRepository heroRepository;

    public static void main(String[] args)
    {
        SpringApplication.run(DemoApplication.class, args);
    }

    private void saveHero(){

        /**
         * Drop database for testing purposes
         */

        heroRepository.deleteAll();

        OverWatchResponse response = overWatchApiService.fethcAllHeros();
        for (Datum datum : response.getData()){
            System.out.println("Hero:, "+datum.getHero());
            HeroEntity heroEntity = util.convertToEntity(datum);
            heroRepository.save(heroEntity);
        }
    }
    @Override
    public void run(String... strings) throws Exception
    {
        saveHero();
    }
}
