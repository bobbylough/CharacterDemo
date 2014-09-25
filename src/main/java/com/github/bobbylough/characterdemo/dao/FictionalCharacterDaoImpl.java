package com.github.bobbylough.characterdemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.Transactional;

import com.github.bobbylough.characterdemo.model.FictionalCharacter;

@Transactional
public class FictionalCharacterDaoImpl {
	@PersistenceContext
    private EntityManager em;
     
    public Long save(FictionalCharacter character) {
        em.persist(character);
        return character.getId();
    }
     
    public List<FictionalCharacter>getAll() {
        return em.createQuery("SELECT c FROM FictionalCharacter c", FictionalCharacter.class).getResultList();
    }
}
