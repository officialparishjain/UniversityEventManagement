package com.parishjain.UniversityEventManagement.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer studentId;
    @NotNull(message = "First Name cannot be null...")
    @NotBlank(message = "First Name cannot be blank")
    @Pattern(regexp = "^[A-Z][a-zA-Z]*$",message = "First Letter Must be Capital...")
    private String studentFirstName;
    @Pattern(regexp = "^[A-Z][a-zA-Z]*$",message = "First Letter Must be Capital...")
    @NotNull(message = "Last Name cannot be null...")
    private String studentLastName;
    @Positive
    @Min(value = 18, message = "Age must be at least 18 years old")
    @Max(value = 25, message = "Age must be at most 25 years old")
    private Integer studentAge;
    //    Department ME,
    //    ECE,
    //    CIVIL,
    //    CSE,
    //    MCA
    @Enumerated(EnumType.STRING)
    private Department studentDepartment;
}
