package com.dojo.example.repository;

import com.dojo.example.model.Ability;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbilityRepository extends JpaRepository<Ability,Long>
{
}
