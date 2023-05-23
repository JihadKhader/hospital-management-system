package service;

import java.util.List;

import dto.PatientRecordDTO;
import model.PatientRecord;

public interface PatientRecordService {
	PatientRecordDTO getPatientRecordById(Integer recordId);

	List<PatientRecordDTO> getAllPatientRecords();

	PatientRecordDTO createPatientRecord(PatientRecord patientRecord);

	PatientRecordDTO updatePatientRecord(Integer recordId, PatientRecord patientRecord);

	boolean deletePatientRecord(Integer recordId);
}
