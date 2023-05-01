package com.parishjain.UniversityEventManagement.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer eventId;
    @NotBlank
    @NotNull
    private String eventName;
    @NotNull
    private String eventLocation;
    @NotNull
    private LocalDate eventDate;
    private LocalTime eventStartTime;
    private LocalTime eventEndTime;
}
