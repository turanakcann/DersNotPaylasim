package com.dotuya.CourseNotes.repository;

import com.dotuya.CourseNotes.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
