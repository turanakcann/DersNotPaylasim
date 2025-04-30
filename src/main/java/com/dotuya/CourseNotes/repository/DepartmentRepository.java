package com.dotuya.CourseNotes.repository;

import com.dotuya.CourseNotes.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
