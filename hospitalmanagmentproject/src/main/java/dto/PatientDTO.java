package dto;

public class PatientDTO {
	private Integer patientId;
	private Boolean emergencySituation;
	private String treatmentNeed;
	private String patientRecord;
	private Integer doctorId;
	private Integer receptionistId;
	private String medicineName;

	public Integer getPatientId() {
		return patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	public Boolean getEmergencySituation() {
		return emergencySituation;
	}

	public void setEmergencySituation(Boolean emergencySituation) {
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

	public Integer getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}

	public Integer getReceptionistId() {
		return receptionistId;
	}

	public void setReceptionistId(Integer receptionistId) {
		this.receptionistId = receptionistId;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

}
