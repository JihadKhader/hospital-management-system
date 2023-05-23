package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "patient")
public class Patient {
	@Id
	@Column(name = "patient_id")
	private int patientId;

	@Column(name = "emergencySituation")
	private boolean emergencySituation;

	@Column(name = "treatmentNeed")
	private String treatmentNeed;

	@Column(name = "patientRecord")
	private String patientRecord;

	@ManyToOne
	@JoinColumn(name = "doctor_id")
	private Doctor doctor;

	@ManyToOne
	@JoinColumn(name = "receptionist_id")
	private Receptionist receptionist;

	@Column(name = "medicineName")
	private String medicineName;

	public Patient(int patientId, boolean emergencySituation, String treatmentNeed, String patientRecord, Doctor doctor,
			Receptionist receptionist, String medicineName) {
		super();
		this.patientId = patientId;
		this.emergencySituation = emergencySituation;
		this.treatmentNeed = treatmentNeed;
		this.patientRecord = patientRecord;
		this.doctor = doctor;
		this.receptionist = receptionist;
		this.medicineName = medicineName;
	}

	public Patient() {

	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public boolean isEmergencySituation() {
		return emergencySituation;
	}

	public void setEmergencySituation(boolean emergencySituation) {
		this.emergencySituation = emergencySituation;
	}

	public String getTreatmentNeed() {
		return treatmentNeed;
	}

	public void setTreatmentNeed(String treatmentNeed) {
		this.treatmentNeed = treatmentNeed;
	}

	public String getPatientRecord() {
		return patientRecord;
	}

	public void setPatientRecord(String patientRecord) {
		this.patientRecord = patientRecord;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Receptionist getReceptionist() {
		return receptionist;
	}

	public void setReceptionist(Receptionist receptionist) {
		this.receptionist = receptionist;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

}