package com.example.hospital_reservation.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor
public class Doctor {

    @Id
    private UUID doctorId;

    private String doctorName;
    private int experienceYears;

    @ManyToOne
    @JoinColumn(name = "hospitalId")
    private Hospital hospital;

    @ManyToOne
    @JoinColumn(name = "departmentId")
    private Department department;
}