package edu.mum.cs.cs425.finalexam.wakandadrsystem.repository;

import edu.mum.cs.cs425.finalexam.wakandadrsystem.model.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitizenRepository extends JpaRepository<Citizen,Long> {
}
