package com.bca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bca.entity.Student;

@Repository
public interface StudentRep extends JpaRepository<Student, Long> {
  
}
