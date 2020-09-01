package com.demo.scala.entities

import java.util.Date

import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.{Column, EntityListeners, GeneratedValue, GenerationType, Id, MappedSuperclass, Temporal, TemporalType}
import org.springframework.data.annotation.{CreatedDate, LastModifiedDate}
import org.springframework.data.jpa.domain.support.AuditingEntityListener

import scala.beans.BeanProperty

@MappedSuperclass
@EntityListeners(Array(classOf[AuditingEntityListener]))
abstract class BaseAbstractEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @JsonIgnore
  @BeanProperty
  protected var id: Long = _

  @JsonIgnore
  @BeanProperty
  @CreatedDate
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "created_at", nullable = false, updatable = false)
  protected var createdAt: Date = _

  @BeanProperty
  @JsonIgnore
  @LastModifiedDate
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "updated_at", nullable = false)
  protected var updatedAt: Date = _

}
