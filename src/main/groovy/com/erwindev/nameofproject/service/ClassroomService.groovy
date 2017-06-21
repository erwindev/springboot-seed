package com.erwindev.nameofproject.service

import com.erwindev.nameofproject.dao.ClassroomRepo
import com.erwindev.nameofproject.domain.Classroom

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class ClassroomService {

  String whoAmI() {
      return "ClassroomService"
  }
}
