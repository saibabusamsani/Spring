package com.student.repository;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.entity.StudentInformation;

public interface StudentRepository extends JpaRepository<StudentInformation, Id> {

}
