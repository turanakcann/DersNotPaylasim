package com.dotuya.CourseNotes.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NoteRequestDTO {

    @NotBlank(message = "Başlık zorunlu")
    private String title;

    private String description;

    @NotBlank(message = "Dosya yolu zorunlu")
    private String filePath;

    @NotNull(message = "Yükleyen kullanıcı zorunlu")
    private Long uploadedBy;

    @NotNull(message = "Ders zorunlu")
    private Long courseId;


}
