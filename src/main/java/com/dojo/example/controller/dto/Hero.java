package com.dojo.example.controller.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.persistence.Id;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "description",
        "health",
        "armour",
        "shield",
        "real_name",
        "age",
        "height",
        "affiliation",
        "base_of_operations",
        "difficulty",
        "url"
})
public class Hero {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("health")
    private Integer health;
    @JsonProperty("armour")
    private Integer armour;
    @JsonProperty("shield")
    private Integer shield;
    @JsonProperty("real_name")
    private String realName;
    @JsonProperty("age")
    private Integer age;
    @JsonProperty("height")
    private Object height;
    @JsonProperty("affiliation")
    private String affiliation;
    @JsonProperty("base_of_operations")
    private String baseOfOperations;
    @JsonProperty("difficulty")
    private Integer difficulty;
    @JsonProperty("url")
    private String url;

    /**
     * No args constructor for use in serialization
     *
     */
    public Hero() {
    }

    /**
     *
     * @param id
     * @param height
     * @param armour
     * @param description
     * @param baseOfOperations
     * @param age
     * @param name
     * @param difficulty
     * @param affiliation
     * @param realName
     * @param shield
     * @param health
     * @param url
     */
    public Hero(Long id, String name, String description, Integer health, Integer armour, Integer shield, String realName, Integer age, Object height, String affiliation, String baseOfOperations, Integer difficulty, String url) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.health = health;
        this.armour = armour;
        this.shield = shield;
        this.realName = realName;
        this.age = age;
        this.height = height;
        this.affiliation = affiliation;
        this.baseOfOperations = baseOfOperations;
        this.difficulty = difficulty;
        this.url = url;
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

    @JsonProperty("health")
    public Integer getHealth() {
        return health;
    }

    @JsonProperty("health")
    public void setHealth(Integer health) {
        this.health = health;
    }

    @JsonProperty("armour")
    public Integer getArmour() {
        return armour;
    }

    @JsonProperty("armour")
    public void setArmour(Integer armour) {
        this.armour = armour;
    }

    @JsonProperty("shield")
    public Integer getShield() {
        return shield;
    }

    @JsonProperty("shield")
    public void setShield(Integer shield) {
        this.shield = shield;
    }

    @JsonProperty("real_name")
    public String getRealName() {
        return realName;
    }

    @JsonProperty("real_name")
    public void setRealName(String realName) {
        this.realName = realName;
    }

    @JsonProperty("age")
    public Integer getAge() {
        return age;
    }

    @JsonProperty("age")
    public void setAge(Integer age) {
        this.age = age;
    }

    @JsonProperty("height")
    public Object getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(Object height) {
        this.height = height;
    }

    @JsonProperty("affiliation")
    public String getAffiliation() {
        return affiliation;
    }

    @JsonProperty("affiliation")
    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    @JsonProperty("base_of_operations")
    public String getBaseOfOperations() {
        return baseOfOperations;
    }

    @JsonProperty("base_of_operations")
    public void setBaseOfOperations(String baseOfOperations) {
        this.baseOfOperations = baseOfOperations;
    }

    @JsonProperty("difficulty")
    public Integer getDifficulty() {
        return difficulty;
    }

    @JsonProperty("difficulty")
    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("name", name).append("description", description).append("health", health).append("armour", armour).append("shield", shield).append("realName", realName).append("age", age).append("height", height).append("affiliation", affiliation).append("baseOfOperations", baseOfOperations).append("difficulty", difficulty).append("url", url).toString();
    }

}

