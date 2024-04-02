/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.apiBackend.controller;

import com.example.apiBackend.model.Persona;
import com.example.apiBackend.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author noel.renderos
 */
@RestController
public class PersonaController {
    
    @Autowired
    private PersonaRepository personaRepository;
    
    @GetMapping("/persona")
    List<Persona> getPersonas(){
        List<Persona> personaGet = personaRepository.findAll();
        
        for(Persona persona : personaGet){  
            System.out.println("=============================");
            System.out.println(persona.getName());       
            System.out.println(persona.getRol().getName());
            System.out.println("=============================");
        }
        
        return personaRepository.findAll();
    }
    
    @GetMapping("/personarol")
    List<Persona> getPersonaRol(){
        List<Persona> personaGet = personaRepository.findByRoleName();
        
        for(Persona persona : personaGet){   
            System.out.println("*****************************");
            System.out.println(persona.getName());       
            System.out.println(persona.getRol().getId());
            System.out.println(persona.getRol().getName());
            System.out.println("*****************************");
        }
        
        return personaRepository.findByRoleName();
    }
}
