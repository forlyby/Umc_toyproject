package com.example.hospital_reservation.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor
public class Patient {

    @Id
    private UUID patientId;

    private String patientName;
    private int age;
    private String gender;
}

