package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {
	List<Patient> findByEmergencySituation(boolean emergencySituation);
}
