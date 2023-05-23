package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "doctor")
public class Doctor {
	@Id
	@Column(name = "doctor_id")
	private int doctorId;

	@OneToOne
	@JoinColumn(name = "employee_id")
	private Employee employee;

	@Column(name = "doctor_isAvailable")
	private boolean isAvailable;

	@Column(name = "doctor_section")
	private String section;

	@Column(name = "doctor_roomNumber")
	private int roomNumber;

	public Doctor(int doctorId, Employee employee, boolean isAvailable, String section, int roomNumber) {
		super();
		this.doctorId = doctorId;
		this.employee = employee;
		this.isAvailable = isAvailable;
		this.section = section;
		this.roomNumber = roomNumber;
	}

	public Doctor() {

	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

}