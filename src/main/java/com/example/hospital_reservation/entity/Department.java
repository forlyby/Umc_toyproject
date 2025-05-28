package com.example.hospital_reservation.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor
public class Department {

    @Id
    private UUID departmentId;

    private String departmentName;
    private String phone;

    @ManyToOne
    @JoinColumn(name = "hospitalId")
    private Hospital hospital;
}
