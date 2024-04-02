/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.apiBackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author noel.renderos
 */
@Entity
@Getter
@Setter
public class Persona {
    @Id
    @GeneratedValue
    private Long id;
    
    private String name;
    private String email;
    
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Rol rol;
}
