/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.apiBackend.repository;

import com.example.apiBackend.model.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author noel.renderos
 */
@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
    
    @Query("SELECT p FROM Persona p JOIN p.rol r WHERE r.name LIKE '%1%'")
    List<Persona> findByRoleName();
}
 