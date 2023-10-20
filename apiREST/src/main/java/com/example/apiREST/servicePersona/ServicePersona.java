package com.example.apiREST.servicePersona;

import com.example.apiREST.model.Persona;
import com.example.apiREST.model.PersonaDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ServicePersona {
    public ResponseEntity<List<Persona>> getAllPersona();
    public  ResponseEntity<Persona> getPersonaById(int id);
     public ResponseEntity<Persona>  addPersona(PersonaDto persona);
    public ResponseEntity<Persona>  updatePersona(PersonaDto personaDto, int id);
     public ResponseEntity<Persona>   deletePersona(int id);

}
