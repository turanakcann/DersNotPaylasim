package com.dotuya.CourseNotes.repository;

import com.dotuya.CourseNotes.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<Rating, Long> {
}
