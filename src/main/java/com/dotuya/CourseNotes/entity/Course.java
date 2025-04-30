package com.dotuya.CourseNotes.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "course_code",nullable = false, length = 10)
    private String courseCode;

    @Column(name = "course_name",nullable = false,length = 100)
    private String courseName;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
}
