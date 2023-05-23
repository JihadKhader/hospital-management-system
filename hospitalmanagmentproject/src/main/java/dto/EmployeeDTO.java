package dto;

public class EmployeeDTO {
	private Integer employeeId;
	private String employeeFirstName;
	private String employeeLastName;
	private String employeeBranch;
	private Integer employeeNumber;
	private String employeeShift;
	private Boolean employeeIsDoctor;

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeFirstName() {
		return employeeFirstName;
	}

	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}

	public String getEmployeeLastName() {
		return employeeLastName;
	}

	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}

	public String getEmployeeBranch() {
		return employeeBranch;
	}

	public void setEmployeeBranch(String employeeBranch) {
		this.employeeBranch = employeeBranch;
	}

	public Integer getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(Integer employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getEmployeeShift() {
		return employeeShift;
	}

	public void setEmployeeShift(String employeeShift) {
		this.employeeShift = employeeShift;
	}

	public Boolean getEmployeeIsDoctor() {
		return employeeIsDoctor;
	}

	public void setEmployeeIsDoctor(Boolean employeeIsDoctor) {
		this.employeeIsDoctor = employeeIsDoctor;
	}

}
