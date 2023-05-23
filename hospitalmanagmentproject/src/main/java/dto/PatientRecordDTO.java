package dto;

public class PatientRecordDTO {
	private Integer recordId;
	private String patientFirstName;
	private String patientLastName;
	private String recordDate;
	private String previousDiseases;
	private String bloodType;
	private String medicineTake;
	private String previousEntries;
	private String allergy;
	private Integer patientId;

	public Integer getRecordId() {
		return recordId;
	}

	public void setRecordId(Integer recordId) {
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

	public Integer getPatientId() {
		return patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

}
