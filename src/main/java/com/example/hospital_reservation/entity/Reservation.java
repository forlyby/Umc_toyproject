package com.example.hospital_reservation.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor
public class Reservation {

    @Id
    private UUID reservationId;

    @ManyToOne
    @JoinColumn(name = "patientId")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "hospitalId")
    private Hospital hospital;

    @ManyToOne
    @JoinColumn(name = "departmentId")
    private Department department;

    @ManyToOne
    @JoinColumn(name = "doctorId")
    private Doctor doctor;

    private LocalDateTime reservationTime;
    private boolean isCompleted;
}
