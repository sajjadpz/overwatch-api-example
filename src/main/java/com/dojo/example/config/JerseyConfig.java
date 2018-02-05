package com.dojo.example.config;

import com.dojo.example.controller.OverWatchController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig
{
    public JerseyConfig() {
        register(OverWatchController.class);
    }
}
