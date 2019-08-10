package edu.mum.cs.cs425.finalexam.wakandadrsystem.service;

import edu.mum.cs.cs425.finalexam.wakandadrsystem.model.Citizen;
import org.springframework.data.domain.Page;

public interface CitizenService {
    public Page<Citizen> getAllCitizens(int pageNo);
    public Citizen saveCitizen(Citizen p);
    public double calculateYearlyIncome();
}
