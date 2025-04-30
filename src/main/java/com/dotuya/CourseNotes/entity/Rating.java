package com.dotuya.CourseNotes.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ratings")
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "note_id")
    private Note note;

    @Column(name = "rating")
    @Min(value = 1, message = "Puanlama 1 ile 5 arasında olmalıdır")
    @Max(value = 5, message = "Puanlama 1 ile 5 arasında olmalıdır")
    private Integer rating;
}
