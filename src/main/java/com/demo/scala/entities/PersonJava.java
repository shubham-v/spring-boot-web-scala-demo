package com.demo.scala.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

//@Entity
@Table(name = "persons")
public class PersonJava extends BaseAbstractEntity1 {

    @Column(name="person_name", nullable = false)
    private String name;

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public PersonJava(@JsonProperty("name") final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
