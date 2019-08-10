package edu.mum.cs.cs425.finalexam.wakandadrsystem.service.impl;

import edu.mum.cs.cs425.finalexam.wakandadrsystem.model.Citizen;
import edu.mum.cs.cs425.finalexam.wakandadrsystem.repository.CitizenRepository;
import edu.mum.cs.cs425.finalexam.wakandadrsystem.service.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitizenServiceImplementation implements CitizenService {
    @Autowired
    public CitizenRepository citizenRepository;
    @Override
    public Page<Citizen> getAllCitizens(int pageNo) {
        return citizenRepository.findAll(PageRequest.of(pageNo, 3, Sort.by("firstName")));
    }

    @Override
    public Citizen saveCitizen(Citizen p) {
        return citizenRepository.save(p);
    }

    @Override
    public double calculateYearlyIncome() {
        List<Citizen> citizens = citizenRepository.findAll();
        double sum = 0.0;
        for (Citizen citizen: citizens){
            sum += citizen.getYearlyIncome();
        }
        return sum;
    }
}
