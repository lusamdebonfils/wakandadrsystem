package edu.mum.cs.cs425.finalexam.wakandadrsystem.service.impl;

import edu.mum.cs.cs425.finalexam.wakandadrsystem.model.State;
import edu.mum.cs.cs425.finalexam.wakandadrsystem.repository.StateRepository;
import edu.mum.cs.cs425.finalexam.wakandadrsystem.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateServiceImplementation implements StateService {

    @Autowired
    public StateRepository stateRepository;

    @Override
    public List<State> getAllStates() {
        return stateRepository.findAll(Sort.by("stateName"));
    }
}
