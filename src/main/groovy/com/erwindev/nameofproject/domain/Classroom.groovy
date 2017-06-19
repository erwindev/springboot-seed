package com.erwindev.nameofproject.domain

import java.util.Collection;

import groovy.transform.ToString

import javax.persistence.CascadeType
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany
import javax.persistence.Table

import com.erwindev.nameofproject.domain.Student
import com.fasterxml.jackson.annotation.JsonIgnore

@ToString
@Entity
@Table(name="classroom")
class Classroom {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id

	String name
	String roomNumber
	Date createdDate

	@OneToMany(mappedBy="owner")
	@JsonIgnore
	Collection<Student> students
}
