package com.dojo.example.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "heros")
public class HeroEntity
{
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "real_name")
    private String real_name;
    @Column(name = "health")
    private Integer health;
    @Column(name = "armour")
    private Integer armour;
    @Column(name = "shield")
    private Integer shield;

    /**
     * Used FetchType.EAGER because of LazyIntialization Exception
     */
    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            mappedBy = "hero")
    private Set<Ability> abilities = new HashSet<>();

    public HeroEntity()
    {
    }

    public HeroEntity(Long id,String name, String real_name, Integer health, Integer armour, Integer shield)
    {
        this.id = id;
        this.name = name;
        this.real_name = real_name;
        this.health = health;
        this.armour = armour;
        this.shield = shield;
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

    public String getReal_name()
    {
        return real_name;
    }

    public void setReal_name(String real_name)
    {
        this.real_name = real_name;
    }

    public Integer getHealth()
    {
        return health;
    }

    public void setHealth(Integer health)
    {
        this.health = health;
    }

    public Integer getArmour()
    {
        return armour;
    }

    public void setArmour(Integer armour)
    {
        this.armour = armour;
    }

    public Integer getShield()
    {
        return shield;
    }

    public void setShield(Integer shield)
    {
        this.shield = shield;
    }

    public Set<Ability> getAbilities()
    {
        return abilities;
    }

    public void setAbilities(Set<Ability> abilities)
    {
        this.abilities = abilities;
    }

}
