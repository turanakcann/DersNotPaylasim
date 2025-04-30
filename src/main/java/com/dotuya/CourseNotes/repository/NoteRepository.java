package com.dotuya.CourseNotes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dotuya.CourseNotes.entity.Note;

public interface NoteRepository extends JpaRepository<Note, Long> {
}
