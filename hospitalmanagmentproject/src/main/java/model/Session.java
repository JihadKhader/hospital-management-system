package model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "session")
public class Session {
	@Id
	@Column(name = "session_id")
	private int sessionId;

	@Column(name = "session_time")
	private LocalDateTime sessionTime;

	@Column(name = "roomNumber")
	private int roomNumber;

	@ManyToOne
	@JoinColumn(name = "doctor_id")
	private Doctor doctor;

	@ManyToOne
	@JoinColumn(name = "patient_id")
	private Patient patient;

	public Session(int sessionId, LocalDateTime sessionTime, int roomNumber, Doctor doctor, Patient patient) {
		super();
		this.sessionId = sessionId;
		this.sessionTime = sessionTime;
		this.roomNumber = roomNumber;
		this.doctor = doctor;
		this.patient = patient;
	}

	public Session() {

	}

	public int getSessionId() {
		return sessionId;
	}

	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}

	public LocalDateTime getSessionTime() {
		return sessionTime;
	}

	public void setSessionTime(LocalDateTime sessionTime) {
		this.sessionTime = sessionTime;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

}