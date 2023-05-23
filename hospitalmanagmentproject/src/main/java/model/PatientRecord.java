package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "patientRecord")
public class PatientRecord {
	@Id
	@Column(name = "record_id")
	private int recordId;

	@Column(name = "patient_firstName")
	private String patientFirstName;

	@Column(name = "patient_lastName")
	private String patientLastName;

	@Column(name = "recordDate")
	private String recordDate;

	@Column(name = "previousDiseases")
	private String previousDiseases;

	@Column(name = "bloodType")
	private String bloodType;

	@Column(name = "medicineTake")
	private String medicineTake;

	@Column(name = "previousEntries")
	private String previousEntries;

	@Column(name = "allergy")
	private String allergy;

	@ManyToOne
	@JoinColumn(name = "patient_id")
	private Patient patient;

	public PatientRecord(int recordId, String patientFirstName, String patientLastName, String recordDate,
			String previousDiseases, String bloodType, String medicineTake, String previousEntries, String allergy,
			Patient patient) {
		super();
		this.recordId = recordId;
		this.patientFirstName = patientFirstName;
		this.patientLastName = patientLastName;
		this.recordDate = recordDate;
		this.previousDiseases = previousDiseases;
		this.bloodType = bloodType;
		this.medicineTake = medicineTake;
		this.previousEntries = previousEntries;
		this.allergy = allergy;
		this.patient = patient;
	}

	public int getRecordId() {
		return recordId;
	}

	public void setRecordId(int recordId) {
		this.recordId = recordId;
	}

	public String getPatientFirstName() {
		return patientFirstName;
	}

	public void setPatientFirstName(String patientFirstName) {
		this.patientFirstName = patientFirstName;
	}

	public String getPatientLastName() {
		return patientLastName;
	}

	public void setPatientLastName(String patientLastName) {
		this.patientLastName = patientLastName;
	}

	public String getRecordDate() {
		return recordDate;
	}

	public void setRecordDate(String recordDate) {
		this.recordDate = recordDate;
	}

	public String getPreviousDiseases() {
		return previousDiseases;
	}

	public void setPreviousDiseases(String previousDiseases) {
		this.previousDiseases = previousDiseases;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public String getMedicineTake() {
		return medicineTake;
	}

	public void setMedicineTake(String medicineTake) {
		this.medicineTake = medicineTake;
	}

	public String getPreviousEntries() {
		return previousEntries;
	}

	public void setPreviousEntries(String previousEntries) {
		this.previousEntries = previousEntries;
	}

	public String getAllergy() {
		return allergy;
	}

	public void setAllergy(String allergy) {
		this.allergy = allergy;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

}