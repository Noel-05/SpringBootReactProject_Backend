/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.apiBackend.exception;

/**
 *
 * @author noel.renderos
 */
public class UserNotFoundException extends RuntimeException {
    
    public UserNotFoundException(Long id){
        super("Could not find the user with id " + id);
    }
}
