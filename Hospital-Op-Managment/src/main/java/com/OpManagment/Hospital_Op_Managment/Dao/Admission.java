package com.OpManagment.Hospital_Op_Managment.Dao;

import jakarta.persistence.*;

@Entity
@Table(name = "admission")
public class Admission {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer patientId;
    private Integer wardId;
    private Integer bedNumber;

    // Default constructor
    public Admission() {}

    // Constructor to directly pass patient ID, ward ID, and bed number
    public Admission(Integer patientId, Integer wardId, Integer bedNumber) {
        this.patientId = patientId;
        this.wardId = wardId;
        this.bedNumber = bedNumber;
    }

    // Constructor to create Admission from Patient and Ward entities
    public Admission(EntityClass patient, Word ward, Integer bedNumber) {
        this.patientId = patient.getId();  // Assuming EntityClass has getId() method
        this.wardId = ward.getId();        // Assuming Word has getId() method
        this.bedNumber = bedNumber;
    }

    // Getters and setters
    public Integer getId() {
        return id;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public Integer getWardId() {
        return wardId;
    }

    public Integer getBedNumber() {
        return bedNumber;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public void setWardId(Integer wardId) {
        this.wardId = wardId;
    }

    public void setBedNumber(Integer bedNumber) {
        this.bedNumber = bedNumber;
    }
}
