package repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.PatientRecord;

@Repository
public interface PatientRecordRepository extends JpaRepository<PatientRecord, Integer> {
	Optional<PatientRecord> getPatientRecordById(int recordId);
}
