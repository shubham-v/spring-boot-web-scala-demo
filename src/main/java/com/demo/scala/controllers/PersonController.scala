package com.demo.scala.controllers

import com.demo.scala.entities.Person
import com.demo.scala.repositories.PersonRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{PostMapping, RequestBody, RequestMapping, RestController}

@RestController
@RequestMapping(Array("/person"))
class PersonController @Autowired() (private val personRepository: PersonRepository) {

  @PostMapping
  def newPerson(@RequestBody() person: Person): Person = {
    personRepository.save(person)
  }

}
