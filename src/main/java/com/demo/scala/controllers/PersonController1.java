package com.demo.scala.controllers;

import com.demo.scala.entities.PersonJava;
import com.demo.scala.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("/person")
public class PersonController1 {

//    @Autowired
    private PersonRepository personRepository;

//    @PostMapping
    public PersonJava newPerson(@RequestBody final PersonJava person) {
        return /*this.personRepository.save(person)*/ null;
    }

}
