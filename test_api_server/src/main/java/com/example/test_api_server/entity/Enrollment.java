package com.example.test_api_server.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer eid;

    @ManyToOne
    @JoinColumn(name = "sid")
    private Student sid;

    @ManyToOne
    @JoinColumn(name = "sno")
    private Subject sno;
    
}