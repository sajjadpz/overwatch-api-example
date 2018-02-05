package com.dojo.example.config;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SystemConfig
{

    /**
     * Use this when JSON POJO => JPA entity needed
     * @return
     */
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
