package com.erwindev.nameofproject.domain

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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.erwindev.nameofproject.domain.Classroom

@ToString
@Entity
@Table(name="student", schema="template")
class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id

	String firstName
	String lastName
	String grade
	Date enrolledDate

	@ManyToOne
	@JsonIgnore
	Classroom owner
}
