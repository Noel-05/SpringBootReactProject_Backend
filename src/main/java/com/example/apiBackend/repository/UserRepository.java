/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.apiBackend.repository;

import com.example.apiBackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author noel.renderos
 */
public interface UserRepository extends JpaRepository<User, Long>{
    
}
