package dto;

import java.time.LocalDateTime;

public class SessionDTO {
    private Integer sessionId;
    private LocalDateTime sessionTime;
    private Integer roomNumber;
	private Integer doctorId;
	private Integer patientId;
	public Integer getSessionId() {
		return sessionId;
	}
	public void setSessionId(Integer sessionId) {
		this.sessionId = sessionId;
	}
	public LocalDateTime getSessionTime() {
		return sessionTime;
	}
	public void setSessionTime(LocalDateTime sessionTime) {
		this.sessionTime = sessionTime;
	}
	public Integer getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	public Integer getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}
	public Integer getPatientId() {
		return patientId;
	}
	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

}
