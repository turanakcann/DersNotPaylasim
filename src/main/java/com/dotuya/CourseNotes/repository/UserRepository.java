package com.dotuya.CourseNotes.repository;

import com.dotuya.CourseNotes.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
