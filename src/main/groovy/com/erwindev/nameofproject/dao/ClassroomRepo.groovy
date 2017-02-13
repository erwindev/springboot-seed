package com.erwindev.nameofproject.dao

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

import com.erwindev.nameofproject.domain.Classroom;

@Repository
interface ClassroomRepo extends JpaRepository<Classroom, Long>{
}
