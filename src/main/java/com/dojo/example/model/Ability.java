package com.dojo.example.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "abilities")
public class Ability
{
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Lob
    @Column(name = "description",length = 100000)
    private String description;

    @Column(name = "is_ultimate")
    private boolean is_ultimate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hero_id",nullable = false)
    @JsonIgnore
    private HeroEntity hero;

    public Ability()
    {
    }

    public Ability(Long id, String name, String description, boolean is_ultimate)
    {
        this.id = id;
        this.name = name;
        this.description = description;
        this.is_ultimate = is_ultimate;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public boolean is_ultimate()
    {
        return is_ultimate;
    }

    public void setIs_ultimate(boolean is_ultimate)
    {
        this.is_ultimate = is_ultimate;
    }

    public HeroEntity getHero()
    {
        return hero;
    }

    public void setHero(HeroEntity hero)
    {
        this.hero = hero;
    }
}
