package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@Column(name = "employee_id")
	private int employeeId;

	@Column(name = "employee_firstName")
	private String firstName;

	@Column(name = "employee_lastName")
	private String lastName;

	@Column(name = "employee_branch")
	private String branch;

	@Column(name = "employee_number")
	private int employeeNumber;

	@Column(name = "employee_shift")
	private String shift;

	@Column(name = "employee_isDoctor")
	private boolean isDoctor;

	public Employee(int employeeId, String firstName, String lastName, String branch, int employeeNumber, String shift,
			boolean isDoctor) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.branch = branch;
		this.employeeNumber = employeeNumber;
		this.shift = shift;
		this.isDoctor = isDoctor;
	}

	public Employee() {

	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

	public boolean isDoctor() {
		return isDoctor;
	}

	public void setDoctor(boolean isDoctor) {
		this.isDoctor = isDoctor;
	}

}