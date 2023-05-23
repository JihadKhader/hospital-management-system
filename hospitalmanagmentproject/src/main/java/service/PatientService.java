package service;

import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import dto.PatientDTO;
import model.Patient;

public interface PatientService {
	PatientDTO getPatientById(Integer patientId) throws NotFoundException;

	List<PatientDTO> getAllPatients();

	PatientDTO createPatient(Patient patient);

	PatientDTO updatePatient(Integer patientId, Patient patient) throws NotFoundException;

	boolean deletePatient(Integer patientId) throws NotFoundException;
}
