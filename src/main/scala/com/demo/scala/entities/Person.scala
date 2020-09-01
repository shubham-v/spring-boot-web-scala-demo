package com.demo.scala.entities

import javax.persistence.{Column, Entity, Table}

import scala.beans.BeanProperty

@Entity
@Table(name = "persons")
class Person extends BaseAbstractEntity {

  @BeanProperty
  @Column(name = "person_name", nullable = false)
  var name: String = _

}
