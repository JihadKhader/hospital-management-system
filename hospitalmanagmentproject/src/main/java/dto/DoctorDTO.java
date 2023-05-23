package dto;

public class DoctorDTO {
	private Integer doctorId;
	private Integer employeeId;
	private Boolean doctorIsAvailable;
	private String doctorSection;
	private Integer doctorRoomNumber;

	public Integer getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public Boolean getDoctorIsAvailable() {
		return doctorIsAvailable;
	}

	public void setDoctorIsAvailable(Boolean doctorIsAvailable) {
		this.doctorIsAvailable = doctorIsAvailable;
	}

	public String getDoctorSection() {
		return doctorSection;
	}

	public void setDoctorSection(String doctorSection) {
		this.doctorSection = doctorSection;
	}

	public Integer getDoctorRoomNumber() {
		return doctorRoomNumber;
	}

	public void setDoctorRoomNumber(Integer doctorRoomNumber) {
		this.doctorRoomNumber = doctorRoomNumber;
	}

}
