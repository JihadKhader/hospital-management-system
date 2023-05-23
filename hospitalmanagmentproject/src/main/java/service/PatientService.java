package service;

import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import dto.PatientDTO;

public interface PatientService {
	PatientDTO getPatientById(Integer patientId) throws NotFoundException;

	List<PatientDTO> getAllPatients();

	PatientDTO createPatient(PatientDTO patientDTO);

	PatientDTO updatePatient(Integer patientId, PatientDTO patientDTO) throws NotFoundException;

	void deletePatient(Integer patientId) throws NotFoundException;
}
