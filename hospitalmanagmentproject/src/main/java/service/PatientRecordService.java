package service;

import java.util.List;

import dto.PatientRecordDTO;

public interface PatientRecordService {
	PatientRecordDTO getPatientRecordById(Integer recordId);

	List<PatientRecordDTO> getAllPatientRecords();

	PatientRecordDTO createPatientRecord(PatientRecordDTO patientRecordDTO);

	PatientRecordDTO updatePatientRecord(Integer recordId, PatientRecordDTO patientRecordDTO);

	void deletePatientRecord(Integer recordId);
}
