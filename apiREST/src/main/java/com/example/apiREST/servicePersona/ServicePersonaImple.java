package com.example.apiREST.servicePersona;

import com.example.apiREST.model.Persona;
import com.example.apiREST.model.PersonaDto;
import com.example.apiREST.repoPersona.RepoPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicePersonaImple implements ServicePersona{

    @Autowired
    private RepoPersona repoPersona;

    @Override
    public ResponseEntity<List<Persona>> getAllPersona() {
        return  ResponseEntity.ok(repoPersona.findAll());
    }

    @Override
    public ResponseEntity<Persona> getPersonaById(int id) {
        return  ResponseEntity.ok(repoPersona.findById(id).get());
    }

    @Override
    public ResponseEntity<Persona>   addPersona(PersonaDto personaDto) {

        Persona persona1 = new Persona(personaDto.getNombre(), personaDto.getApellido(), personaDto.getEdad());
        return ResponseEntity.ok(repoPersona.save(persona1));
    }

    @Override
    public ResponseEntity<Persona> updatePersona(PersonaDto personaDto, int id) {
        Optional<Persona> persona = repoPersona.findById(id);
        if(persona.isPresent()){
            Persona persona1 = persona.get();
            persona1.setNombre(personaDto.getNombre());
            persona1.setApellido(personaDto.getApellido());
            persona1.setEdad(personaDto.getEdad());
            repoPersona.save(persona1);
        }else {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(persona.get());
    }

    @Override
    public ResponseEntity<Persona>   deletePersona(int id) {
        Optional<Persona> persona = repoPersona.findById(id);

        if(persona.isPresent()){
            repoPersona.deleteById(id);



        }else {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(persona.get());
    }
}
