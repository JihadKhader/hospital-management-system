package mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import dto.PatientDTO;
import model.Patient;
import model.Receptionist;
import model.Doctor;

@Component
public class PatientMapper {

	private final DoctorMapper doctorMapper;
	private final ReceptionistMapper receptionistMapper;

	public PatientMapper(DoctorMapper doctorMapper, ReceptionistMapper receptionistMapper) {
		this.doctorMapper = doctorMapper;
		this.receptionistMapper = receptionistMapper;
	}

	public PatientDTO toDTO(Patient patient) {
		PatientDTO patientDTO = new PatientDTO();
		patientDTO.setPatientId(patient.getPatientId());
		patientDTO.setEmergencySituation(patient.isEmergencySituation());
		patientDTO.setTreatmentNeed(patient.getTreatmentNeed());
		patientDTO.setPatientRecord(patient.getPatientRecord());
		patientDTO.setDoctorId(patient.getDoctor().getDoctorId());
		patientDTO.setReceptionistId(patient.getReceptionist().getReceptionistId());
		patientDTO.setMedicineName(patient.getMedicineName());
		return patientDTO;
	}

	public Patient toEntity(PatientDTO patientDTO) {
		Patient patient = new Patient();
		patient.setPatientId(patientDTO.getPatientId());
		patient.setEmergencySituation(patientDTO.getEmergencySituation());
		patient.setTreatmentNeed(patientDTO.getTreatmentNeed());
		patient.setPatientRecord(patientDTO.getPatientRecord());
		Doctor doctor = new Doctor();
		doctor.setDoctorId(patientDTO.getDoctorId());
		patient.setDoctor(doctor);
		Receptionist receptionist = new Receptionist();
		receptionist.setReceptionistId(patientDTO.getReceptionistId());
		patient.setReceptionist(receptionist);
		patient.setMedicineName(patientDTO.getMedicineName());
		return patient;
	}

	public void updateEntity(PatientDTO patientDTO, Patient patient) {
		patient.setEmergencySituation(patientDTO.getEmergencySituation());
		patient.setTreatmentNeed(patientDTO.getTreatmentNeed());
		patient.setPatientRecord(patientDTO.getPatientRecord());
		patient.setMedicineName(patientDTO.getMedicineName());
	}

	public Patient toEntity(PatientDTO patientDTO, Doctor doctor, Receptionist receptionist) {
		Patient patient = toEntity(patientDTO);
		patient.setDoctor(doctor);
		patient.setReceptionist(receptionist);
		return patient;
	}

	public List<PatientDTO> toDTOList(List<Patient> entities) {
		return entities.stream().map(this::toDTO).collect(Collectors.toList());
	}
}
