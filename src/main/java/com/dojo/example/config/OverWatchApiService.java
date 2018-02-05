package com.dojo.example.config;

import com.dojo.example.controller.dto.OverWatchResponse;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
public class OverWatchApiService
{
    //TODO: read it from application.properties
    private static final String HERO_URL =
            "https://overwatch-api.net/api/v1/ability/";

    private final RestTemplate restTemplate;

    public OverWatchApiService(RestTemplateBuilder restTemplateBuilder)
    {
        this.restTemplate = restTemplateBuilder.build();
    }

    public OverWatchResponse fethcAllHeros()
    {
        /**
         * Adding user agent , since request is failing with bellow error
         * resulted in 403 (Forbidden); invoking error handler
         * https://stackoverflow.com/a/38859776/3349973
         */
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

        return exchangeAsList(HERO_URL, entity, new ParameterizedTypeReference<OverWatchResponse>()
        {
        });
    }

    private OverWatchResponse exchangeAsList(String uri, HttpEntity<String> entity, ParameterizedTypeReference<OverWatchResponse> responseType)
    {
        return restTemplate.exchange(uri, HttpMethod.GET, entity, responseType).getBody();
    }
}
