package com.example.api.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api.api.entities.Course;


public interface CourseDao extends JpaRepository<Course, Long>{

}