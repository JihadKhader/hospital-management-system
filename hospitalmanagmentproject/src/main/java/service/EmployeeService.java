package service;

import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import dto.EmployeeDTO;
import model.Employee;

public interface EmployeeService {
	EmployeeDTO getEmployeeById(Integer employeeId) throws NotFoundException;

	List<Employee> getAllEmployees();

	EmployeeDTO createEmployee(Employee employee);

	EmployeeDTO updateEmployee(Integer employeeId, Employee employee) throws NotFoundException;

	boolean deleteEmployee(Integer employeeId) throws NotFoundException;
}
