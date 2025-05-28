package com.example.hospital_reservation.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor
public class Hospital {

    @Id
    private UUID hospitalId;

    private String hospitalName;
    private String address;
}
