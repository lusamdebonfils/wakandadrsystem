package edu.mum.cs.cs425.finalexam.wakandadrsystem.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Citizen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long citizenId;


    @Column(nullable = false)
    private String ssn;

    @Column(nullable = false)
    private String firstName;

    private String middleName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;

    @Column(nullable = false)
    private double yearlyIncome;

    @ManyToOne(cascade = CascadeType.ALL)
    private State state;

    public Citizen() {
    }


    public Citizen(long citizenId, String ssn, String firstName, String middleName, String lastName, LocalDate dateOfBirth, double yearlyIncome, State state) {
        this.citizenId = citizenId;
        this.ssn = ssn;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.yearlyIncome = yearlyIncome;
        this.state = state;
    }

    public long getCitizenId() {
        return citizenId;
    }

    public void setCitizenId(long citizenId) {
        this.citizenId = citizenId;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getYearlyIncome() {
        return yearlyIncome;
    }

    public void setYearlyIncome(double yearlyIncome) {
        this.yearlyIncome = yearlyIncome;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
