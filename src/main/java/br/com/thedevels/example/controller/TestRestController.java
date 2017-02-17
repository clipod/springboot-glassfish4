/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.thedevels.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author Dell-Junior
 */
@RestController
@RequestMapping("/")
public class TestRestController {
    
    
    @GetMapping
    public String hello(){
        return "Hello Spring Boot!";
    }
    
}
