package com.example.apiREST.controllerPersona;

import com.example.apiREST.model.Persona;
import com.example.apiREST.model.PersonaDto;
import com.example.apiREST.servicePersona.ServicePersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class ControllerPersona {
     @Autowired
     private ServicePersona servicePersona;
     @GetMapping("/persona")
     public ResponseEntity<List<Persona>> getAllPersona(){
         return servicePersona.getAllPersona();
     }
     @GetMapping("/persona/{id}")
     public ResponseEntity<Persona> getPersonaById(@PathVariable int id){
         return servicePersona.getPersonaById(id);
     }
     @PostMapping("/persona")
     public ResponseEntity<Persona>  addPersona(@RequestBody PersonaDto personaDto){
         return servicePersona.addPersona(personaDto);
     }
     @PutMapping("/persona/{id}")
     public ResponseEntity<Persona>  updatePersona(@RequestBody PersonaDto personaDto, @PathVariable int id){
         return servicePersona.updatePersona(personaDto, id);
     }
     @DeleteMapping("/persona/{id}")
     public ResponseEntity<Persona>   deletePersona(@PathVariable int id){
         return servicePersona.deletePersona(id);
     }

}
