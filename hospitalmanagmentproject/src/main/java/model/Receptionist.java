package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "receptionist")
public class Receptionist {
	@Id
	@Column(name = "receptionist_id")
	private int receptionistId;

	@OneToOne
	@JoinColumn(name = "employee_id")
	private Employee employee;

	public int getReceptionistId() {
		return receptionistId;
	}

	public void setReceptionistId(int receptionistId) {
		this.receptionistId = receptionistId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Receptionist(int receptionistId, Employee employee) {
		super();
		this.receptionistId = receptionistId;
		this.employee = employee;
	}

	public Receptionist() {

	}

}