package com.dojo.example.controller.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "description",
        "is_ultimate",
        "url",
        "hero"
})
public class Datum {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("is_ultimate")
    private Boolean isUltimate;
    @JsonProperty("url")
    private String url;
    @JsonProperty("hero")
    private Hero hero;

    /**
     * No args constructor for use in serialization
     *
     */
    public Datum() {
    }

    /**
     *
     * @param isUltimate
     * @param id
     * @param hero
     * @param description
     * @param name
     * @param url
     */
    public Datum(Long id, String name, String description, Boolean isUltimate, String url, Hero hero) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.isUltimate = isUltimate;
        this.url = url;
        this.hero = hero;
    }

    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("is_ultimate")
    public Boolean getIsUltimate() {
        return isUltimate;
    }

    @JsonProperty("is_ultimate")
    public void setIsUltimate(Boolean isUltimate) {
        this.isUltimate = isUltimate;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("hero")
    public Hero getHero() {
        return hero;
    }

    @JsonProperty("hero")
    public void setHero(Hero hero) {
        this.hero = hero;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("name", name).append("description", description).append("isUltimate", isUltimate).append("url", url).append("hero", hero).toString();
    }

}
