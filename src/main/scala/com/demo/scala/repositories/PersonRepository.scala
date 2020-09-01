package com.demo.scala.repositories;

import com.demo.scala.entities.Person
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository;

@Repository
trait PersonRepository extends CrudRepository[Person, Long] {
    def findByName(name: String): Person;
}
