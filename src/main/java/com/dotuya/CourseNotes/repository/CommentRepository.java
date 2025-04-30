package com.dotuya.CourseNotes.repository;

import com.dotuya.CourseNotes.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
