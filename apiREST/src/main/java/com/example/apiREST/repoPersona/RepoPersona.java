package com.example.apiREST.repoPersona;

import com.example.apiREST.model.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepoPersona extends CrudRepository<Persona, Integer> {


    List<Persona> findAll();

}
