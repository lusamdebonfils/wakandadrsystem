package edu.mum.cs.cs425.finalexam.wakandadrsystem.model;

import lombok.Data;
import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int stateId;

    @Column(nullable = false)
    private String stateCode;

    @Column(nullable = false)
    private String stateName;

    public State() {
    }

    public State(String stateCode, String stateName) {
        this.stateCode = stateCode;
        this.stateName = stateName;
    }

    public int getStateId() {
        return stateId;
    }

    public void setStateId(int stateId) {
        this.stateId = stateId;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    @Override
    public String toString() {
        return "State{" +
                "stateId=" + stateId +
                ", stateCode='" + stateCode + '\'' +
                ", stateName='" + stateName + '\'' +
                '}';
    }
}
